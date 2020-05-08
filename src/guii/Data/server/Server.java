package guii.Data.server;

import guii.Data.User;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;

public class Server {
    public static Connection connection;

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/carDB?useUnicode=true&serverTimezone=UTC", "root", "");
            ServerSocket ss = new ServerSocket(1998);

            while (true) {
                Socket s = ss.accept();
                ServerThread st = new ServerThread(s);
                st.start();
            }


        } catch (IOException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }


    }

    public static boolean registerUser(User user) {
        int rows = 0;


        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO users (id, name, number,role) VALUES (null, ?,?,?)");
            statement.setString(1, user.getName());
            statement.setString(2, user.getNumber());
            statement.setString(3, "USER");

            rows = statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (rows == 1)
            return true;

        return false;


    }

    public static User loginUser(User user) {
        User authUser = null;

        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE name = ? AND number = ? ");
            statement.setString(1, user.getName());
            statement.setString(2, user.getNumber());

            ResultSet result = statement.executeQuery();

            if(result.next()){
                authUser = new User(
                        result.getLong("id"),
                        result.getString("name"),
                        result.getString("number"),
                        result.getString("role")
                        );
            }
            statement.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
        return authUser;
    }
}

