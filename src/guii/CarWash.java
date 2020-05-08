package guii;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

public class CarWash extends JPanel {
    private JLabel reg1,reg2;
    private JButton cw1,cw2,cw3,cw4, backB;
    private BossFrame frame = null;



    public CarWash(BossFrame frame){
        this.frame = frame;
        setSize(500,600);
        setLayout(null);
        setBackground(Color.darkGray);



        reg1 = new JLabel("Nauryzbaysky district");
        reg1.setForeground(Color.white);
        reg1.setBounds(150,100,200,30);

        cw1 = new JButton("WashCar");
        cw1.setBorder(new EtchedBorder(Color.GRAY,Color.BLACK));
        cw1.setBounds(170,150,100,30);

        cw2 = new JButton("Aqua");
        cw2.setBorder(new EtchedBorder(Color.GRAY,Color.BLACK));
        cw2.setBounds(170,200,100,30);

        reg2 = new JLabel("Bostandyk district");
        reg2.setForeground(Color.white);
        reg2.setBounds(150,250,200,30);

        cw3 = new JButton("LiquidCar");
        cw3.setBorder(new EtchedBorder(Color.GRAY,Color.BLACK));
        cw3.setBounds(170,300,100,30);

        cw4 = new JButton("QuickWash");
        cw4.setBorder(new EtchedBorder(Color.GRAY,Color.BLACK));
        cw4.setBounds(170,350,100,30);


        backB = new JButton("Back");
        backB.setBorder(new EtchedBorder(Color.GRAY,Color.BLACK));
        backB.setBounds(170,420,100,30);


        cw1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.carWash.setVisible(false);
                frame.cw1.setVisible(true);
            }
        });

        cw2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.carWash.setVisible(false);
                frame.cw2.setVisible(true);
            }
        });

        cw3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.carWash.setVisible(false);
                frame.cw3.setVisible(true);
            }
        });

        cw4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.carWash.setVisible(false);
                frame.cw4.setVisible(true);
            }
        });

        backB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.carWash.setVisible(false);
                frame.menuContainer.setVisible(true);
            }
        });

        add(reg1);
        add(reg2);
        add(cw1);
        add(cw2);
        add(cw3);
        add(cw4);
        add(backB);

    }

}
