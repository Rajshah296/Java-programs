
package ASimulatorSystem;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.sql.*;
import javax.swing.JOptionPane;

public class Bal_enq extends JFrame implements ActionListener{
    
    String pinnumber;
    String cardno;
    
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
    Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel atm_img = new JLabel(i3);
    
    int bal = 0;

    JButton back = new JButton("BACK");
    
    Bal_enq(String pinnumber,String cardno){
        this.pinnumber = pinnumber;
        this.cardno = cardno;
        setSize(900,900);
        setLocation(300,0);
        setLayout(null);
        back.addActionListener(this);
        back.setBounds(355,520,150,30);

        add(atm_img);
        try{
            Conn conn = new Conn();
                    
            ResultSet rs = conn.s.executeQuery("Select * from bank where pin='" + pinnumber +"'");
            
            while(rs.next()){
                if(rs.getString("Trans_type").equals("Deposit")){
                    bal+=rs.getInt("amount");
                }
                else{
                    bal-=rs.getInt("amount");
                }
            }
        }
        
                
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        JLabel text = new JLabel("Your account's current balance is: Rs "+bal);
        text.setBounds(170,300,400,30);
        text.setForeground(Color.WHITE);
        atm_img.add(text);
        
        atm_img.add(back);
        atm_img.add(text);
        atm_img.setBounds(0,0,900,900);    
        
        setUndecorated(false);
        setVisible(true);
        
        
    }
    public static void main(String[] args) {
        new Bal_enq("","");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Transactions(pinnumber,cardno).setVisible(true);
    }
}
