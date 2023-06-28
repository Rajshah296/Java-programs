

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/*
    <html>
    <body>
        <applet code="Q_2_D.class" height="300" width="300"></applet>
    </body>
    </html>
*/ 
public class Q_2_D extends JApplet implements MouseMotionListener{
    
    public void mouseMoved(MouseEvent e){
        setBackground(Color.RED);
    }
    public void mouseDragged(MouseEvent e){
        setBackground(Color.white);
    }
    public void init(){
        addMouseMotionListener(this);
    }
}