/*/<body>
<applet code="Prac_5.class" width="1000" height="1000">
</applet>
</body>*/ 


import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Prac_5 extends Applet  {

    int x,y;
    
    public void init(){
        addMouseMotionListener(new MouseAdapter(){
            public void mouseMoved(MouseEvent e){
                x = e.getX();
                y = e.getY();
                repaint();
            }
        });

    }

    public void paint(Graphics g){
        g.drawRect(x,y ,100 , 100);
        showStatus("x point= "+x+"_y point= "+y);
    }   
}