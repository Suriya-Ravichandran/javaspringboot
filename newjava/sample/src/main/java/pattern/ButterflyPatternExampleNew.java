package pattern;
//import required classes  
import java.util.Scanner;   
//create class ButterflyPatternExampleNew to design butterfly pattern  
public class ButterflyPatternExampleNew {  
    // main() method start  
    public static void main(String[] args) {  
        int N;  
        // create Scanner class object to take input from user  
            Scanner scan = new Scanner(System.in);  
            System.out.println("Enter value of N");  
        N = scan.nextInt();  
          
        // call drawButterflyPattern() method of class ButterflyPattern  
        ButterflyPattern obj = new ButterflyPattern();  
        obj.drawButterflyPattern(N);  
          
        // close scanner class object  
        scan.close();  
          
    }  
}  
// create a separate class ButterflyPattern  
class ButterflyPattern{  
      
    // create user-defined method that will draw butterfly pattern  
    public void drawButterflyPattern(int N) {  
          
        // declare and initialize variables that helps to print Butterfly pattern  
        int space = 2*N-1;  
        int star = 0;  
          
        // use for loop   
        for(int j = 1; j <= 2*N-1; j++){  
                if(j <= N){  
                    space = space - 2;  
                    star++;  
                }  
                else {  
                    space = space + 2;  
                    star--;  
                }  
        // use for loop to print star  
                for(int m = 1; m <= star; m++){  
                     System.out.print("*");  
                }  
        // use for loop to print space  
                for(int n = 1; n <= space; n++){  
                    System.out.print(" ");  
                }  
        // use for loop to print star for special case  
                for(int p = 1; p <= star; p++){  
                    if(p != N){  
                System.out.print("*");  
            }  
                }  
                System.out.println();  
        }  
    }  
}  