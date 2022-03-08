
package finaldb;

// import the connection
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.*; 



// getting the MySQL connection from the database
public class MySQLConnect {

    Connection con;

    public Connection getConn(){
        try{
            // input the class name
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbproject", "root", "");
//            JOptionPane.showMessageDialog(null, "Database Connection is" + " Successful... MySQL getconn method");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error in MySQLconnect getconn method " + e);  
        }
    return con;
    }
    
}
