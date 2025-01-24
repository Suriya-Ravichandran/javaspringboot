package project;
import java.util.Scanner;


public class mainClass {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String userName, password, giftName;
		int option, withdrawAmt, debitAmt, giftAmt, bankBalance;
		
		System.out.println("Welcome to the ATM Machine! ");
		System.out.println("Please input your login information: ");
		System.out.println("Username: ");
		
		userName = s.next();
		
		System.out.println("Password: ");
		
		password = s.next();
		

//		switch (userName) {
//		
//		case "Bob":
			if(userName.equals("livewire") && password.equals("1234") ) {
				System.out.println("Login Successful!");
				bankBalance = 35000;
				System.out.println("Your bank balance is $" + bankBalance);
				System.out.println("What would you like to do?");
				System.out.println("1 - Withdraw \n2 - Debit \n3 - Gift");
				
				option = s.nextInt();
				
				switch (option) {
				
				case 1:
					System.out.println("What amount would you like to withdraw?");
					withdrawAmt = s.nextInt();
					bankBalance -= withdrawAmt;
					System.out.println(withdrawAmt + " has been successfully withdrawn");
					System.out.println("Your new bank balance is " + bankBalance);
					break;
				
				case 2:
					System.out.println("What amount would you like to debit?");
					debitAmt = s.nextInt();
					System.out.println(debitAmt + " has been successfully debitted");
					bankBalance += debitAmt;
					System.out.println("Your new bank balance is " + bankBalance);
		
					break;
				case 3:
					System.out.println("To whom would you like to gift money?");
					giftName = s.next();
					System.out.println("How much would you like to gift them?");
					giftAmt = s.nextInt();
					System.out.println("An amount of " + giftAmt + " has successfully been gifted to " + giftName);
					bankBalance -= giftAmt;
					System.out.println("Your new bank balance is " + bankBalance);
					break;
				default:
					System.out.println("That option is unavailable");
					break;
					
				}
				
				if (bankBalance< 0) {
					System.out.println("Please recharge your account");
				}
				
			} else if(userName.equals("Mary")  && password.equals("Password123%")) {
				System.out.println("Login Successful");
				bankBalance = 12000;
				System.out.println("Your bank balance is " + bankBalance);
				System.out.println("What would you like to do?");
				System.out.println("1 - Withdraw \n 2 - Debit \n3 - Gift");
				
				
				option = s.nextInt();
				
				switch (option) {
				
				case 1:
					System.out.println("What amount would you like to withdraw?");
					withdrawAmt = s.nextInt();
					bankBalance -= withdrawAmt;
					System.out.println(withdrawAmt + " has been successfully withdrawn");
					System.out.println("Your new bank balance is " + bankBalance);
					break;
				
				case 2:
					System.out.println("What amount would you like to debit?");
					debitAmt = s.nextInt();
					System.out.println(debitAmt + " has been successfully debitted");
					bankBalance += debitAmt;
					System.out.println("Your new bank balance is " + bankBalance);
		
					break;
				case 3:
					System.out.println("To whom would you like to gift money?");
					giftName = s.next();
					System.out.println("How much would you like to gift them?");
					giftAmt = s.nextInt();
					System.out.println("An amount of " + giftAmt + " has successfully been gifted to " + giftName);
					bankBalance -= giftAmt;
					System.out.println("Your new bank balance is " + bankBalance);
					break;
				default:
					System.out.println("That option is unavailable");
					break;
					
				} 
				if (bankBalance< 0) {
					System.out.println("Please recharge your account");
				}
			}else if(password.equals("Java123%") && userName.equals("Dan")) {
				System.out.println("Login Successful");
				bankBalance = 90000;
				System.out.println("Your bank balance is " + bankBalance);
				System.out.println("What would you like to do?");
				System.out.println("1 - Withdraw \n2 - Debit \n3-Gift");
				
				option = s.nextInt();
				
				switch (option) {
				
				case 1:
					System.out.println("What amount would you like to withdraw?");
					withdrawAmt = s.nextInt();
					bankBalance -= withdrawAmt;
					System.out.println(withdrawAmt + " has been successfully withdrawn");
					System.out.println("Your new bank balance is " + bankBalance);
					break;
				
				case 2:
					System.out.println("What amount would you like to debit?");
					debitAmt = s.nextInt();
					System.out.println(debitAmt + " has been successfully debitted");
					bankBalance += debitAmt;
					System.out.println("Your new bank balance is " + bankBalance);
		
					break;
				case 3:
					System.out.println("To whom would you like to gift money?");
					giftName = s.next();
					System.out.println("How much would you like to gift them?");
					giftAmt = s.nextInt();
					System.out.println("An amount of " + giftAmt + " has successfully been gifted to " + giftName);
					bankBalance -= giftAmt;
					System.out.println("Your new bank balance is " + bankBalance);
					break;
				default:
					System.out.println("That option is unavailable");
					break;
					
				}
				if (bankBalance< 0) {
					System.out.println("Please recharge your account");
				}
		} else {
			System.out.println("Username and password does not match");
		}
		
	
		
	}

}
