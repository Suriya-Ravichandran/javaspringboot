package project;
import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("*WELCOMEEEE TO FOODOZZZZ..THANK YOU FOR CHOOSING US!!*");
		
		System.out.println("Choose your comfort food:)");
		System.out.println("1.CHICKEN BRIYANI");
		System.out.println("2.CHICKEN FRIED RICE");
		System.out.println("3.MUTTON BRIYANI");
		System.out.println("4.SPICY GRILL");
		System.out.println("5.CHICKEN BARBECUE");
		System.out.println("6.CHICKEN NOODLES");
		System.out.println("7.VEG NOODLES");
		System.out.println("8.MIXED FRIED RICE");
		System.out.println("9.MOJITTO");
		System.out.println("10.ICECREAM");
		System.out.println("Choose your comfort food to know about the cost!!....");
		int x=sc.nextInt();
		switch(x)
		{
		case 1:
			System.out.println("The cost of chicken briyani is rs.200");
			System.out.println("enjoy your meal:)");
			break;
		case 2:
			System.out.println("The cost of chicken fried rice is rs.180");
			System.out.println("enjoy your meal:)");
			break;
		case 3:
			System.out.println("The cost of mutton briyani is rs.200");
			System.out.println("enjoy you meal:)");
			break;
		case 4:
			System.out.println("The cost of spicy grill half:rs.250 , full:rs.350");
			System.out.println("enjoy your meal:)");
			break;
		case 5:
			System.out.println("The cost of chicken barbecue half:rs.250 , full:rs.350");
			System.out.println("enjoy your meal:)");
			break;
		case 6:
			System.out.println("The cost of chicken noodles is rs.180");
			System.out.println("enjoy your meal:)");
			break;
		case 7:
			System.out.println("The cost of veg noodles is rs.170");
			System.out.println("enjoy your meal:)");
			break;
		case 8:
			System.out.println("The cost of mixed frice rice is rs.190");
			System.out.println("enjoy your meal:)");
			break;
		case 9:
			System.out.println("The cost of mojitto is rs.160");
			System.out.println("enjoy your meal:)");
			break;
		case 10:
			System.out.println("vanilla=rs.120");
			System.out.println("Chocolate=rs.120");
			System.out.println("butterscotch=rs.120");
			System.out.println("mango=rs.110");
			System.out.println("strawberry=rs.110");
			System.out.println("black current=rs.120");
			System.out.println("enjoy your meal:)");
			break;
		}
		System.out.println("*choose your method of payment*");
		String name,msg;
		int id;
		System.out.println("1.cash");
		System.out.println("2.Phone pay");
		System.out.println("3.credit or debit card");
		System.out.println("4.G pay");
		System.out.println("select your method of payment..");
		int y=sc.nextInt();
		switch(y)
		{
		case 1:
			System.out.println("We would love to hear about your experience with us!!we value your feedback:)");
			System.out.println("<<Share your feedback here>>");
			msg=sc.next();
			System.out.println("Thank you for choosing us,we are looking forward to serve you again:)");
			break;
		case 2:
			System.out.println("Enter your details please...");
			System.out.println("enter your name:");
			name=sc.next();
			System.out.println("enter your phone pay pin number:");
			id=sc.nextInt();
			System.out.println("PAYMENT SUCCESS!!");
			System.out.println("We would love to hear about your experience with us!!we value your feedback:)");
			System.out.println("<<Share your feedback here>>");
			msg=sc.next();
			System.out.println("Thank you for choosing us,we are looking forward to serve you again:)");
			break;
		case 3:
			System.out.println("enter the details please..");
			System.out.println("enter your name:");
			name=sc.next();
			System.out.println("enter your card pin number:");
			id=sc.nextInt();
			System.out.println("PAYMENT SUCCESS!!");
			System.out.println("We would love to hear about your experience with us!!we value your feedback:)");
			System.out.println("<<Share your feedback here>>");
			msg=sc.next();
		    System.out.println("Thank you for choosing us,we are looking forward to serve you again:)");
			break;
		case 4:
			System.out.println("Enter your details please...");
			System.out.println("enter your name:");
			name=sc.next();
			System.out.println("enter your G pay pin number:");
			id=sc.nextInt();
			System.out.println("PAYMENT SUCCESS!!");
			System.out.println("We would love to hear about your experience with us!!we value your feedback:)");
			System.out.println("<<Share your feedback here>>");
			msg=sc.next();
			System.out.println("Have a nice meal!!Thank you for choosing us,we are looking forward to serve you again:)");
			break;
			
			
			
		}

	}

}