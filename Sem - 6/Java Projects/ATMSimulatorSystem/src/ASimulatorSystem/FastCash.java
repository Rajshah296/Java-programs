
package ASimulatorSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Date;


public class FastCash extends JFrame implements ActionListener{
    
   
    int amount;
    JLabel atm_img;
    JLabel trans_type = new JLabel("Please select your transaction type"); 
    JLabel text = new JLabel("Select Withdrawal amount"); 
    
    JButton Rs_100 = new JButton("Rs 100");
    JButton Rs_500 = new JButton("Rs 500");
    JButton Rs_1000= new JButton("Rs 1000");
    JButton Rs_2000 = new JButton("Rs 2000");
    JButton Rs_5000 = new JButton("Rs 5000");
    JButton Rs_10000 = new JButton("Rs 10000");
    JButton back = new JButton("back");
    
    JButton[] buttons = {Rs_100,Rs_500,Rs_1000,Rs_2000,Rs_5000,Rs_10000,back};

    String pinnumber,cardno;
    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource() == back){
             setVisible(false);
             new Transactions(pinnumber,cardno).setVisible(true);
         }
         else{
             
                String amountstr = ((JButton) e.getSource()).getText();
                amountstr = amountstr.replaceAll("[^0-9]","");
                amount = Integer.parseInt(amountstr);
                Conn conn = new Conn();
                try{
                    ResultSet rs = conn.s.executeQuery("Select * from bank where pin='" + pinnumber +"' and cardno='"+cardno+"'");
                    int bal = 0;
                    while(rs.next()){
                        if(rs.getString("Trans_type").equals("Deposit")){
                            bal+=amount;
                        }
                        else{
                            bal-=amount;
                        }
                    }
                    if(bal < amount){
                        JOptionPane.showMessageDialog(null,"Insufficient balance.");
                        return;}
                    
                    Date date =  new Date();
                    String query = "insert into bank values('"+pinnumber+"', '"+date+"','Withdrawal',"+amount+",'"+cardno+"')";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,"Rs "+ amount+ " debited.");
                    setVisible(false);
                    new Transactions(pinnumber,cardno).setVisible(true);}
                
             catch(HeadlessException | SQLException ex){
                 JOptionPane.showMessageDialog(null,ex);
             }
         }
    }
    
    FastCash(String pin,String cardno){
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
        
        Rs_100.setBounds(170,415,150,30);
        Rs_100.setFont(new Font("Raleway",Font.BOLD,16));
        Rs_100.setBackground(Color.GREEN);
        
        Rs_500.setBounds(355,415,150,30);
        Rs_500.setFont(new Font("Raleway",Font.BOLD,16));
        Rs_500.setBackground(Color.RED);
        
        Rs_1000.setBounds(170,450,150,30);
        Rs_1000.setFont(new Font("Raleway",Font.BOLD,16));
        Rs_1000.setBackground(Color.BLUE);
        
        Rs_2000.setBounds(355,450,150,30);
        Rs_2000.setFont(new Font("Raleway",Font.BOLD,16));
        Rs_2000.setBackground(Color.YELLOW);
        
        Rs_5000.setBounds(170,485,150,30);
        Rs_5000.setFont(new Font("Raleway",Font.BOLD,16));
        Rs_5000.setBackground(Color.ORANGE);
        
        Rs_10000.setBounds(355,485,150,30);
        Rs_10000.setFont(new Font("Raleway",Font.BOLD,16));
        Rs_10000.setBackground(Color.lightGray);
        
        back.setBounds(355,520,150,30);
        back.setFont(new Font("Raleway",Font.BOLD,16));
        

        
        for(JButton item : buttons){
            atm_img.add(item);
            item.addActionListener(this);
        }
        
        setVisible(true);
    }
    
    public static void main(String args[]){
            new FastCash("","");
    } 
}