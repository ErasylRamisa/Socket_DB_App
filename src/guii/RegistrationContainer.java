package guii;


import guii.Data.User;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.Year;

public class RegistrationContainer extends JPanel {
    private JButton backButton, RegButton;
    private JLabel nameL, numberL,titleL;
    private JTextField nameT, numberT;
    private BossFrame frame = null;

    public RegistrationContainer(BossFrame frame){
        this.frame = frame;
        setSize(800,450);
        setLayout(null);
        setBackground(Color.WHITE);


        titleL = new JLabel("Sign up");
        titleL.setBounds(330,35,130,50);
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

        RegButton = new JButton("Sign up");
        RegButton.setBounds(300,200,150,30);
        RegButton.setBorder(new EtchedBorder(Color.GRAY,Color.BLACK));

        backButton = new JButton("EXIT");
        backButton.setBorder(new EtchedBorder(Color.GRAY,Color.BLACK));
        backButton.setBounds(320, 250, 100, 30);


        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.registrationContainer.setVisible(false);
                frame.menuContainer.setVisible(true);
            }
        });

        RegButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(nameT.getText().isEmpty() || numberT.getText().isEmpty()){
                    JOptionPane.showMessageDialog(frame,"Fill whole fields");
                }
                else {
                    User u = new User();
                    u.setName(nameT.getText());
                    u.setNumber(numberT.getText());

                    boolean registered = frame.clientSocket.toRegister(u);
                    if(registered == true){
                        JOptionPane.showMessageDialog(frame,"You are registered!");
                        nameT.setText("");
                        numberT.setText("");

                        frame.registrationContainer.setVisible(false);
                        frame.carWash.setVisible(true);
                    }
                }
            }
        });




        add(nameL);
        add(numberL);
        add(nameT);
        add(numberT);
        add(RegButton);
        add(backButton);
        add(titleL);

    }
}
