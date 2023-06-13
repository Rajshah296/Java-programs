package ASimulatorSystem;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonModel;


public class SignUp3 extends JFrame implements ActionListener{
    
    String formno;
    
    JLabel acc_details = new JLabel("Page 3 : Account details");
    JLabel type = new JLabel("Account Type");
    JLabel card = new JLabel("Card Number");
    JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
    JLabel PIN = new JLabel("PIN:");
    JLabel PIN_num = new JLabel("XXXX");
    JLabel info1 = new JLabel("Your 16-digit card number");
    JLabel info2 = new JLabel("Your 4-digit PIN number");
    JLabel requirements = new JLabel("Services required:");
    
    
    JRadioButton  saving_acc,recurring_acc,current_acc,fd_acc;
    JCheckBox atm_card,net_banking,mobile_banking,mail_alert,cheque_book,e_stat,confirm  ;
    
    ButtonGroup btngp1 = new ButtonGroup();
    JButton submit,cancel;
    
    SignUp3(String formno){
        this.formno = formno;
        setSize(850,1100);
        setLocation(350,0);
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION - PAGE 3");
        acc_details.setFont(new Font("Raleway",Font.BOLD,22));
        acc_details.setBounds(280,40,400,40);
        
        type.setBounds(100,140,200,30);
        type.setFont(new Font("Raleway",Font.BOLD,22));
          
        card.setBounds(100,300,200,30);
        card.setFont(new Font("Raleway",Font.BOLD,22));
        
        info1.setBounds(100,330,300,30);
        info1.setFont(new Font("Raleway",Font.BOLD,12));
        
        number.setBounds(330,300,300,30);
        number.setFont(new Font("Raleway",Font.BOLD,22));
        
        PIN.setBounds(100,370,200,30);
        PIN.setFont(new Font("Raleway",Font.BOLD,22));
        
        info2.setBounds(100,400,300,20); 
        info2.setFont(new Font("Raleway",Font.BOLD,12));
        
        PIN_num.setBounds(330,370,300,30);
        PIN_num.setFont(new Font("Raleway",Font.BOLD,22));
        
        requirements.setBounds(100,450,400,30);
        requirements.setFont(new Font("Raleway",Font.BOLD,22));
        
        atm_card = new JCheckBox("ATM card");
        atm_card.setBackground(Color.WHITE);
        atm_card.setFont(new Font("Raleway",Font.BOLD,16));
        atm_card.setBounds(100,500,200,30);
        
        net_banking = new JCheckBox("Internet Banking");
        net_banking.setBackground(Color.WHITE);
        net_banking.setFont(new Font("Raleway",Font.BOLD,16));
        net_banking.setBounds(350,500,200,30);
        
        mobile_banking = new JCheckBox("Mobile Banking");
        mobile_banking.setBackground(Color.WHITE);
        mobile_banking.setFont(new Font("Raleway",Font.BOLD,16));
        mobile_banking.setBounds(100,550,200,30);
        
        mail_alert = new JCheckBox("Email & SMS Alerts");
        mail_alert.setBackground(Color.WHITE);
        mail_alert.setFont(new Font("Raleway",Font.BOLD,16));
        mail_alert.setBounds(350,550,200,30);
        
        cheque_book = new JCheckBox("Cheque book");
        cheque_book.setBackground(Color.WHITE);
        cheque_book.setFont(new Font("Raleway",Font.BOLD,16));
        cheque_book.setBounds(100,600,200,30);
        
        e_stat = new JCheckBox("E - Statement");
        e_stat.setBackground(Color.WHITE);
        e_stat.setFont(new Font("Raleway",Font.BOLD,16));
        e_stat.setBounds(350,600,200,30);
        
        confirm = new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge");
        confirm.setBackground(Color.WHITE);
        confirm.setFont(new Font("Raleway",Font.BOLD,16));
        confirm.setBounds(100,650,700,30);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.GREEN);
        submit.setForeground(Color.white);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(250,690,100,20);
        submit.addActionListener(this);
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.RED);
        cancel.setForeground(Color.white);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBounds(420,690,100,20);
        cancel.addActionListener(this);
        
        saving_acc = new JRadioButton("Savings Account");
        saving_acc.setBounds(100,180,250,20);
        saving_acc.setFont(new Font("Raleway",Font.BOLD,16));
        
        fd_acc = new JRadioButton("Fixed Deposit");
        fd_acc.setBounds(350,180,250,20);
        fd_acc.setFont(new Font("Raleway",Font.BOLD,16));
        
        recurring_acc = new JRadioButton("Recurring account");
        recurring_acc.setBounds(100,220,250,20);
        recurring_acc.setFont(new Font("Raleway",Font.BOLD,16));
        
        current_acc = new JRadioButton("current account");
        current_acc.setBounds(350,220,250,20);
        current_acc.setFont(new Font("Raleway",Font.BOLD,16));
         
        btngp1.add(saving_acc);
        btngp1.add(fd_acc);
        btngp1.add(recurring_acc);
        btngp1.add(current_acc);
        
        
        Component[] comp = {acc_details,type,saving_acc,fd_acc,recurring_acc,current_acc,card,info1,number,PIN,info2,PIN_num,requirements,atm_card,net_banking,mobile_banking,mail_alert,cheque_book,e_stat,confirm,submit,cancel};
        for(Component item : comp){
            add(item);
        }
        
        setVisible(true);

        
    }
    public static void main(String args[]){
        
        new SignUp3("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submit){
            String acc_type = "";
            ButtonModel selectedModel = btngp1.getSelection();
            if(selectedModel != null){
                Enumeration<AbstractButton> buttons = btngp1.getElements();
                do{
                    JRadioButton radiobutton = (JRadioButton) buttons.nextElement();
                    if(radiobutton.getModel() == selectedModel){
                        acc_type = radiobutton.getText();
                        break;
                    }
                }while(buttons.hasMoreElements());
            }
            Random random = new Random();
            String card_num = "" + (Math.abs(random.nextLong() % 90000000L + 5040936000000000L));
            String pin_num = "" + (Math.abs(random.nextLong() % 9000L) + 1000L);
            String facility = "";
            StringBuffer facility_sb = new StringBuffer("");   
            List<JCheckBox> checkboxes = new ArrayList<>();
            Collections.addAll(checkboxes,atm_card,net_banking,mobile_banking,mail_alert,cheque_book,e_stat,confirm);
         // Iterate over the checkboxes and collect the selected ones
            if(!confirm.isSelected()){
                   JOptionPane.showMessageDialog(null,"You must confirm that the details provided are correct.");
                   return;
            }
            for (JCheckBox checkbox : checkboxes) {
                if (checkbox.isSelected()) {
                    facility_sb = new StringBuffer(facility_sb.toString() + ", "+ checkbox.getText());
                 }
            }           
            
            facility = facility_sb.toString();
            
            try{
                String[] values = {acc_type,card_num,pin_num,facility};
                for(String item : values){
                    if(item.equals("")){
                        JOptionPane.showMessageDialog(null,"Please provide all the necessary details.");
                        return;
                    }
                }
                    
                    Conn conn = new Conn();
                    facility_sb.setCharAt(0,'{');
                    facility_sb = new StringBuffer(facility_sb.toString() + '}');
                    facility = facility_sb.toString();
                    facility = facility.replaceAll(",I hereby declare that the above entered details are correct to the best of my knowledge","");
                    String query1 = "insert into signup3_details values('"+formno+"', '" + acc_type+"', '" + card_num+"', '" + 
                            pin_num + "', '" +facility+"')" ;
                    conn.s.executeUpdate(query1);
                    String query2  = "insert into Login values('"+formno+"', '" +card_num+"' ,'"+pin_num+"')";
                    conn.s.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null,"Card number: " +card_num+"\nPin: "+pin_num );
                    setVisible(false);
                    new Deposit(pin_num,card_num).setVisible(true);
            }
            catch(HeadlessException | SQLException ex){
                JOptionPane.showMessageDialog(null,ex);
            }
        }
       
    else if(e.getSource() == cancel){
        setVisible(false);
        new Login().setVisible(true);
    }
}
}