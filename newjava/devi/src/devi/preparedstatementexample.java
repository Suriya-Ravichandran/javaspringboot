package devi;
import java.sql.*;

public class preparedstatementexample {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		// Register Driver Class
		
		String url
        = "jdbc:mysql://localhost:3306/deviprabhu"; // table details
    String username = "root"; // MySQL credentials
    String password = "root";
    String query = "insert into madhumitha values(?,?)";
    Class.forName(
        "com.mysql.cj.jdbc.Driver"); // Driver name
    Connection con = DriverManager.getConnection(
        url, username, password);
		 
		        
		 
		        // Prepare Statement
		        PreparedStatement myStmt
		            = con.prepareStatement(query);
		 
		        // Set Parameters
		       
		        myStmt.setString(1, "abcdefege");
		        myStmt.setInt(2, 23);
		 
		        // Execute SQL query
		        int res = myStmt.executeUpdate();
		 
		        // Display the records inserted
		        System.out.println(res + " records inserted");
		 
		        // Close the connection
		        con.close();
		    }
		}