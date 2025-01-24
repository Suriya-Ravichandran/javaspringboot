package array;
import java.util.Scanner;
public class array {
public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number of element do you want");
		int size = sc.nextInt();
		int mark[]=new int[size];
		System.out.println("your size of value is "+size);
		for(int i=0;i<size;i++)
		{
			mark[i]=sc.nextInt();
		}
		System.out.println("array elemnts are....");
		for(int i=0;i<size;i++) 
		{
			System.out.println(mark[i]);
		}
		}
	}







