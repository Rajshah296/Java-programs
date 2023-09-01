/* <html><body>
    <applet code="Draw_circle_using_drawLine.java" width="300" height="300"></applet>
</body></html> */

import java.applet.Applet;
import java.awt.Graphics;

public class Draw_circle_using_drawLine extends Applet {

    public void init(){
        repaint();
    }
    public void paint(Graphics g) {
        int centerX = getWidth() / 2; // X-coordinate of the center
        int centerY = getHeight() / 2; // Y-coordinate of the center
        int radius = 100; // Radius of the circle

        int x = 0;
        int y = radius;
        int p = 1 - radius;

        while (x <= y) {
            g.drawLine(centerX + x, centerY + y, centerX + x, centerY + y);
            g.drawLine(centerX - x, centerY + y, centerX - x, centerY + y);
            g.drawLine(centerX + x, centerY - y, centerX + x, centerY - y);
            g.drawLine(centerX - x, centerY - y, centerX - x, centerY - y);
            g.drawLine(centerX + y, centerY + x, centerX + y, centerY + x);
            g.drawLine(centerX - y, centerY + x, centerX - y, centerY + x);
            g.drawLine(centerX + y, centerY - x, centerX + y, centerY - x);
            g.drawLine(centerX - y, centerY - x, centerX - y, centerY - x);

            if (p < 0) {
                p += 2 * x + 1;
            } else {
                p += 2 * (x - y) + 1;
                y--;
            }
            x++;
        }
    }
    
}
