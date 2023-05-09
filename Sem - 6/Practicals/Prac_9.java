/*<body>
    <applet code="Prac_9.class" height="1000" width="1000"></applet>
</body>*/ 

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Prac_9 extends Applet implements ItemListener{
    Checkbox rch,gch,bch;
    Canvas c;
    public void init(){
        c = new Canvas();
        c.setSize(200,200);
        c.setBackground(Color.black);
        add(c);
        rch = new Checkbox("Red");
        gch = new Checkbox("Green");
        bch = new Checkbox("Blue");
        rch.addItemListener(this);
        gch.addItemListener(this);
        bch.addItemListener(this);
        add(rch);
        add(gch);
        add(bch);
    }
    public void itemStateChanged(ItemEvent e){
        c.setBackground(((rch.getState() && gch.getState() && bch. getState())  ? Color.white : (rch.getState() && gch.getState()) ? Color.YELLOW : (gch.getState() && bch.getState()) ? Color.CYAN : (rch.getState() && bch.getState()) ? Color.magenta : rch.getState() ? Color.RED : gch.getState() ? Color.GREEN : bch.getState()  ? Color.BLUE : Color.BLACK));
    }
}