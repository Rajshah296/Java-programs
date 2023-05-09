package prac_16_jdbc_connection;

import java.sql.*;

public class Prac_16_JDBC_connection{
    public static void main(String[] args) throws Exception {        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql:///Employee"
            ,"root", "password?!");
            Statement stat = con.createStatement();
            con.setAutoCommit(true);
            
            int rowsinserted = stat.executeUpdate("insert into employee values('Rohan','A50','Ahmedabad',5000)");
            System.out.println(rowsinserted + "rows inserted.");
            int rowsinserted2 = stat.executeUpdate("insert into employee values('Mohan','A51','Ahmedabad',4000)");
            System.out.println(rowsinserted2 + "rows inserted.");
            int rowsinserted3 = stat.executeUpdate("insert into employee values('Sohan','A52','Ahmedabad',12000)");
            System.out.println(rowsinserted3 + "rows inserted.");
            ResultSet rs = stat.executeQuery("Select * from employee where salary > 2000 and salary < 6000");
            while(rs.next()){
                System.out.println(rs.getString("ename") + "     "  + rs.getString("eid") + "     " + rs.getString("ecity") + "     " + rs.getInt("salary")+ "\n");
            }
            con.close();
        }
        catch(ClassNotFoundException | SQLException ex){
            System.out.println(ex); }
    }
}