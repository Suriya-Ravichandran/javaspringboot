package project;


import java.util.Scanner;
public class menumain {

	public static void main(String[] args) {
		System.out.println("Welcome to D.S Restaurent");
		System.out.println("-------------------------");
		System.out.println("Menu:");
		Scanner s=new Scanner(System.in);
        System.out.println("1.Chicken biriyani");
        System.out.println("2.Mutton biriyani");
        System.out.println("3.Parota");
        System.out.println("4.Chicken 65");
		System.out.println("#####################");
		System.out.println("Choose 1to4 to select the food: ");
		int x=s.nextInt();
		switch(x) {
		case 1:
			System.out.println("You've selected Chicken biriyani");
			System.out.println("Price:200");
			break;
		case 2:
			System.out.println("You've selected Mutton biriyani");
			System.out.println("Price:300");
			break;
		case 3:
			System.out.println("You've selected Parota");
			System.out.println("Price:55");
			break;
		case 4:
			System.out.println("You've selected Chicken 65");
			System.out.println("Price:66");
			break;
			default:
				System.out.println("Invalid selection!!!");
		}
		System.out.println("##############");
		System.out.println("PAYMENT METHOD:");
		System.out.println("1.Cash");
		System.out.println("2.Card");
		int y=s.nextInt();
		switch(y) {
		case 1:
			 System.out.println("Received cash");
			 break;
		case 2:
			 System.out.println("Received payment");
			 break;
			 default:
				 System.out.println("Invalid Selection!!");
		}
		System.out.println("########################");
		System.out.println("Thank YOU!!");
		System.out.println("Visit Again");
		
		
		
		
	}

}
