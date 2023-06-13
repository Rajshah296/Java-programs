package ASimulatorSystem;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{

    JButton login = new JButton("Sign in");
    JButton clear = new JButton("CLEAR");
    JButton signup = new JButton("Sign up");
    JTextField cardTextField = new JTextField();
    JPasswordField pinTextField = new JPasswordField();
    
    JLabel check_acc = new JLabel("If you don't an account then");
    

    Login(){
        
        // Create a JLabel with the logo.//
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT); 
        ImageIcon i3 = new ImageIcon(i2);
        JLabel lbl1 = new JLabel (i3);
        lbl1.setBounds(70,10,100,100);
        
        // Greet the client.//
        JLabel text = new JLabel ("Welcome to ATM!");
        text.setBounds(200,40, 400, 40);
        text.setFont(new Font("Osward",Font.BOLD,38));
        
        // Ask for card no.//
        JLabel cardno = new JLabel("Card No.:");
        cardno.setBounds(120,150, 150, 30);
        cardno.setFont(new Font("Raleway",Font.BOLD,28));      
        
        //Ask for PIN.//
        JLabel pin = new JLabel("PIN:");
        pin.setBounds(120,220, 250, 30);
        pin.setFont(new Font("Raleway",Font.BOLD,28));
        

        cardTextField.setBounds(300,150,250,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,16));
        
        pinTextField.setBounds(300,220,230,30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,16));
        
        //Set bounds for all the buttons.//
        login.setBounds(300,300,100,30);
        
        clear.setBounds(430,300,100,30);
        
        check_acc.setBounds(320,340,230,10);
        check_acc.setForeground(Color.BLUE);
        signup.setBounds(300,370,230,30);
        // Create a JButton[] and iterate it using for loop.//
        JButton[] buttons = {login,clear,signup};
        for(JButton item : buttons) {
            item.setBackground(Color.BLACK);
            item.setForeground(Color.WHITE);
            item.addActionListener(this);
        }
        // Add all the components 
        Component[] comp = {lbl1,text,cardno,pin,cardTextField,pinTextField,login,clear,signup,check_acc};
        for(Component item : comp){
            add(item);  
        }
        // Set different properties for the Frame.//
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setSize(800,400);
        setLocation(350,200);
        setTitle("AUTOMATED TELLER MACHINE");
        setVisible(true);

    }
    
    // Override the actionPerformed method.//
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == login){
            
            try{
                Conn conn = new Conn();
                String card = cardTextField.getText();
                String pin = new String(pinTextField.getPassword());
                String query = "select * from Login where card_num='" + card + "' and pin='"+pin+"';";
                ResultSet rs = conn.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pin,card).setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Incorrect card number or PIN"); 
                    return;
                }
                setVisible(false);
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex);
            }
           
        }
        else if(e.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }
        else if(e.getSource() == signup){
            setVisible(false);
            new SignUp1().setVisible(true); 
        }
    }
    public static void main(String args[]){
        new Login();
    }
}