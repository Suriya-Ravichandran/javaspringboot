package project;
import java.util.Scanner;
public class pizza 
{public static Scanner input = new Scanner(System.in);
    public static String again;
    public static int choose,quantity=1;
    public static double total=0,pay;
    public static void menu(){
    System.out.println("\t\t\t\t           PIZZA MENU           ");
    System.out.println("\t\t\t\t   1. CHEESEBURST         RS:195");
    System.out.println("\t\t\t\t   2. CHICKENCOMBO        RS:485");
    System.out.println("\t\t\t\t   3. VEGCOMBO            RS:365");
    System.out.println("\t\t\t\t   4. CANCEL                    ");
    }
    
    public static void order(){
    System.out.println("Press 1 to CHEESEBURST , Press 2 to CHICKENCOMBO , Press 3 to VEGCOMBO and Press 4 to CANCEL");
    System.out.print("Press you want to buy? :");
    choose = input.nextInt();
    if(choose==1){
        System.out.println("You choose CHEESEBURST");
        System.out.print("How many CHEESEBURST you want to Buy? :");
        quantity =input.nextInt();
        total = total +(quantity*195);
        
        System.out.println("You want to buy again? ");
        System.out.println("Press Y for Yes and N for No : ");
        again = input.next();
        if(again.equalsIgnoreCase("Y")){
            order();
        }else{
            System.out.println("Enter a payment ");
            pay = input.nextDouble();
            if(pay <=total){
              System.out.println("Not enough payment");
            }else{
            System.out.println("Total price is " + total);
            total = pay-total;
            System.out.println("The change is " + total);
            }
        }
    }else if(choose==2){
        System.out.println("You choose CHICKENCOMBO");
        System.out.print("How many CHICKENCOMBO you want to Buy? :");
        quantity =input.nextInt();
        total = total +(quantity*485);
        
        System.out.println("You want to buy again? ");
        System.out.println("Press Y for Yes and N for No : ");
        again = input.next();
        if(again.equalsIgnoreCase("Y")){
            order(); 
        }else{
            System.out.println("Enter a payment ");
            pay = input.nextDouble();
            if(pay <=total){
              System.out.println("Not enough payment");
            }else{
            System.out.println("Total price is " + total);
            total = pay-total;
            System.out.println("The change is " + total);
            }
        }
      }else if(choose==3){
        System.out.println("You choose VEGCOMBO");
        System.out.print("How many VEGCOMBO you want to Buy? :");
        quantity =input.nextInt();
        total = total +(quantity*365);
        
        System.out.println("You want to buy again? ");
        System.out.println("Press Y for Yes and N for No : ");
        again = input.next();
        if(again.equalsIgnoreCase("Y")){
            order();
        }else{
            System.out.println("Enter a payment ");
            pay = input.nextDouble();
            if(pay <=total){
              System.out.println("Not enough payment");
            }else{
            System.out.println("Total price is " + total);
            total = pay-total;
            System.out.println("The change is " + total);
            }
        }
    }else if(choose==4){
        System.exit(0);
    }else{
        System.out.println("Choose 1 to 4 only!");
        order();
    }
    }
    public static void main(String[] args) {
       menu();
       order();
    } 
}

