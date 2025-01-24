import java.util.Scanner;
public class calc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,sum;
		System.out.println("enter the 1st no:");
		a=sc.nextInt();
		System.out.println("enter the 2st no:");
		b=sc.nextInt();
		sum=a+b;
		System.out.println("addition is:"+sum);
		add1 h=new add1();
		h.add(a, b);

	}}
