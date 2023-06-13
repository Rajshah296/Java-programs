package ASimulatorSystem;


import java.util.*;
import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.*;
import java.awt.event.*;
import static java.lang.String.valueOf;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Calendar;

public class SignUp1 extends JFrame implements ActionListener{
    
    JDateChooser dateChooser = new JDateChooser();


    JLabel persondetails = new JLabel("Page 1 : Personal details");
    JLabel name = new JLabel("Name:");
    JLabel Fname = new JLabel("Father's Name:");
    JLabel DOB = new JLabel("Date of Birth");
    JLabel Gender = new JLabel("Gender");
    JLabel Email = new JLabel("Email id:");
    JLabel marital_status = new JLabel("Marital Status");
    JLabel Address = new JLabel("Address: ");
    JLabel City = new JLabel("City: ");
    JLabel State = new JLabel("State: ");
    JLabel pincodLabel = new JLabel("Pin code: ");
    
    Random ran = new Random();
    Long random = Math.abs(ran.nextLong() % 9000L) + 1000L;
    JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
    
    JTextField nameTextField = new JTextField();
    JTextField FnameTextField = new JTextField();   
    JTextField emailTextField = new JTextField();
    JTextField pincodeTextField = new JTextField();
    JTextField StateTextField = new JTextField();
    JTextField cityTextField = new JTextField();
    JTextField AddressTextField = new JTextField();
       
    JRadioButton Male = new JRadioButton("Male");
    JRadioButton Female = new JRadioButton("Female");
    JRadioButton Married = new JRadioButton("Married");
    JRadioButton Unmarried = new JRadioButton("Unmarried");
    JRadioButton Other = new JRadioButton("Other");
    ButtonGroup gendergroup = new ButtonGroup();
    ButtonGroup marital_status_group = new ButtonGroup();


    JButton next  = new JButton("Next"); 

    SignUp1(){
        
        // Set Background color and other properties for the Frame.//
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 1");
        setLocation(350,10);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create the heading for the application form.//

        formno.setFont(new Font("Raleway",Font.BOLD, 38));
        formno.setBounds(140,20,600,40);
        
        // Display the Label representing the Page no. and what the form is asking for from the client.//
        persondetails.setFont(new Font("Raleway",Font.BOLD,22));
        persondetails.setBounds(290,80,400,30);
        
        // Ask for the name.//
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        
        // Ask for Father's name.//
        Fname.setFont(new Font("Raleway",Font.BOLD,20));
        Fname.setBounds(100,190,200,30);  
        
        FnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        FnameTextField.setBounds(300,190,400,30);
        
        // Ask to select DOB.//
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,240,200,30);

        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(Color.RED);
        dateChooser.setDateFormatString("YYYY-MM-dd");
        
        //Ask to select Gender.//
        Gender.setFont(new Font("Raleway",Font.BOLD,20));
        Gender.setBounds(100,290,200,30);
        
        Male.setBounds(300,290,60,30);
        Male.setBackground(Color.WHITE);
        
        Female.setBounds(450,290,120,30);
        Female.setBackground(Color.WHITE);
        
        gendergroup.add(Male);
        gendergroup.add(Female);
        
        // Ask for the email address.//
        Email.setFont(new Font("Raleway",Font.BOLD,20));
        Email.setBounds(100,340,200,30);

        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        
        // Ask to select marital status.//
        marital_status.setFont(new Font("Raleway",Font.BOLD,20));
        marital_status.setBounds(100,390,200,30);
        
        Married.setBounds(300,390,100,30);
        Married.setBackground(Color.WHITE);
        
        
        Unmarried.setBounds(450,390,100,30);
        Unmarried.setBackground(Color.WHITE);
        
        Other.setBounds(630,390,100,30);
        Other.setBackground(Color.WHITE);
        
        marital_status_group.add(Married);
        marital_status_group.add(Unmarried);
        marital_status_group.add(Other);

        // Ask for the address.//
        Address.setFont(new Font("Raleway",Font.BOLD,20));
        Address.setBounds(100,440,200,30);

        AddressTextField.setFont(new Font("Raleway",Font.BOLD,14));
        AddressTextField.setBounds(300,440,400,30);
        
        // Ask for the city and state name.//
        City.setFont(new Font("Raleway",Font.BOLD,20));
        City.setBounds(100,490,200,30);

        cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);

        State.setFont(new Font("Raleway",Font.BOLD,20));
        State.setBounds(100,540,200,30);

        StateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        StateTextField.setBounds(300,540,400,30);
        //Ask for the pincode.//
        pincodLabel.setFont(new Font("Raleway",Font.BOLD,20));
        pincodLabel.setBounds(100,590,200,30);

        pincodeTextField.setFont(new Font("Raleway",Font.BOLD,14));
        pincodeTextField.setBounds(300,590,400,30);
        
        // Create a button to go to the next page.//
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);

        // Now create a Component array containing all the components in the form and add them to the form using a for loop.//
        Component[] comp = {formno,persondetails,name,Fname,DOB,Gender,Email,marital_status,Address,City,State,pincodLabel,nameTextField,FnameTextField,emailTextField,cityTextField,AddressTextField,StateTextField,pincodeTextField,DOB,dateChooser,Married,Unmarried,Other,Male,Female,next};
        for(Component item : comp){
            add(item);
        }
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        String form_no = random.toString();
        String Name = nameTextField.getText();
        String fname = FnameTextField.getText();
        String dobString = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender= Male.isSelected()? "Male":Female.isSelected()?"Female":null;
        String email = emailTextField.getText();
        String Marital_status = Married.isSelected()?  "married" : Unmarried.isSelected()?"unmarried":null;
        String address = AddressTextField.getText();
        String city = cityTextField.getText();
        String state =  StateTextField.getText();
        String pincode = pincodeTextField.getText();
        int pincodeno = 0;
        
        
        
        try{
            if(Name.equals("") || fname.equals("") || dobString.equals("") || gender == null || email.equals("") || Marital_status == null || address.equals("") || city.equals("") || state.equals("") || pincode.equals("")){
                JOptionPane.showMessageDialog(null,"Please provide all the necessary details.");
                return;
                
            }
            Date dob = null;
            try{
                SimpleDateFormat SDF = new SimpleDateFormat("YYYY-MM-DD");
                dob = SDF.parse(dobString);
            }
            catch(ParseException em){
                JOptionPane.showMessageDialog(null,"Invalid Date");
            }
            try
            {
                
                Calendar dobCalendar = Calendar.getInstance();
                dobCalendar.setTime(dob);
                Calendar now = Calendar.getInstance();

                int age = now.get(Calendar.YEAR) - dobCalendar.get(Calendar.YEAR);
                if (now.get(Calendar.MONTH) < dobCalendar.get(Calendar.MONTH) ||
                        (now.get(Calendar.MONTH) == dobCalendar.get(Calendar.MONTH) &&
                                now.get(Calendar.DAY_OF_MONTH) < dobCalendar.get(Calendar.DAY_OF_MONTH))) {
                    age--;
                }
                if (age >= 18) {
                       // Client's age is 18 or more, proceed with sending data to Database.
                       Conn conn = new Conn();
                        try
                        {
                            pincodeno = Integer.parseInt(pincode);
                            if (valueOf(pincodeno).length() > 6){
                                throw new RuntimeException();
                            }
                        }
                        catch(RuntimeException ex)
                        {
                              JOptionPane.showMessageDialog(null,"Invalid Pin code.");
                              return;
                        }
                       String query = "insert into signup_details values('"+form_no+"','"+Name+"', '"+fname+"','"+new java.sql.Date(dob.getTime())+"','"+gender+"', '"+email+"', '"+ Marital_status+"', '"+address+"', '"+city+"', '"+state+"', "+pincode+")";
                       conn.s.executeUpdate(query);
                       
                       setVisible(false);
                       new SignUp2(form_no).setVisible(true);
 
            
                }
                 
            else {
                    // Tell the user that his age is not eligible for a bank account and exit the method.//
                    JOptionPane.showMessageDialog(null,"Your age is not eligible to open an active bank account. "
                            + "Grow up first.");
                    }   
                
            }
            catch(HeadlessException | SQLException ex){
               JOptionPane.showMessageDialog(null,ex);
           }
      
            
        }
        
    catch(HeadlessException ex)
    {
        JOptionPane.showMessageDialog(null,ex);
    }
}


    public static void main(String args[]) {
        new SignUp1();
    }
}