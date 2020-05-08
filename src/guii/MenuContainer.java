package guii;


import guii.Data.User;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MenuContainer extends JPanel {

    private JButton addB, listB, exitB, regB, profB, carB, login, signup;
    private JLabel nameL, numberL, titleL;
    private JLabel imgLabel = null;
    private JTextField nameT, numberT;
    private BossFrame frame = null;



    public MenuContainer(BossFrame frame) {
        this.frame = frame;
        setSize(800,450);
        setLayout(null);
        setBackground(Color.WHITE);





        titleL = new JLabel("ICarⓡ");
        titleL.setBounds(350,35,130,50);
        Font f1 = new Font(Font.SANS_SERIF,Font.BOLD,22);
        titleL.setFont(f1);

        nameL = new JLabel("Name");
        nameL.setBounds(250, 100, 150, 30);
        nameT = new JTextField();
        nameT.setBounds(300,100,150,30);


        numberL = new JLabel("Number");
        numberL.setBounds(250,150,150,30);
        numberT = new JTextField();
        numberT.setBounds(300,150,150,30);

        login = new JButton("Log in");
        login.setBounds(300,200,150,30);
        login.setBorder(new EtchedBorder(Color.GRAY,Color.BLACK));

        signup = new JButton("Sign up");
        signup.setBounds(300,250,150,30);
        signup.setBorder(new EtchedBorder(Color.GRAY,Color.BLACK));

        exitB = new JButton("EXIT");
        exitB.setBorder(new EtchedBorder(Color.GRAY,Color.BLACK));
        exitB.setBounds(320, 300, 100, 30);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(nameT.getText().isEmpty() || numberT.getText().isEmpty()){
                    JOptionPane.showMessageDialog(frame,"Fill whole fields");
                }
                else {
                    User u = new User();
                    u.setName(nameT.getText());
                    u.setNumber(numberT.getText());

                    User authUser = frame.clientSocket.toLogin(u);
                    if(authUser !=null){
                        JOptionPane.showMessageDialog(frame,"You are logged in!");
                        nameT.setText("");
                        numberT.setText("");
                    }
                    else {
                        JOptionPane.showMessageDialog(frame, "Incorrect login or number");
                    }
//                        frame.menuContainer.setVisible(false);
//                        frame.carWash.setVisible(true);

                }
            }
        });




        signup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.menuContainer.setVisible(false);
                frame.registrationContainer.setVisible(true);
            }
        });


        add(titleL);
        add(nameL);
        add(nameT);
        add(numberL);
        add(numberT);
        add(login);
        add(signup);
        add(exitB);




//        regB = new JButton("Registration");
//        regB.setBorder(new EtchedBorder(Color.GRAY,Color.BLACK));
//        regB.setBounds(100,100,200,50);
//        add(regB);

//        profB = new JButton("Profile");
//        profB.setBorder(new EtchedBorder(Color.GRAY,Color.BLACK));
//        profB.setBounds(100,200,200,50);
//        add(profB);

//        carB = new JButton("CarWash");
//        carB.setBorder(new EtchedBorder(Color.GRAY,Color.BLACK));
//        carB.setBounds(100,300,200,50);
//        add(carB);

//        exitB = new JButton("EXIT");
//        exitB.setBorder(new EtchedBorder(Color.GRAY,Color.BLACK));
//        exitB.setBounds(100, 400, 200, 50);
//        add(exitB);


//        regB.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                frame.menuContainer.setVisible(false);
//                frame.registrationContainer.setVisible(true);
//            }
//        });


//        profB.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                frame.menuContainer.setVisible(false);
//                frame.profile.setVisible(true);
//            }
//        });


//        carB.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                frame.menuContainer.setVisible(false);
//                frame.carWash.setVisible(true);
//            }
//        });


//        exitB.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.exit(0);
//            }
//        });
//    }
    }


}
