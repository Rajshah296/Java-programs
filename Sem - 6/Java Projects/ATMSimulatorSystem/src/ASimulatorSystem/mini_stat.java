package ASimulatorSystem;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class mini_stat extends JFrame implements ActionListener{
    String pinnumber,cardno;
    
    JLabel lbl1 = new JLabel();
    JLabel bank_name = new JLabel("YourBank");
    JLabel card_num = new JLabel();
    JLabel mini = new JLabel();
    JLabel bal_lbl = new JLabel();
    
    
    JButton back = new JButton("BACK");
    mini_stat(String pinnumber,String cardno){
    
        this.pinnumber = pinnumber;
        this.cardno = cardno;
        setTitle("Mini statement");
        setLayout(null);
        setSize(400,600);
        setLocation(20,20);
        bank_name.setBounds(150,20,100,20);
        card_num.setBounds(40,80,300,20);
        mini.setBounds(20,140,400,200);
        bal_lbl.setBounds(20,400,300,20);
        card_num.setText("Card number: "+cardno.substring(0,4)+"XXXXXXXX" + cardno.substring(12));

        

        
        try{
            Conn conn = new Conn();
            int bal = 0;
            ResultSet rs = conn.s.executeQuery("Select * from bank where pin ='"+pinnumber+"' and cardno='"+cardno+"'");
            while(rs.next()){
                mini.setText(mini.getText()+"<html>"+rs.getString("Trans_date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
                rs.getString("Trans_type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("amount")+"<br><br>"                        +"<html>");
                if(rs.getString("Trans_type").equals("Deposit")){
                    bal+=rs.getInt("amount");
                }
                else{
                    bal-=rs.getInt("amount");
                }
                
            }
            bal_lbl.setText("Your current account balance is Rs "+bal);
        
        }
        catch(SQLException ex){JOptionPane.showMessageDialog(null, ex);}
        
        Component[] comp = {lbl1,card_num,bank_name,mini,bal_lbl};
        for(Component item : comp){
            add(item);
        }
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
        
        
    }
    
    public static void main(String[] args) {
        new mini_stat("","");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Transactions(pinnumber,cardno).setVisible(true);
    }
}
