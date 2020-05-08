package guii;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Profile extends JPanel  {
    private JButton backB;
    private JLabel aboutL, slashL;
    private JTextArea area;
    private BossFrame frame = null;




    public Profile(BossFrame frame){
        this.frame = frame;
        setSize(500,600);
        setLayout(null);
        setBackground(Color.darkGray);


        aboutL = new JLabel("About");
        aboutL.setForeground(Color.white);
        aboutL.setBounds(210,50,100,30);
        slashL = new JLabel("-------------------");
        slashL.setForeground(Color.white);
        slashL.setBounds(190,85,100,30);

        area = new JTextArea();
        area.setBounds(130,130,200,100);

        backB = new JButton("Back");
        backB.setBorder(new EtchedBorder(Color.GRAY,Color.BLACK));
        backB.setBounds(180,300,100,30);

        backB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.profile.setVisible(false);
                frame.menuContainer.setVisible(true);
            }
        });

        add(aboutL);
        add(slashL);
        add(backB);
        add(area);



    }
}
