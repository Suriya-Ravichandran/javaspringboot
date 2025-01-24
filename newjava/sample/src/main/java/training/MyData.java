package training;
import java.sql.*;

	import java.sql.*;

	public class MyData {
		
		public static void main(String[] args) throws SQLException ,ClassNotFoundException
		   {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "java", "1234");
			Statement st = con.createStatement();
//st.executeUpdate( "Create Table Amazon( Id varchar2(10),Name varchar2(20),Location varchar2(20))" );
//st.executeUpdate("Insert into Amazon10 values('E101','Bala','Chennai')");
//st.executeUpdate("Insert into Amazon values('E102','kishore','Chennai')");
	
	
//st.executeUpdate("Update Amazon Set Location = 'Coimbatore' where name = 'Bala'");
st.executeUpdate("Delete from Amazon where Id='E101'");
	

		   System.out.println("Table is created");
		   }
		
		
			}


