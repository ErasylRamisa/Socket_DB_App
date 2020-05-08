package guii;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cw4 extends JPanel {
    private JButton morB, noonB, evB, backB;
    private BossFrame frame = null;


    public Cw4(BossFrame frame){
        this.frame = frame;
        setSize(500,600);
        setLayout(null);
        setBackground(Color.darkGray);

        morB = new JButton("12:00 - 16:00");
        morB.setBounds(170,100,200,30);

        noonB = new JButton("17:00 - 20:00");
        noonB.setBounds(170,150,200,30);

        evB = new JButton("20:00 - 24:00");
        evB.setBounds(170,200,200,30);

        backB = new JButton("Back");
        backB.setBounds(200,300,100,30);


        morB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.cw4.setVisible(false);
                frame.profile.setVisible(true);
            }
        });

        noonB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.cw4.setVisible(false);
                frame.profile.setVisible(true);
            }
        });

        evB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.cw4.setVisible(false);
                frame.profile.setVisible(true);
            }
        });

        backB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.cw4.setVisible(false);
                frame.carWash.setVisible(true);
            }
        });
        add(morB);
        add(noonB);
        add(evB);
        add(backB);

    }
}
