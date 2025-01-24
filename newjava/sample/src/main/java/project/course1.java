package project;
import java.util.Scanner;
public class course1 {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("------------COURSE MANAGEMENT SYSTEM--------------");
		System.out.println("enter your choice");
           
		int x=a.nextInt();
		if(x==1)
		{
			System.out.println("LOGIN");
			String username;
			System.out.println("enter username:");
		    username =a.next();
	        System.out.println("enter password:");
			int z=a.nextInt();
			System.out.println("Login successful");
		}
		else
		{
			System.out.println("SIGN IN");
			String username;
			System.out.println("enter name:");
			username =a.next();
			System.out.println("enter mobile no:");
			int y=a.nextInt();
			System.out.println("enter password:");
			int z=a.nextInt();
			System.out.println("confirm password:");
			int w=a.nextInt();
	        System.out.println("Account created successfully");
		}
		System.out.println("\nlist of courses\n1.JAVA\n2.PYTHON\n3.C\n4.C++\n5.HTML\n6.CSS\n7.PHP\n");
		System.out.println("enter the course number");
		int c=a.nextInt();
		switch(c)
		{
		case 1:
		     System.out.println("1.JAVA");
		     break;
		case 2:
			 System.out.println("2.PYTHON");
		     break;
		case 3:
			 System.out.println("3.C");
		     break;
		case 4:
			 System.out.println("4.C++");
		     break;
		case 5:
			 System.out.println("5.HTML");
		     break;
		case 6:
			 System.out.println("6.CSS");
		     break;
		case 7:
			 System.out.println("7.PHP");
		     break;
		}
		
    if(c==1)
    {
    	System.out.println("\nCourse code:1\nCourse Title:Java\nDuration: 60 hours\nTopics:40\nCourse Fees:10000");
    }
    else if(c==2) 
    {
    	System.out.println("\nCourse code:2\nCourse Title:Python\nDuration: 24 hours\nTopics:20\nCourse Fees:8000");
    	
    }
    else if(c==3)
    {
    	System.out.println("\nCourse code:3\nCourse Title:C\nDuration: 50 hours\nTopics:35\nCourse Fees:11000");
    }
    else if(c==4)
    {
    	System.out.println("\nCourse code:4\nCourse Title:C++\nDuration: 25 hours\nTopics:30\nCourse Fees:9000");
    }
    else if(c==5)
    {
    	System.out.println("\nCourse code:5\nCourse Title:Html\nDuration: 64 hours\nTopics:55\nCourse Fees:16000");
    }
    else if(c==6)
    {
    	System.out.println("\nCourse code:6\nCourse Title:Css\nDuration: 54 hours\nTopics:55\nCourse Fees:13000");
    }
    else
    {
    	System.out.println("\nCourse code:7\nCourse Title:php\nDuration: 55 hours\nTopics:55\nCourse Fees:15000");
    }
    	System.out.println("Payment process:");
    	System.out.println("mode of payment:");
    	System.out.println("\n1.Net banking\n2.Credit/Debit card\n3.UPI\n4.Bank transfer");
    	System.out.println("Enter your payment mode");
    	int b=a.nextInt();
   if(b==1)
   {
	   
	   System.out.println("Mode of payment is Net banking");
	   System.out.println("enter your bank details");
	   String Name;
	   String Bankname;
	   System.out.println("\n 1.Bankname:");
	   Bankname=a.next();
	   System.out.println("\n 2.Name:");
	   Bankname=a.next();
	   String IFSCcode ;
	   System.out.println("3.IFSC code:");
	   IFSCcode =a.next();
	   System.out.println("4.Account no:");
	   int h=a.nextInt();
	   System.out.println("5.Cvv no:");
	   int i=a.nextInt();
	  }
   else if(b==2)
   {
   
	   System.out.println("Mode of payment is Credit card/Debit card");
	   String Name;
	   String Bankname;
	   System.out.println(" 1.Bankname:");
	   Bankname=a.next();
	   System.out.println(" 2.Name:");
	   Bankname=a.next();
	   String IFSCcode ;
	   System.out.println("3.IFSC code:");
	   IFSCcode =a.next();
	   System.out.println("4.Account no:");
	   int h=a.nextInt();
	   System.out.println("5.Cvv no:");
	   int i=a.nextInt();
   }
   else if(b==3)
	   {
	   System.out.println("Mode of payment is UPI");
	   System.out.println("Enter upi no:");
	}
   else
   {
	   System.out.println("no other payment mode");
   }
   System.out.println("PAYMENT SUCCESSFULL");
   
   }
}


	


