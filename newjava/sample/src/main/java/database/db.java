package database;

import java.sql.*;
import java.util.*;
public class db {
public static void main(String[] args) throws SQLException
{
	Scanner s=new Scanner(System.in);
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dummydba","dummydba");  
		 Statement st=con.createStatement();
		 System.out.println("enter the table name");
		 String tabname=s.next();
		 System.out.println("enter the name");
		 String name=s.next();
		 ResultSet res=st.executeQuery("drop table "+tabname+" ");
		 System.out.println("values inserted successfully"); 
		 con.close();  
		  
	
}
}