package devi;

import java.sql.*;  
import java.io.*;
public class jdbcbatchprocessing {

	

			public static void main(String[] args) {
				
				try{  
				  
					String url
			        = "jdbc:mysql://localhost:3306/deviprabhu"; // table details
			    String username = "root"; // MySQL credentials
			    String password = "root";
			    //String query = "insert into madhumitha values(?,?)";
			    Class.forName(
			        "com.mysql.cj.jdbc.Driver"); // Driver name
			    Connection con = DriverManager.getConnection(
			        url, username, password);
				con.setAutoCommit(false);  
				Statement stmt = con.createStatement();  
				// Create SQL statement
				String SQL = "INSERT INTO deviprabhu (id, name, salary) " +
				             "VALUES(200,'Zia',30000)";
				// Add above SQL statement in the batch.
				stmt.addBatch(SQL);

				// Create one more SQL statement
				String SQL1 = "INSERT INTO deviprabhu (id, name, salary) " +
				             "VALUES(201,'ahmed',  35000)";
				// Add above SQL statement in the batch.
				stmt.addBatch(SQL1);
				
				
				// Create one more SQL statement
				String SQL2 = "UPDATE deviprabhu SET salary = 55000 " +
				             "WHERE id = 157";
				// Add above SQL statement in the batch.
				stmt.addBatch(SQL2);

				// Create an int[] to hold returned values
				int[] count = stmt.executeBatch(); 
				System.out.println(count);
				con.commit();  
				System.out.println("record successfully saved");  
				  
				con.close();//before closing connection commit() is called  

				}catch(Exception e)
				{
					//System.out.println(e);
					Throwable t = e.getCause();
		            System.out.println("Exception caught. Cause: " + t.toString());
		            System.out.println("------------------------------------");
		            e.printStackTrace();
					}  
				  
				} 

			}


