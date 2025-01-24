package exception;
import java.util.Scanner;
public class exceptionhandlingthrow {
public static void main(String[] args) throws ArithmeticException {
				Scanner sc=new Scanner(System.in);
				while(true){
					try {
					
				System.out.println("Enter a First Number");
				int a = sc.nextInt();
				System.out.println("Enter a Second Number");
				int b=sc.nextInt();
				int div=a/b;
				if(b==0) {
					throw new  ArithmeticException();
				}
				System.out.println("Divition = "+div);
					}
				catch(Exception e)
					{}
				
				System.out.println("Important codes");
				}
		}
		}
			

