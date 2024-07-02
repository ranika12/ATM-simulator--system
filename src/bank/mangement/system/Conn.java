
package bank.mangement.system;
import java.sql.*;
public class Conn {
    
    Connection c;
    Statement s;
    Object con;
    public Conn()
    {
        try{
         
         c=DriverManager.getConnection("jdbc:mysql:///banakmanagementsystem","root","maxy");
         s=c.createStatement();
        
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
