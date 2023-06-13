package prac_18;

import java.awt.Component;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class Prac_18 extends JFrame implements ActionListener
{
	JTextField jtf1=new JTextField(10);
	JTextField jtf2=new JTextField(10);
	JLabel jlb1=new JLabel("id :",JLabel.CENTER);
	JLabel jlb2=new JLabel("name:",JLabel.CENTER);
	JLabel jlb3=new JLabel(" ");
	JLabel jlb4=new JLabel(" ");
        
        
	JButton jbinst=new JButton("Insert");
	JButton jbdlt=new JButton("Delete");
	JButton jbrst=new JButton("Reset");
	JButton jbupdt=new JButton("Update");
        
        JButton[] buttons = {jbinst,jbdlt,jbrst,jbupdt};
        Component[] comp = {jlb1,jlb2,jlb3,jlb4,jtf1,jtf2};
        
	Connection cn;
	Statement stmt;
	ResultSet rs;
        
	Prac_18()
	{	
            setLayout(null);
            setSize(600,400);
            setLocation(300,0);
            
            jlb1.setBounds(100,30,30,20);
            jtf1.setBounds(150,30,30,20);
            
            jlb2.setBounds(220,30,60,20);
            jtf2.setBounds(300,30,70,20);
            
            jbinst.setBounds(120,80,100,30);
            jbdlt.setBounds(240,80,100,30);
            jbrst.setBounds(120,140,100,30);
            jbupdt.setBounds(240,140,100,30);
            
            jlb3.setBounds(200,200,60,30);
            jlb4.setBounds(280,200,100,30);
            
            try
            {
		Class.forName("com.mysql.cj.jdbc.Driver");
		cn = DriverManager.getConnection("jdbc:mysql:///testdb","root","password?!");
                stmt=cn.createStatement();
                
            }
            catch(ClassNotFoundException | SQLException e){System.out.println(e);}
            for(JButton item : buttons){
                    add(item);
                    item.addActionListener(this);
            }
            for(Component item : comp){add(item);}
            
            setVisible(true);

	}
	
        @Override
	public void actionPerformed(ActionEvent e)
	{
		String s1,s2;
		if(e.getSource() == jbinst)
		{
			s1= jtf1.getText();
			s2= jtf2.getText();
			try
			{
                            int in=stmt.executeUpdate("INSERT INTO stud VALUES('"+s2+"','"+s1+"')");
                            if(in>0){
                                System.out.println("inserted") ;
                                String qs="select distinct* from stud";
                                rs=stmt.executeQuery(qs);
                                if(rs.next())
                                {
                                    String st1=s1;//rs.getString(1);
                                    String st2=s2;//rs.getString(2);
                                    jlb3.setText("id is: "+st1);
                                    jlb4.setText("name is: "+st2);
                                }
                            }
                        }
                        catch(SQLException ex)
                        {
                            System.out.println(ex);
                        }
                }
            if(e.getSource() == jbdlt)
            {
                try
                {       
               
                    String sql = "Delete from stud where id='"+jtf1.getText()+"'";
                    int rowsdeleted = stmt.executeUpdate(sql);
                    if(rowsdeleted > 0)
                        JOptionPane.showMessageDialog(null, "Record is deleted!!!");
                }
                catch(SQLException ex)
                {
                    System.out.println(ex);
                }
            }
                
		if(e.getSource() == jbupdt)
		{
                    try
                    {
			String sql="update stud set name='"+jtf2.getText()+"' where id='"+jtf1.getText()+"'";
			stmt.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "Record is Updated!!!");
                    }
			catch(SQLException ex)
			{
                            System.out.println(ex);
			}
		}
		if(e.getSource() == jbrst)
		{
			jtf1.setText("");
			jtf2.setText("");
			jlb3.setText("");
			jlb4.setText("");
		}
	}
        public static void main(String[] args) {
            new Prac_18();
    }
}
