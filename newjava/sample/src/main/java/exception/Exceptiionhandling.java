package exception;
import java.util.Scanner;
public class Exceptiionhandling {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter a First Number");
		int a = sc.nextInt();
		System.out.println("Enter a Second Number");
		int b=sc.nextInt();
		int d=a/b;
		System.out.println("Divition = "+d);
	}
}}


