import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class Practical17 extends JFrame implements ItemListener
{
	JLabel l1,l2,l3;
	JComboBox jcb;
	String s[];
	int i = 0;
	Connection conn;
	Statement stmt;
	ResultSet rs;
	Practical17()
	{
		super("Practical17");
		setLayout(null);
		connect();
		l1 = new JLabel("Select Product: ");
		l1.setBounds(40,10,100,30);
		add(l1);
		jcb = new JComboBox();
		jcb.setBounds(150,10,100,30);
		try
		{
			stmt = conn.createStatement();
			rs = stmt.executeQuery("Select * from product");
			while(rs.next())
			{
				jcb.addItem(rs.getString(2));
			}
		}	catch(Exception e){System.out.println(e);}
		jcb.addItemListener(this);
		add(jcb);
		l2 = new JLabel("Product Name");
		l3 = new JLabel("Price");
		l2.setBounds(40,180,160,30);
		l3.setBounds(180,180,100,30);
		add(l2);
		add(l3);
		setVisible(true);
		setResizable(false);
		setSize(300,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[])
	{
		Practical17 obj = new Practical17();
	}
	
	void connect()
	{
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","");
		}
		catch(Exception e){System.out.println(e);}
	}
	public void itemStateChanged(ItemEvent f)
	{
		String s1 = f.getItem().toString();
		int j = 0;
		l2.setText("Product Name: "+s1);
		
		try{
		rs = stmt.executeQuery("Select * from Product where pname = '"+ s1 + "'");
		if(rs.next()) {
            j = rs.getInt("price");
            l3.setText("Price: " +j);
        }
		}
		catch(Exception e){}
	}
}