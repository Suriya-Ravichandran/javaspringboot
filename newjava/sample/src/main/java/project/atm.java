package project;


import java.util.Scanner;

public class atm {

	public static void main(String[] args) {
	int pin=1234;
	int balance=1000;
	int  addamount=0;
	int takeamount=0;
	
	String name;
	
Scanner sc=new Scanner(System.in);
System.out.println("enter your pin number");
int password=sc.nextInt();

if (password==pin)
{
	
	System.out.println("enter your name");
	name=sc.next();
	
	System.out.println("welcome"+name);
	while(true)
	{
		System.out.println("press 1 to check your balance");
		System.out.println("press 2 to add amount");
		System.out.println("press 3 to take amount");
		
		
		System.out.println("press 4 to take resipt");
		System.out.println("press 5 to exit");
		
		
		int opt=sc.nextInt();
		switch(opt)
		{
		
		case 1:
			System.out.println("your current balance is"+balance);
			break;
		case 2:
			System.out.println("how much amount did you want you account");
			
			addamount=sc.nextInt();
			System.out.println("successfully credited");
			balance=addamount +balance;
					
			break;
		case 3:
			System.out.println("how much amount did you want to take ");
			takeamount=sc.nextInt();
			if (takeamount>balance)
			{
				System.out.println("your balance is insufficiant");
				System.out.println("try less then you available balance");
				
				
			}
			else
			{
				System.out.println("successfully taken");
				balance=balance-takeamount;
				
			}
			break;
		case 4:
			System.out.println("welcome to our ATM");
			System.out.println("available balance" +balance);
			System.out.println("amount deposited"+addamount);
			System.out.println("amount taken"+takeamount);
			System.out.println("thanks for coming");
			
			break;
			default:
				System.out.println("press the number below 5");
				break;
				
		}
		
		if(opt==5)
		{
			System.out.println("thank you");
			
			break;
		}
		
	}
}
else
{
	System.out.println("wrong pin");
	
			
			
			
			
		
		}
	}
	
	




	
	

	}


