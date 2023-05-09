/*
    <body>
        <applet code="Prac_11.class" width="1000" height="1000"></applet>
    </body>    
*/ 

import java.applet.*;
import java.awt.*;

public class Prac_11 extends Applet {

    public void paint(Graphics g){
        int x=0,w=500;
        while(x < 250){
            g.setColor(x%2==1 ?Color.BLACK: Color.WHITE); 
            g.fillRect(x, x, w, w);
            x+=25;
            w-=50;
            try{Thread.sleep(1000);}
            catch(Exception ex){}
        }
    }
}