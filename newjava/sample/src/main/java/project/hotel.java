package project;

import java.util.Scanner;
public class hotel {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
		String name;
		System.out.println("WELCOME TO HOTEL SUN WORLD");
		System.out.println(" enter the number of rooms you need");
		int no=s.nextInt();
		if(no<=10) {
			System.out.println("available");
			System.out.println("enter no of AC rooms");
			int room=s.nextInt();
			if(room>no) {
				System.out.println("invalid");
				
			}else{System.out.println("thankyou");}}
			
		else {
			System.out.println("not available rooms");

		}
	
		System.out.println("Enter the no of days to stay");
		int days=s.nextInt();
		System.out.println("Enter the below details");
		System.out.println("enter your name");
		String enter=s.next();
		System.out.println("enter number of members");
		int num=s.nextInt();
		System.out.println("enter aadhar number");
		int aad=s.nextInt();
		
	System.out.println(" room price=1000");
	
	int product=days  *1000  ;
	int pro=product *no ;
	System.out.println("TOTAL AMOUNT:"+pro);
	
	System.out.println("enter the payment method"); 
System.out.println("1.cash");
System.out.println("2.card");
System.out.println("enter 1 for cash and 2 for card");
 Scanner sm=new Scanner(System.in);
 int pay=sm.nextInt();
 switch(pay) {
 case 1:
	 System.out.println("kindly pay the CASH");
	 break;
 case 2:
	 System.out.println("CARD");
	 System.out.println("enter the pin number");
	 Scanner ss=new Scanner(System.in);
	 int rs=ss.nextInt();
	 System.out.println("payment recieved");
	 break;
	 default:
		 System.out.println("invalid choice");
 }
 System.out.println("complimentary breakfast menu");
 System.out.println("1)dosa");
 System.out.println("2)pongal");
 System.out.println("3)poori");
 System.out.println("4)idly");
int menu=sm.nextInt();
 switch(menu) {
 case 1:
	 System.out.println("dosa");
	 break;
 case 2:
	 System.out.println("pongal");
	 break;
 case 3:
	 System.out.println("poori");
	 break;
 case 4:
	 System.out.println("idly");
	 break;
	 default:
		 System.out.println("invalid choice");
 }
 System.out.println("your order has been recieved");
 System.out.println("THANKYOU");
 System.out.println("Have a great day");
 }

	}