import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
public class Practical18 extends JApplet implements ActionListener
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
	Connection cn;
	Statement stmt;
	ResultSet rs;
	public void init()
	{
		//initializeDB();
		jbinst.addActionListener(this);
		jbdlt.addActionListener(this);
		jbrst.addActionListener(this);
		jbupdt.addActionListener(this);
		JPanel jp=new JPanel();
		jp.setLayout(new GridLayout(0,2));
		jp.add(jlb1);
		jp.add(jtf1);
		jp.add(jlb2);
		jp.add(jtf2);
		jp.add(jbinst);
		jp.add(jbdlt);
		jp.add(jbrst);
		jp.add(jbupdt);
		jp.add(jlb3);
		jp.add(jlb4);
		add(jp);
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","");stmt=cn.createStatement();
		}
		catch(Exception e){System.out.println(e);}
		
	}
	private void initializeDB()
	{
		
	}
	public void actionPerformed(ActionEvent e)
	{
		/*String s1,s2;
		if(e.getActionCommand().equals("Insert"))
		{
			s1= jtf1.getText();
			s2= jtf2.getText();
			try
			{
				int in=stmt.executeUpdate("INSERT INTO stud VALUES('"+s1+"','"+s2+"')");
				if(in>0)
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
			catch(SQLException ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("Delete"))
		{
			try
			{
				String sql = "delete from stud " + "where id="+jtf1.getText();
				stmt.execute(sql);
				JOptionPane.showMessageDialog(null, "Record is deleted!!!");
			}
			catch(SQLException ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("Update"))
		{
			try
			{
				String sql="update stud set name='"+jtf2.getText()+"' where id ="+jtf1.getText()+"";
				stmt.execute(sql);
				JOptionPane.showMessageDialog(null, "Record is Updated!!!");
			}
			catch(SQLException ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("Reset"))
		{
			jtf1.setText("");
			jtf2.setText("");
			jlb3.setText("");
			jlb4.setText("");
		}*/
	}
}
/*<applet code="Practical18.class" width=500 height=300></applet>*/
