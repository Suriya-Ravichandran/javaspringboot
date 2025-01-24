package devi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.*;


public class jdbcprograms {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url
        = "jdbc:mysql://localhost:3306/deviprabhu"; // table details
    String username = "root"; // MySQL credentials
    String password = "root";
    String query
        = "select *from madhumitha"; // query to be run
    Class.forName(
        "com.mysql.cj.jdbc.Driver"); // Driver name
    Connection con = DriverManager.getConnection(
        url, username, password);
    System.out.println(
        "Connection Established successfully");
    Statement st = con.createStatement();
    ResultSet rs
        = st.executeQuery(query); // Execute query
    //rs.next();
    int i=1;
    while(rs.next())
    {
    String name
        = rs.getString("name"); // Retrieve name from db
    int id
    = rs.getInt("id");
    
    System.out.println(name);
    System.out.println(id);
    
    }
    // Print result on console
    st.close(); // close statement
    con.close(); // close connection
    System.out.println("Connection Closed....");

	}

}
