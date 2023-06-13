package ASimulatorSystem;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SignUp2 extends JFrame implements ActionListener{

    String formno;
    
    JLabel additionaldetails = new JLabel("Page 2 : Additional details");
    JLabel religion = new JLabel("Religion_box:");
    JLabel category = new JLabel("Category:");
    JLabel income = new JLabel("Income:");
    JLabel education = new JLabel("Educational Qualification:");
    JLabel occupation = new JLabel("Occupation");
    JLabel pan_no = new JLabel("pan_no.: ");
    JLabel aadhar_no = new JLabel("aadhar_no: ");
    JLabel senior_citizen = new JLabel("Senior citizen: ");
    JLabel existing_account = new JLabel("existing_account:: ");
    
    
    String[] valReligion = {"Hindu","Muslim","Sikh","Christian","Other"};
    JComboBox Religion_box = new JComboBox(valReligion);
    
    String[] categoryval = {"General","OBC","SC","ST","Other"};
    JComboBox Category_box = new JComboBox(categoryval);
    
    String[] incomeval = {"0"," < 1,50,000","< 2,50,000"," < 5,00,000","Upto 10,000,00"};
    JComboBox Income_box = new JComboBox(incomeval);
    
    String[] education_val = {"Non-Graduate","Graduation","Post-Graduation","Doctrate","Other"};
    JComboBox education_box = new JComboBox(education_val);
    
    String[] occupation_val = {"Salaried","Self-Employeed","Bussinessman / Industrialist","Student","Retired","Others"};
    JComboBox occupation_box = new JComboBox(occupation_val);
            

    JTextField panTextField = new JTextField();
    JTextField aadharTextField = new JTextField();
       
    
    JRadioButton syes = new JRadioButton("Yes");
    JRadioButton sno = new JRadioButton("No");
    JRadioButton e_acc_y = new JRadioButton("No");
    JRadioButton e_acc_n = new JRadioButton("Yes");
    ButtonGroup Senior_citizen = new ButtonGroup();
    ButtonGroup exist_acc = new ButtonGroup();
    
    JButton next  = new JButton("Next"); 

    SignUp2(String formno){
        
        this.formno = formno;
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setTitle("NEW ACCOUNT APPLICATION - PAGE 2");
        setLocation(350,10);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        additionaldetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionaldetails.setBounds(290,80,400,30);
        
        religion.setFont(new Font("Raleway",Font.BOLD,20));
        religion.setBounds(100,140,100,30);
        
        Religion_box.setFont(new Font("Raleway",Font.BOLD,14));
        Religion_box.setBounds(300,140,400,30);
        Religion_box .setBackground(Color.WHITE);
        
        
        category.setFont(new Font("Raleway",Font.BOLD,20));
        category.setBounds(100,190,200,30);  
        
        Category_box.setFont(new Font("Raleway",Font.BOLD,14));
        Category_box.setBounds(300,190,400,30);
        Category_box.setBackground(Color.WHITE);
        
        income.setFont(new Font("Raleway",Font.BOLD,20));
        income.setBounds(100,240,200,30);

        Income_box.setBounds(300,240,400,30);
        Income_box.setBackground(Color.WHITE);
        
        education_box.setBounds(300,315,400,30);
        education_box.setBackground(Color.WHITE);
        
        education.setBounds(100,290,200,30);
        
      

         occupation.setFont(new Font("Raleway",Font.BOLD,20));
        occupation.setBounds(100,390,200,30);
        
        occupation_box.setFont(new Font("Raleway",Font.BOLD,14));
        occupation_box.setBounds(300,390,400,30);
        
     
        
       Senior_citizen.add(syes);
       Senior_citizen.add(sno);
       exist_acc.add(e_acc_y);
       exist_acc.add(e_acc_n);
       
        pan_no.setFont(new Font("Raleway",Font.BOLD,20));
        pan_no.setBounds(100,440,200,30);

        panTextField.setFont(new Font("Raleway",Font.BOLD,14));
        panTextField.setBounds(300,440,400,30);
        
        aadhar_no.setFont(new Font("Raleway",Font.BOLD,20));
        aadhar_no.setBounds(100,490,200,30);

        aadharTextField.setFont(new Font("Raleway",Font.BOLD,14));
        aadharTextField.setBounds(300,490,400,30);

        senior_citizen.setFont(new Font("Raleway",Font.BOLD,20));
        senior_citizen.setBounds(100,540,200,30);
       
        syes.setBounds(320,540,100,30);
        syes.setBackground(Color.WHITE);
        sno.setBackground(Color.WHITE);
        sno.setBounds(440,540,100,30);
        Senior_citizen.add(syes);
        Senior_citizen.add(sno);
      
        existing_account.setFont(new Font("Raleway",Font.BOLD,20));
        existing_account.setBounds(100,590,200,30);
        
        e_acc_y.setBounds(320,590,100,30);
        e_acc_y.setBackground(Color.WHITE);
        e_acc_n.setBackground(Color.WHITE);
        e_acc_n.setBounds(440,590,100,30);
        
       exist_acc.add(e_acc_y);
       exist_acc.add(e_acc_n);
       
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);

        // Now create a Component array containing all the components in the form and add them to the form using a for loop.//
        Component[] comp = {additionaldetails,religion,category,income,education,occupation,pan_no,aadhar_no,senior_citizen,existing_account,Religion_box,
Category_box,
Income_box,
education_box,
occupation_box,
panTextField,
aadharTextField,
syes,
sno,
e_acc_y,
e_acc_n,
next};
        for(Component item : comp){
            add(item);
        }
        setVisible(true);

    }
    
    public static void main(String args[]) {
        new SignUp2("");
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String sreligion = Religion_box.getSelectedItem().toString();
        String scategory = Category_box.getSelectedItem().toString();
        String sincome = Income_box.getSelectedItem().toString();
        String seducation = education_box.getSelectedItem().toString();
        String soccupation = occupation_box.getSelectedItem().toString();
        String span = panTextField.getText();
        String saadhar = aadharTextField.getText();
        String senior_citizen_status = syes.isSelected() ? "Yes" : sno.isSelected()? "No":"";
        String existing_acc_status = e_acc_y.isSelected() ? "Yes" :e_acc_n.isSelected()? "No": "";
        
        String[] all_vals = {sreligion,scategory,sincome,seducation,soccupation,span,saadhar,senior_citizen_status,existing_acc_status};
        for(String item : all_vals){
            if(item.equals("")){
                JOptionPane.showMessageDialog(null,"Please provide all the necessary details");
                return;
            }
        }
        try{
            Conn conn = new Conn();
            try{
                
                long aadhar_no = Long.parseLong(saadhar);
                if(saadhar.length() != 12){
                    JOptionPane.showMessageDialog(null,"Invalid aadhar number.");
                    return;
                }
            }
                            
            catch(HeadlessException | NumberFormatException  ed){
                JOptionPane.showMessageDialog(null,"Invalid Aadhar number.");
                return;
            }
            if(span.length() != 10){
                JOptionPane.showMessageDialog(null,"Invalid PAN number.");
                return;
            }
            String query = "insert into signup2_details values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+ sincome + "', '"+
                    seducation+"', '" + soccupation + "', '"+span+"','"+saadhar+"', '"+senior_citizen_status+"','" + existing_acc_status+"')";
            conn.s.executeUpdate(query);
            
            //SignUp3 Object
             setVisible(false);
             new SignUp3(formno).setVisible(true);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}