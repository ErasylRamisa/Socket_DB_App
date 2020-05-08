
//package guii;
//
//import java.sql.*;
//import java.util.ArrayList;
//
//public class Database {
//    public static void main(String[] args) {
//        Connection connection = null;
//
//        //SELECT
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            connection = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/user?useUnicode=true&serverTimezone=UTC","root","");
//        } catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//        }
//
//        PreparedStatement statement = null;
//        try {
//            statement = connection.prepareStatement("SELECT * FROM users");
//            ResultSet resultSet = statement.executeQuery();
//
//            ArrayList<guii.User> users = new ArrayList<User>();
//
//            while(resultSet.next()){
//                User u = new User();
//                u.setId(resultSet.getLong("id"));
//                u.setName(resultSet.getString("Name"));
//                u.setNumber(resultSet.getString("Number"));
//                u.setRole(resultSet.getString("Role"));
//
//                users.add(u);
//                System.out.println(users);
//            }
//            statement.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }





//    }
//}
