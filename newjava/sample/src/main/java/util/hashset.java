package util;
import java.util.HashSet;
public class hashset {
	public static void main(String[] args) {
		
HashSet <String> hset = new HashSet<String>();

hset.add("Apple");
hset.add("Orange");
hset.add("Mango");
hset.add("Pineapple");
hset.add("Watermelon");

//Add duplicate element 
	hset.add("Apple");
	hset.add("Orange");
//Addition of null values
	hset.add(null);
	hset.add(null);
	System.out.println("hset:"+hset);
	
	hset.remove("Apple");
	System.out.println(hset);
	
	hset.add("banana");
	System.out.println(hset);
	}
}
