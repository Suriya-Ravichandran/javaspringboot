package jdbcprogram;

import java.io.*;
import java.sql.*;


public class jdbcexample {

	{
	 
	
	        String url
	            = "jdbc:mysql://localhost:3306/employee"; // table details
	        String username = "root"; // MySQL credentials
	        String password = "root";
	        String query
	            = "select *from students"; // query to be run
	        try {
				Class.forName(
				    "com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // Driver name
	        Connection con = null;
			try {
				con = DriverManager.getConnection(
				    url, username, password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        System.out.println(
	            "Connection Established successfully");
	        Statement st = null;
			try {
				st = con.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        ResultSet rs = null;
			try {
				rs = st.executeQuery(query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // Execute query
	        try {
				rs.next();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        String name = null;
			try {
				name = rs.getString("name");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // Retrieve name from db
	 
	        System.out.println(name); // Print result on console
	        try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // close statement
	        try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // close connection
	        System.out.println("Connection Closed....");
	    }
	}
