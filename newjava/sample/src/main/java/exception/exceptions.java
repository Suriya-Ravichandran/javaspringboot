package exception;
import java.util.*; 

public class exceptions {
	public static void main(String[] args) {
		
	try {
 Scanner scanner = new Scanner(System.in);
	System.out.println("ENTER THE FIRST NUMBER:");
	int x = scanner.nextInt();
	
	System.out.println("ENTER THE SECOND NUMBER");
	int y= scanner.nextInt();
	
	int z= x/y;
	System.out.println(" result = "+ z);
	}
	
	 catch(ArithmeticException e) {
		 System.out.println("no number can be didvided by zero..IDIOT!!");
		}
	
	catch(InputMismatchException e) {
		System.out.println("dudeee enter a number!!!");
	}
	finally {
		System.out.println("THIS WILL PRINT NO MATTER WHAT");
	}
}
	}	 
		

	
	

