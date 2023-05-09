/* <body>
    <applet code="Ass_1_Q_6.class" height="200" width="200">
        <param name="name" value="jaR"/>
    </applet>
</body>*/

import java.applet.*;
import java.awt.*;

public class Ass_1_Q_6 extends Applet{
    StringBuffer a;
    public void init(){
        a = new StringBuffer(getParameter("name"));
        a = a.reverse();
    }
    public void paint(Graphics g){
        g.drawString(a.toString(),getWidth()/2,getHeight()/2);
    }
}