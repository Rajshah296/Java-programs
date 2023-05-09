/*<body>
    <applet code="Prac_7.java" height="500" width="400">
    
    </applet>
</body>*/ 

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Prac_7 extends Applet {
    String msg="";
    public void init(){
        addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                msg = "Mouse Pressed.";
                setForeground(Color.red);
                repaint();
            }
            public void mouseReleased(MouseEvent e){
                msg = "Mouse Released.";
                setForeground(Color.GREEN);
                repaint();
            }
        });
    }
    public void paint(Graphics g){
        g.drawString(msg,100,100);

    }
}