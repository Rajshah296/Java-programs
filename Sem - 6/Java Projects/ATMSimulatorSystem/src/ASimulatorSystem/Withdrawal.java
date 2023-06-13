
package ASimulatorSystem;

import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Withdrawal extends JFrame implements ActionListener{
    
    String pinnumber,cardno;
    String amountstr;
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
    Image image = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(image);
    
    JLabel atm_img = new JLabel(i3);
    JLabel withdraw_amount_lbl = new JLabel("Enter amount you want to withdraw: ");
    
    JTextField amount = new JTextField();
    
    JButton withdraw= new JButton("Withdraw");
    JButton back = new JButton("Back");
    
    Withdrawal(String pin,String cardno){
        this.cardno = cardno;
        pinnumber = pin;
        setLayout(null);
        setTitle("WITHDRAWAL WINDOW");
        setLocation(300,0);
        setSize(900,900);
        
        atm_img.setBounds(0,0,900,900);
        add(atm_img);
        
        withdraw_amount_lbl.setFont(new Font("System",Font.BOLD,16));
        withdraw_amount_lbl.setBounds(170,300,400,20);
        atm_img.add(withdraw_amount_lbl);
        
        amount.setFont(new Font("Raleway",Font.BOLD,16));
        amount.setBounds(170,350,320,25);
        atm_img.add(amount);
        
        withdraw.setBounds(355,485,150,30);
        atm_img.add(withdraw);
        withdraw.addActionListener(this);
        
        back.addActionListener(this);
        back.setBounds(355,520,150,30);
        atm_img.add(back);
        
        setUndecorated(true);
        setVisible(true);
    }
    
    public static void main(String args[]){
        new Withdrawal("","");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == withdraw){
           amountstr = amount.getText();
           
           int bal = 0;
            try{
                Conn conn = new Conn();
                 
                ResultSet rs = conn.s.executeQuery("Select * from bank where pin='" + pinnumber +"' and cardno='"+cardno+"'");

                while(rs.next()){
                    if(rs.getString("Trans_type").equals("Deposit")){
                        bal+=rs.getInt("amount");
                    }
                    else{
                        bal-=rs.getInt("amount");
                    }
                }
            }
            catch(SQLException ex){JOptionPane.showMessageDialog(null, ex);}
            
            if(amountstr.equals("")){
               JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw.");
            }
            
            if(Integer.parseInt(amountstr) > bal){
                JOptionPane.showMessageDialog(null,"Insufficient balance.");
            }
            
           else{
               try{
                   Date date = new Date();
                   int num = Integer.parseInt(amountstr);
                    Conn conn = new Conn();
                    String query = "insert into bank values('"+pinnumber+"', '"+date+"','Withdrawal',"+num+",'"+cardno+"')";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,num+" Rs withdrawn successfully");
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