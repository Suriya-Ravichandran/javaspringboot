import java.util.Scanner;
public class nested 
{
public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("enter a first value");
		int x=sc.nextInt();
		System.out.println("enter a second value");
		int y=sc.nextInt();
		System.out.println("enter a third value");
		int z=sc.nextInt();
		if(x>y)
		{
			System.out.println("x is greater ");
		
		    if(x>z)
		{
			System.out.println("x is greater ");
		}
		    else
		{
			System.out.println("z is greater ");
		}
		}
		else if(y>z)
		{
			System.out.println("y is greater ");
		}
		else
		{
			System.out.println("z is greater ");
		}
		}
	}


