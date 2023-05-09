import java.awt.*;
import java.awt.event.*;

public class Prac_8 extends Frame implements ActionListener{

    Button btn1;
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        setBackground((getBackground() == Color.RED) ? Color.GREEN : (getBackground() == Color.GREEN) ? Color.BLUE : Color.RED);
    }

    Prac_8(){
        setSize(500,500);
        setBackground(Color.RED);
        setVisible(true);        
        setTitle("Frame 1");
        setLayout(new FlowLayout());
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        btn1 = new Button("Click");
        btn1.addActionListener(this);
        add(btn1);
    }


    public static void main(String args[]){
        new Prac_8();
    }
}