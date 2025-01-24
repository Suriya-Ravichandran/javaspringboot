package util;
import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo"); 
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	    

	    System.out.println(cars.get(3));
	    
	    cars.set(2, "maruti");
	    System.out.println(cars);
	    
	    System.out.println(cars.size());
	    
	    

	    
	  }
	}       