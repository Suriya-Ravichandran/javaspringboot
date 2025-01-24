package international;
import java.util.*;
import java.text.NumberFormat;
public class Mycode6{
	public static void printNumber(Locale locale) {
	      double db=15434.779;
		NumberFormat obj=NumberFormat.getNumberInstance(locale);
       String number=obj.format(db);
       System.out.println(number+" "+locale);
	}
	
	public static void main(String args[]) {
		printNumber(Locale.CANADA);
		printNumber(Locale.CHINA);
		printNumber(Locale.GERMANY);
		printNumber(Locale.KOREAN);
		printNumber(Locale.ITALY);
		printNumber(Locale.UK);
		printNumber(Locale.US);
		
	}
}