package Project;
import java.sql.*;
public class ConnectionProvider {
 
 public static Connection getCon() {
     //connecttion is not fixed
        Connection con = null; // Initialize the connection object
        
        try {
            // Register MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish connection to the database
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qems", "root", "8118"); // Add username and password
            
            System.out.println("connected");
//             return con;
            
        } catch (Exception e) {
            e.printStackTrace(); // Print the exception stack trace to the console
        }
        
        return con; // Return the connection object
    }
 
 }
  

