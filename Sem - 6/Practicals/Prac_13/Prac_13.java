/* 
    <body>
        <applet code="Prac_13.class" height="100" width="200" ></applet>
    </body>

 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Prac_13 extends JApplet {
    JTextField txt1 = new JTextField();
    

    public void init(){

        ImageIcon myimage = new ImageIcon("Indian Flag.png");
        Image img = myimage.getImage();
        Image scaledImg = img.getScaledInstance(50, 50,Image.SCALE_SMOOTH);
        ImageIcon Ind_flag = new ImageIcon(scaledImg);
        JLabel Ind_Flag = new JLabel(Ind_flag,JLabel.CENTER);


        myimage = new ImageIcon("Nepal_Flag.png");
        img = myimage.getImage();
        scaledImg = img.getScaledInstance(50, 50,Image.SCALE_SMOOTH);
        ImageIcon np_flag = new ImageIcon(scaledImg);
        JLabel NP_Flag = new JLabel(np_flag,JLabel.CENTER);  
        
        myimage = new ImageIcon("danish_Flag.jpg");
        img = myimage.getImage();
        scaledImg = img.getScaledInstance(50, 50,Image.SCALE_SMOOTH);
        ImageIcon danish_flag = new ImageIcon(scaledImg);
        JLabel Dan_Flag = new JLabel(danish_flag,JLabel.CENTER);


        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
        JLabel[] comp = {
            Ind_Flag,Dan_Flag,NP_Flag
        };
        for(JLabel item : comp){
            add(item);
            item.setAlignmentX(CENTER_ALIGNMENT);
            add(Box.createHorizontalGlue());
        }

        add(Box.createVerticalGlue());


        Ind_Flag.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                txt1.setText("India");
            }
        });   
        NP_Flag.addMouseListener(new MouseAdapter() {
            @Override     
            public void mouseClicked(MouseEvent e){
                txt1.setText("Nepal");
            }
        });   
        Dan_Flag.addMouseListener(new MouseAdapter() {
            @Override     
            public void mouseClicked(MouseEvent e){
                txt1.setText("Denmark");
            }
        });
        setVisible(true);
        add(txt1);
        txt1.setAlignmentX(CENTER_ALIGNMENT);
        txt1.setHorizontalAlignment(JTextField.CENTER);
    }
}