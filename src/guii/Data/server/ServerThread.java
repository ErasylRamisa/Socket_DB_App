package guii.Data.server;

import guii.Data.Packet;
import guii.Data.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerThread extends Thread {
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    public void run() {

        try {
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Packet packet = null;
            Packet packet2 = null;

            while ((packet = (Packet)ois.readObject()) != null){
                if(packet.getCode().equals("REG")){
                    User user = (User)packet.getData();
                    boolean reged = Server.registerUser(user);
                    if(reged == true)
                        packet2 = new Packet("SUCCESS");

                    else
                        packet2 = new Packet("ERROR");

                    oos.writeObject(packet2);
                }
                else
                    if(packet.getCode().equals("LOGIN")){
                        User user = (User)packet.getData();
                        User authUser = Server.loginUser(user);
                        if(authUser != null){
                            packet2 = new Packet("SUCCESS",authUser);
                        }
                        oos.writeObject(packet2);
                    }
            }
            ois.close();
            oos.close();
        } catch (Exception e) {
            {
                e.printStackTrace();
            }
        }
    }
}
