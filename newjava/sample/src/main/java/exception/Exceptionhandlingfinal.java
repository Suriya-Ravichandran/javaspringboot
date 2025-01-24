package exception;
import java.util.Scanner;
public class Exceptionhandlingfinal 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			try {
			
		System.out.println("Enter a First Number");
		int a = sc.nextInt();
		System.out.println("Enter a Second Number");
		int b=sc.nextInt();
		int div=a/b;
		System.out.println("Divition = "+div);
			}catch(Exception e)
			{}
         finally
			 {
			System.out.println("Im gonna get exicuted what ever happends");	
			}
	
		}
}}
