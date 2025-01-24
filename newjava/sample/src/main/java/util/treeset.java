package util;
import java.util.*;
public class treeset {

	public static void main(String[] args) {
		TreeSet<String> tset=new TreeSet<String>();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the values:");
String aa=sc.next();
tset.add(aa);
tset.add("String");
tset.add("Test");
tset.add("Link");
tset.add("Set");
	System.out.println("tset "+tset);
	}
 
}
