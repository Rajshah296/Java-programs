/* 
    <body>
    <applet code="Prac_1.class" height="500" width="300">
    </applet>
</body>
*/ 

import java.applet.*;
import java.awt.*;

public class Prac_1 extends Applet
{
    public void paint(Graphics g){
        int x = getHeight();
        int y = getWidth();
        g.drawString("Raj",y/2 , x/2 );
        g.drawOval(y/2 - 100,x/2 - 100,200,200);
    }
}