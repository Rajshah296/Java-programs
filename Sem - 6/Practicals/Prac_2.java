/*/<body>
<applet code="Prac_2.class" height="500" width="1000"></applet>
</body>
*/
import java.applet.*;
import java.awt.*;

public class Prac_2 extends Applet
{
    @Override
    public void paint(Graphics g)
    {
        int x = getWidth();
        int y = getHeight();
        for(int i = 10; i > 0; i--)
        {
            y = y - 50;
            g.drawOval(x/2, y, 50, 50);
            g.setColor(Color.RED);
            g.fillOval(x/2, y, 50, 50);
        }
    }
}