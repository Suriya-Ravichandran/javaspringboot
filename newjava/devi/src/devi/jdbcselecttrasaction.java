package devi;
import java.sql.*;  
import java.io.*;
public class jdbcselecttrasaction {

	public static void main(String[] args) throws IOException,SQLException {
		
	String url      = "jdbc:mysql://localhost:3306/deviprabhu"; // table details
    String username = "root"; // MySQL credentials
    String password = "root";
		
		try(Connection con = DriverManager.getConnection(url, username, password))
		{  
		  
		PreparedStatement ps=con.prepareStatement("select * from deviprabhu where id = ?");  
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  

		System.out.println("enter id");  
		String s1=br.readLine();  
		int id=Integer.parseInt(s1);
		
		ps.setInt(1,id);  

		ResultSet rs = ps.executeQuery();  
		while(rs.next()){ 
		System.out.println("id : "+rs.getInt("id")); 
		System.out.println("name : "+rs.getString("name")); 
		System.out.println("salary : "+rs.getInt("salary")); 
		System.out.println("------------------------------"); 
		}
		
		  
		con.close();

		}catch(Exception e)
		{
			System.out.println(e);
			Throwable t = e.getCause();
            System.out.println("Exception caught. Cause: " + t.toString());
            System.out.println("------------------------------------");
            e.printStackTrace();
			}  
		  
		} 

	}


