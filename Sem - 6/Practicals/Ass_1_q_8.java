import java.applet.*;
import java.awt.*;
public class Ass_1_q_8 extends Applet {

    public void paint(Graphics g){
        g.setColor(Color.YELLOW);
        g.fillArc(getWidth()/2 - 100 , getHeight()/2,100,100,0,180);
        g.setColor(Color.BLUE);
        g.fillArc(getWidth()/2 , getHeight()/2,100,100,0,-180);
        g.drawLine(getWidth()/2 - 100 , getHeight()/2 + 50 ,getWidth()/2 + 100 , getHeight()/2 + 50);
        g.setColor(Color.red);
        g.fillArc(getWidth()/2 - 50 , getHeight()/2 - 50 ,100,100,90,-180);
        g.setColor(Color.GREEN);
        g.fillArc(getWidth()/2 - 50 , getHeight()/2 + 50  ,100,100,90,180);
        g.drawLine(getWidth()/2 , getHeight()/2 - 50 ,getWidth()/2, getHeight()/2 + 150);

    }
}

/* <body>
    <applet code="Ass_1_q_8.java" height="500" width="500">
    </applet>
</body> */