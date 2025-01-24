package string;
import java.util.Scanner;

public class string4 {

	public static void main(String[] args) 
	
		{
			Scanner sc=new Scanner(System.in);
	        String name,msg="Haiii ",info;
	        int len;
	        System.out.println("Enter your name");
	        name =sc.next();
	        System.out.println("Name = "+name);
	        len = name.length();
	        System.out.println("Length of name is "+len);
	        info =msg+name;
	        System.out.println("info = "+info);
	        char a=name.charAt(3);
	        System.out.println("middle of ur name = "+a);
		}
}

