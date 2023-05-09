/*
    <body>
        <applet code="Prac_14.java" height="300" width="3000"></applet>
    </body>
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Prac_14 extends JApplet implements ActionListener{


    JComboBox cb1 = new JComboBox<String>(new String[]{"Symbols","Numbers","Alphabets"});

    JLabel imgsJLabel = new JLabel(new ImageIcon("Symbols.png"), JLabel.CENTER);

    public void actionPerformed(ActionEvent e){

        String SelectedItem = (String) cb1.getSelectedItem();
        ImageIcon myimage = new ImageIcon(SelectedItem == "Symbols" ? "Symbols.png" : SelectedItem == "Numbers" ? "Golden numbers.jpg" : "Alphabets.png");
        Image img = (myimage.getImage()).getScaledInstance(100,100 , Image.SCALE_SMOOTH); 
        ImageIcon scaledImg = new ImageIcon(img);
        imgsJLabel.setIcon(scaledImg);
    }

    public void init()
    {
        add(cb1);
        cb1.addActionListener(this);
        add(imgsJLabel);
        cb1.setPreferredSize(new Dimension(100, 50));
        cb1.setLocation(150,150);
        imgsJLabel.setLocation(getWidth()/2 - 100, getHeight()/2 - 100);
        setLayout(new FlowLayout());
    }

}