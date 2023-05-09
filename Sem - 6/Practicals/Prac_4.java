/*<body>
    <applet code="Prac_4.class" width="1000" height="500"></applet>*/ 
import java.applet.*;
import java.awt.*;

public class Prac_4  extends Applet{

    TextField txt1 = new TextField();
    TextField txt2 = new TextField();
    int a,b;

    public void init(){
        add(txt1);
        add(txt2);

    }
    public void paint(Graphics g){
        try{
            a = Integer.parseInt(txt1.getText());
            b = Integer.parseInt(txt2.getText());
            g.drawString(Integer.toString(a+b),50,50);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public boolean action(Event event, Object obj){
        repaint();
        return true;
    }
}