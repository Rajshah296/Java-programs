package ASimulatorSystem;
import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;

    public Conn(){
        try{
            c = DriverManager.getConnection("jdbc:mysql:///bms", "root", "password?!");
            s = c.createStatement();
            
        } 
        
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}