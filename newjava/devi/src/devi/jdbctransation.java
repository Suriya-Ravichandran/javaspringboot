package devi;
import java.sql.*;  
import java.io.*;
public class jdbctransation {

	public static void main(String[] args) throws IOException,SQLException {
		
		try{  
		  
			String url
	        = "jdbc:mysql://localhost:3306/deviprabhu"; // table details
	    String username = "root"; // MySQL credentials
	    String password = "root";
	    //String query = "insert into madhumitha values(?,?,?)";
	    Class.forName(
	        "com.mysql.cj.jdbc.Driver"); // Driver name
	    Connection con = DriverManager.getConnection(
	        url, username, password);
		con.setAutoCommit(false);  
		  
		//Statement stmt = con.createStatement();
		PreparedStatement ps=con.prepareStatement("insert into deviprabhu values(?,?,?)");  
		  
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		while(true){  
		  
		System.out.println("enter id");  
		String s1=br.readLine();  
		int id=Integer.parseInt(s1);  
		  
		System.out.println("enter name");  
		String name=br.readLine(); 
		
		
		System.out.println("enter salary");  
		String s3=br.readLine();  

		int salary=Integer.parseInt(s3);  
		  
		ps.setInt(1,id);  
		ps.setString(2,name);  
		ps.setInt(3,salary);  
		//insert into deviprabhu values(id,name,salary)
		int rollno = 0;
		//ps.setInt(4,rollno);  
		ps.executeUpdate();  
		  
		System.out.println("commit/rollback");  
		String answer=br.readLine();  
		if(answer.equals("commit")){  
		con.commit();  
		}  
		if(answer.equals("rollback")){  
		con.rollback();  

		}  
		  
		  
		System.out.println("Want to add more records y/n");  
		String ans=br.readLine();  
		if(ans.equals("n")){  
		break;  
		}  
		  
		}  
		//con.commit();  
		System.out.println("record successfully saved");  
		  
		con.close();//before closing connection commit() is called  

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


