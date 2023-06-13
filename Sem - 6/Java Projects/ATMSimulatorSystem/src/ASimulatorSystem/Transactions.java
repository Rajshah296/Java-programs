
package ASimulatorSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Transactions extends JFrame implements ActionListener{
    
    
    JLabel atm_img;
    JLabel trans_type = new JLabel("Please select your transaction type"); 
    
    JButton deposit = new JButton("Deposit");
    JButton withdrawal = new JButton("Cash Withdraw");
    JButton fast_cash = new JButton("Fast Cash");
    JButton mini_stat = new JButton("Mini Statement");
    JButton pin_change = new JButton("Pin Change");
    JButton bal_enq = new JButton("Balance enquiry");
    JButton exit = new JButton("Exit");
    
    JButton[] buttons = {deposit,withdrawal,fast_cash,mini_stat,pin_change,bal_enq,exit};

    String pinnumber,cardno;
    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource() == exit){
             System.exit(0);
         }
         else if(e.getSource() == deposit){
            setVisible(false);
            new Deposit(pinnumber,cardno).setVisible(true);
         }
         else if(e.getSource() == withdrawal){
            setVisible(false);
            new Withdrawal(pinnumber,cardno).setVisible(true);
         }
         else if(e.getSource() == fast_cash){
            setVisible(false);
            new FastCash(pinnumber,cardno).setVisible(true);
         }
         else if(e.getSource() == pin_change){
            setVisible(false);
            new Pin_change(pinnumber,cardno).setVisible(true);
         }
         else if(e.getSource() == bal_enq){
             setVisible(false);
             new Bal_enq(pinnumber,cardno).setVisible(true);
         }
         else if(e.getSource() == mini_stat){
            new mini_stat(pinnumber,cardno).setVisible(true);
         }
    }
    
    Transactions(String pin,String cardno){
        this.pinnumber = pin;
        this.cardno = cardno;
        setSize(900,900);
        setUndecorated(true);

        setLocation(300,0);
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        atm_img = new JLabel(i3);
        atm_img.setBounds(0,0,900,900);
        trans_type.setBounds(210,300,700,35);
        atm_img.add(trans_type);
        add(atm_img);
        
        trans_type.setFont(new Font("Raleway",Font.BOLD,16));
        trans_type.setForeground(Color.WHITE);
        
        deposit.setBounds(170,415,150,30);
        deposit.setFont(new Font("Raleway",Font.BOLD,16));
        deposit.setBackground(Color.GREEN);
        
        withdrawal.setBounds(355,415,150,30);
        withdrawal.setFont(new Font("Raleway",Font.BOLD,16));
        withdrawal.setBackground(Color.RED);
        
        fast_cash.setBounds(170,450,150,30);
        fast_cash.setFont(new Font("Raleway",Font.BOLD,16));
        fast_cash.setBackground(Color.BLUE);
        
        mini_stat.setBounds(355,450,150,30);
        mini_stat.setFont(new Font("Raleway",Font.BOLD,16));
        mini_stat.setBackground(Color.YELLOW);
        
        pin_change.setBounds(170,485,150,30);
        pin_change.setFont(new Font("Raleway",Font.BOLD,16));
        pin_change.setBackground(Color.ORANGE);
        
        bal_enq.setBounds(355,485,150,30);
        bal_enq.setFont(new Font("Raleway",Font.BOLD,16));
        bal_enq.setBackground(Color.lightGray);
        
        exit.setBounds(355,520,150,30);
        exit.setFont(new Font("Raleway",Font.BOLD,16));
        

        
        for(JButton item : buttons){
            atm_img.add(item);
            item.addActionListener(this);
        }
        
        setVisible(true);
    }
    
    public static void main(String args[]){
            new Transactions("","");
    } 
}