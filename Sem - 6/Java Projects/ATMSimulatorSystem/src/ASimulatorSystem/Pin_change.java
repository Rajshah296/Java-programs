package ASimulatorSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;


public class Pin_change extends JFrame implements ActionListener{
   
    String pinnumber,cardno;
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
    Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    
    JLabel atm_img = new JLabel(i3);
    JLabel confirm = new JLabel("CHANGE YOUR PIN");
    JLabel pintext = new JLabel("New PIN:");
    JLabel re_pintext = new JLabel("Re-enter PIN:");
 
    JPasswordField txt1 = new JPasswordField();
    JPasswordField txt2 = new JPasswordField();
    
    JButton change = new JButton("CHANGE"); 
    JButton back = new JButton("BACK"); 
    
    Pin_change(String pinnumber,String cardno){
        this.pinnumber = pinnumber;
        this.cardno = cardno;
        
        setTitle("Change your PIN");
        setLayout(null);
        setSize(900,900);
        setLocation(300,0);
        
        atm_img.setBounds(0,0,900,900);
        add(atm_img);
        
        confirm.setFont(new Font("Raleway",Font.BOLD,16));
        confirm.setBounds(250,280,500,35);
        confirm.setForeground(Color.WHITE);
        atm_img.add(confirm);
        
        pintext.setFont(new Font("Raleway",Font.BOLD,16));
        pintext.setBounds(165,340,90,25);
        pintext.setForeground(Color.WHITE);
        atm_img.add(pintext);
        
        re_pintext.setFont(new Font("Raleway",Font.BOLD,16));
        re_pintext.setBounds(165,380,400,30);
        re_pintext.setForeground(Color.WHITE);
        atm_img.add(re_pintext);
        
        txt1.setBounds(300,340,100,25);
        txt1.setFont(new Font("Raleway",Font.BOLD,16));
        atm_img.add(txt1);
        
        txt2.setBounds(300,380,100,25);
        txt2.setFont(new Font("Raleway",Font.BOLD,16));
        atm_img.add(txt2);
        
        change.setBounds(355,485,150,30);
        change.addActionListener(this);
        atm_img.add(change);
        
        back.setBounds(355,520 ,150,30);
        back.addActionListener(this);
        atm_img.add(back);
        setUndecorated(true);
        
        setVisible(true);
    }
    
    
    public static void main(String[] args) {
        new Pin_change("","");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == back){
            setVisible(false);
            new Transactions(pinnumber,cardno).setVisible(true);
        }
        else if(e.getSource() == change){
            try{
                  
                String pin = new String(txt1.getPassword());
                String repin = new String(txt2.getPassword());
                if(!pin.equals(repin)){
                    JOptionPane.showMessageDialog(null,"Entered PIN does not match");
                    return;
                }
                
               if (pin.length() < 4) {
                JOptionPane.showMessageDialog(null, "Pin should be atleast 4 digits");
                return;
               }
               
               Conn conn = new Conn();
               conn.s.executeUpdate("Update bank set pin='"+repin+"' where pin='"+pinnumber+"' and cardno= '"+cardno+"'");
               conn.s.executeUpdate("Update login set pin='"+repin+"' where pin='"+pinnumber+"' and card_num= '"+cardno+"'");
               conn.s.executeUpdate("Update signup3_details set pin='"+repin+"' where pin='"+pinnumber+"' and card_num= '"+cardno+"'");
               
               JOptionPane.showMessageDialog(null,"Pin changed successfully");
               setVisible(false);
               new Transactions(pin,cardno).setVisible(true);
            }
            
            catch(HeadlessException | SQLException ex){
                JOptionPane.showMessageDialog(null,ex);
            }
        }
    }
}