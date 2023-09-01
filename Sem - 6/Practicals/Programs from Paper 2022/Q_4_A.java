import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Q_4_A extends JApplet implements ItemListener{
    JCheckBox gch = new JCheckBox();
    JCheckBox rch = new JCheckBox();
    JCheckBox bch = new JCheckBox();
    Canvas c = new Canvas();
    public void init() {
        c.setSize(200,200);
        setLayout(new FlowLayout());
        JCheckBox[] comp = {rch,gch,bch};
        add(c);
        for(JCheckBox compo : comp)
        {
            add(compo);
            compo.addItemListener(this);
        }
        setVisible(true);


    }
    public void itemStateChanged(ItemEvent e){
        c.setBackground(((rch.isSelected() && gch.isSelected() && bch. isSelected())  ? Color.white : (rch.isSelected() && gch.isSelected()) ? Color.YELLOW : (gch.isSelected() && bch.isSelected()) ? Color.CYAN : (rch.isSelected() && bch.isSelected()) ? Color.magenta : rch.isSelected() ? Color.RED : gch.isSelected() ? Color.GREEN : bch.isSelected()  ? Color.BLUE : Color.BLACK));

    }
}

/* <html><body>
        <applet code="O_4_A" width="600" height="600"></applet>
    </body></html> */