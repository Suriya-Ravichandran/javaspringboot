package training;
import java.util.*;
import java.util.Locale;
import java.util.ResourceBundle;

public class Mycode 
{



	
	public static void main(String args[]) {
		ResourceBundle r=ResourceBundle.getBundle("Message",Locale.US);
		System.out.println("Message"+Locale.US+":"+r.getString("greeting"));	
		
		Locale.setDefault(new Locale("it","IT"));
		r=ResourceBundle.getBundle("Message");
		System.out.println("Message"+Locale.getDefault()+":"+r.getString("greeting"));
		
	}
	 }
