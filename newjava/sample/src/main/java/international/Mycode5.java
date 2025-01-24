package international;
import java.util.*;
import java.text.DateFormat;
public class Mycode5{
	public static void printdate(Locale locale) {
	DateFormat obj=DateFormat.getDateInstance(DateFormat.DEFAULT,locale);
       Date currentDate=new Date();
       String date=obj.format(currentDate);
       System.out.println(date+" "+locale);
	}
	
	public static void main(String args[]) {
		printdate(Locale.CANADA);
		printdate(Locale.CHINA);
		printdate(Locale.GERMANY);
		printdate(Locale.KOREAN);
		printdate(Locale.ITALY);
		printdate(Locale.UK);
		printdate(Locale.US);
		printdate(Locale.ENGLISH);
		
	}
	
	
}
