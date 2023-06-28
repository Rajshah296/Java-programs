import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class Q_2_D_2 extends JApplet implements ActionListener{
    JLabel lbl1 = new JLabel("Reversed name");
    JLabel username = new JLabel("Username: ");
    JTextField jtf = new JTextField();
    JButton btn1 = new JButton("Enter");

    public void init(){
        add(lbl1);
        add(username);
        add(jtf);
        btn1.addActionListener(this);
        setLayout(new FlowLayout());
    }
    public void actionPerformed(ActionEvent e){
        StringBuffer s= new StringBuffer(lbl1.getText());
        username.setText(s.reverse().toString());
    }
}