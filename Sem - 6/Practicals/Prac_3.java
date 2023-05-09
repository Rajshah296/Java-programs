/*/<body>
<applet code="Prac_3.class" height="500" width="1000"></applet>
</body>
*/
import java.applet.*;
import java.awt.*;
import java.lang.Thread;

public class Prac_3 extends Applet{
    public void paint(Graphics g){
        g.setColor(Color.RED);
        try{
            g.drawRect(getWidth()/2, getHeight()/2, 100, 50);
            for(int i = getWidth()/2 ; i < (getWidth()/2 + 100) ; i+=2)
            {
                g.fillRect(i, getHeight()/2, 4, 50);
                Thread.sleep(500);
            }
        }

        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }    
}