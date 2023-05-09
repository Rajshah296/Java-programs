/* <body>
    <applet code="Prac_6.java" height="1000" width="1000"></applet
</body> */

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Prac_6 extends Applet implements ActionListener{

    Button button1 = new Button("Start");
    public void init(){
        add(button1);
        button1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button1.setLabel(button1.getLabel() == "Start" ? "Stop" : "Start");
    }
}