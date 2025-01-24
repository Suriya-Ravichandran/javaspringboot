package project;


import java.util.Scanner;
public class medical1 
{
    
public static Scanner input = new Scanner(System.in);
public static String again;
public static int choose,quantity=1;
public static double total=0,pay;
public static void menu(){
System.out.println("\t\t\t\t           MEDICAL ORDER           ");
System.out.println("\t\t\t\t   1. COUGHSYRUP           RS:75");
System.out.println("\t\t\t\t   2. MOVESPRAY            RS:85");
System.out.println("\t\t\t\t   3. IRONTABLETS          RS:105");
System.out.println("\t\t\t\t   4. INSULIN              RS:180");
System.out.println("\t\t\t\t   5. PARACETEMOL          RS:20");
System.out.println("\t\t\t\t   6. CANCEL                     ");
}
public static void order(){
System.out.println("Press 1 to buy COUGHSYRUP , Press 2 to buy MOVESPRAY , Press 3 to buy IRONTABLETS , Press 4 to buy INSULIN , Press 5 to buy  PARACETEMOL  and Press 6 to CANCEL  ");
System.out.print("Press you want to buy? :");
choose = input.nextInt();

if(choose==1){
System.out.println("You choose COUGHSYRUP");
System.out.print("How many COUGHSYRUP you want to Buy? :");
quantity =input.nextInt();
total = total +(quantity*75);
System.out.println("You want to buy again? ");
System.out.println("Press Y for Yes and N for No : ");
again = input.next();
if(again.equalsIgnoreCase("Y")){
order();
}else{
System.out.println("Enter a payment ");
System.out.print("PAYMENT MODE :CASH / GPAY / CARD :");
pay = input.nextDouble();
if(pay <=total){
System.out.println("Not enough payment");
}else{
System.out.println("Total price is " + total);
total = pay-total;
System.out.println("The change is " + total);
System.out.println("THANKS FOR BUYING ");
}
}

}else if(choose==2){
System.out.println("You choose MOVESPRAY");
System.out.print("How many MOVESPRAY you want to Buy? :");
quantity =input.nextInt();
total = total +(quantity*85);
System.out.println("You want to buy again? ");
System.out.println("Press Y for Yes and N for No : ");
again = input.next();
if(again.equalsIgnoreCase("Y")){
order(); 
}else{
System.out.println("Enter a payment ");
System.out.print("PAYMENT MODE :CASH / GPAY / CARD :");
pay = input.nextDouble();
if(pay <=total){
System.out.println("Not enough payment");
}else{
System.out.println("Total price is " + total);
total = pay-total;
System.out.println("The change is " + total);
System.out.println("THANKS FOR BUYING ");
}
}

}else if(choose==3){
System.out.println("You choose IRONTABLETS");
System.out.print("How many IRONTABLETS you want to Buy? :");
quantity =input.nextInt();
total = total +(quantity*105);
System.out.println("You want to buy again? ");
System.out.println("Press Y for Yes and N for No : ");
again = input.next();
if(again.equalsIgnoreCase("Y")){
order();
}else{
System.out.println("Enter a payment ");
System.out.print("PAYMENT MODE :CASH / GPAY / CARD :");;
pay = input.nextDouble();
if(pay <=total){
System.out.println("Not enough payment");
}else{
System.out.println("Total price is " + total);
total = pay-total;
System.out.println("The change is " + total);
System.out.println("THANKS FOR BUYING ");
}
}

}else if(choose==4){
System.out.println("You choose INSULIN");
System.out.print("How many INSULIN you want to Buy? :");
quantity =input.nextInt();
total = total +(quantity*180);
System.out.println("You want to buy again? ");
System.out.println("Press Y for Yes and N for No : ");
again = input.next();
if(again.equalsIgnoreCase("Y")){
order();
}else{
System.out.println("Enter a payment ");
System.out.print("PAYMENT MODE :CASH / GPAY / CARD :");
pay = input.nextDouble();
if(pay <=total){
System.out.println("Not enough payment");
}else{
System.out.println("Total price is " + total);
total = pay-total;
System.out.println("The change is " + total);
System.out.println("THANKS FOR BUYING ");
}
}

}else if(choose==5){
System.out.println("You choose PARACETEMOL");
System.out.print("How many PARACETEMOL you want to Buy? :");
quantity =input.nextInt();
total = total +(quantity*20);
System.out.println("You want to buy again? ");
System.out.println("Press Y for Yes and N for No : ");
again = input.next();
if(again.equalsIgnoreCase("Y")){
order();
}else{
System.out.println("Enter a payment ");
System.out.print("PAYMENT MODE :CASH / GPAY / CARD :");
pay = input.nextDouble();
if(pay <=total){
System.out.println("Not enough payment");
}else{
System.out.println("Total price is " + total);
total = pay-total;
System.out.println("The change is " + total);
System.out.println("THANKS FOR BUYING ");
}
}

}else if(choose==6){
System.out.println("YOU ORDER HAS BEEN CANCELLED !!! ");
System.exit(0);
}else{
System.out.println("Choose 1 to 6 only!");
order();
}
}
public static void main(String[] args) {
menu();
order();
} 
}