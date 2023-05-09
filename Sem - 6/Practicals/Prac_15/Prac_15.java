/*
    <body>
        <applet code="Prac_15.class" height="200" width="200"></applet>
    </body>
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Prac_15 extends JApplet implements ActionListener{


    JLabel imgsJLabel = new JLabel();

    public void init(){

        Container ContentPane = getContentPane();
        ContentPane.setLayout(new BoxLayout(ContentPane, BoxLayout.Y_AXIS));
        ButtonGroup btngp1 = new ButtonGroup();
        JRadioButton[] rbs = {
            new JRadioButton("Bird"),
            new JRadioButton("Cat"),
            new JRadioButton("Dog"),
            new JRadioButton("Rabbit"),
            new JRadioButton("Pig")
        };
        for(JRadioButton item : rbs){
            btngp1.add(item);
            item.addActionListener(this);
            ContentPane.add(item);
        }
        ContentPane.add(Box.createVerticalGlue());
        add(imgsJLabel);
    }
    public void actionPerformed(ActionEvent e){
        String SelectedItem = ((JRadioButton) e.getSource()).getText();
        ImageIcon myimage = new ImageIcon(SelectedItem == "Bird" ? "bird.jpg" : SelectedItem == "Cat" ? "cat.png" : SelectedItem == "Dog" ? "dog.jpg" : SelectedItem == "Rabbit" ? "rabbit.jpg" : "pig.jpg");
        Image img = myimage.getImage();
        Image scaledimg = img.getScaledInstance(100,100 , Image.SCALE_SMOOTH); 
        ImageIcon scaledImg = new ImageIcon(scaledimg);
        imgsJLabel.setIcon(scaledImg);
    }

}