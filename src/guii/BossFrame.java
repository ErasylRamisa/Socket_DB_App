package guii;

import guii.Client.network.ClientSocket;

import javax.swing.*;
import java.awt.*;

public class BossFrame extends JFrame {
    public  MenuContainer menuContainer;

    public  RegistrationContainer registrationContainer;
    public  Profile profile;
    public  CarWash carWash;
    public  Cw1 cw1;
    public  Cw2 cw2;
    public  Cw3 cw3;
    public  Cw4 cw4;
    public ClientSocket clientSocket;


    public BossFrame(){
        clientSocket = new ClientSocket();


        setTitle("ICar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setSize(800,450);
        setBackground(Color.WHITE);

        menuContainer = new MenuContainer(this);
        add(menuContainer);



        registrationContainer = new RegistrationContainer(this);
        registrationContainer.setVisible(false);
        add(registrationContainer);
//
//        profile = new Profile(this);
//        profile.setVisible(false);
//        add(profile);
//
//        carWash = new CarWash(this);
//        carWash.setVisible(false);
//        add(carWash);
//
//        cw1 = new Cw1(this);
//        cw1.setVisible(false);
//        add(cw1);
//
//        cw2 = new Cw2(this);
//        cw2.setVisible(false);
//        add(cw2);
//
//        cw3 = new Cw3(this);
//        cw3.setVisible(false);
//        add(cw3);
//
//        cw4 = new Cw4(this);
//        cw4.setVisible(false);
//        add(cw4);




    }
}
