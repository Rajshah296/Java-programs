package prac_17;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class Prac_17 extends JFrame implements ItemListener
{
	JLabel l1,p_name,p_price;
	JComboBox jcb;
	String s[];
	int i = 0;
	Connection conn;
	Statement stmt;
	ResultSet rs;
	Prac_17()
	{
		super("Prac_17");
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
		}	catch(SQLException e){System.out.println(e);}
		jcb.addItemListener(this);
		add(jcb);
		p_name = new JLabel("Product Name");
		p_price = new JLabel("Price");
		p_name.setBounds(40,120,160,30);
		p_price.setBounds(220,120,100,30);
		add(p_name);
		add(p_price);
		setVisible(true);
		setResizable(false);
		setSize(300,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[])
	{
		Prac_17 obj = new Prac_17();
	}
	
	void connect()
	{
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","");
		}
		catch(ClassNotFoundException | SQLException e){System.out.println(e);}
	}
        @Override
	public void itemStateChanged(ItemEvent f)
	{
		String s1 = f.getItem().toString();
		int j = 0;
		p_name.setText("Product Name: "+s1);
		
		try{
		rs = stmt.executeQuery("Select * from Product where pname = '"+ s1 + "'");
		if(rs.next()) {
            j = rs.getInt("price");
            p_price.setText("Price: " +j);
        }
		}
		catch(SQLException e){}
	}
}