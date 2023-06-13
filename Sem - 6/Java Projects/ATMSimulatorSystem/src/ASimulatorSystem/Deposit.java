
package ASimulatorSystem;

import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Deposit extends JFrame implements ActionListener{
    
    String pinnumber,amountstr,cardno;
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
    Image image = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(image);
    
    JLabel atm_img = new JLabel(i3);
    JLabel depo_amount_lbl = new JLabel("Enter amount you want to deposit: ");
    
    JTextField amount = new JTextField();
    
    JButton deposit = new JButton("Deposit");
    JButton back = new JButton("Back");
    
    Deposit(String pin,String cardno){
        pinnumber = pin;
        this.cardno = cardno;
        setLayout(null);
        setTitle("DEPOSIT WINDOW");
        setLocation(300,0);
        setSize(900,900);
        
        atm_img.setBounds(0,0,900,900);
        add(atm_img);
        
        depo_amount_lbl.setFont(new Font("System",Font.BOLD,16));
        depo_amount_lbl.setBounds(170,300,400,20);
        atm_img.add(depo_amount_lbl);
        
        amount.setFont(new Font("Raleway",Font.BOLD,16));
        amount.setBounds(170,350,320,25);
        atm_img.add(amount);
        
        deposit.setBounds(355,485,150,30);
        atm_img.add(deposit);
        deposit.addActionListener(this);
        
        back.addActionListener(this);
        back.setBounds(355,520,150,30);
        atm_img.add(back);
        
        setUndecorated(true);
        setVisible(true);
    }
    
    public static void main(String args[]){
        new Deposit("","");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == deposit){
           amountstr = amount.getText();
           Date date = new Date();
           
           if(amountstr.equals("")){
               JOptionPane.showMessageDialog(null, "Please enter the amount you want to deposit");
           }
           else{
               try{
                    int num = Integer.parseInt(amountstr);
                    Conn conn = new Conn();
                    String query = "insert into bank values('"+pinnumber+"', '"+date+"','Deposit',"+num+",'"+cardno+"')";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,num+" Rs deposited successfully");
                    setVisible(false);
                    new Transactions(pinnumber,cardno).setVisible(true);
               }
                catch(HeadlessException | NumberFormatException | SQLException ex){
                    JOptionPane.showMessageDialog(null,ex);}
           }
       }
       else if(e.getSource() == back){
           setVisible(false);
           new Transactions(pinnumber,cardno).setVisible(true);          
       }
    }    
}
