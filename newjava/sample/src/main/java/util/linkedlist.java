package util;
import java.util.*;
public class linkedlist {
public static void main(String[] args) {
		
		LinkedList<String> cars = new LinkedList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	    
	    cars.addFirst("Mazda");
	    System.out.println(cars);
	    
	    cars.addLast("Mazda");
	    System.out.println(cars);
	    
	    cars.removeFirst();
	    System.out.println(cars);
	    
	    cars.removeLast();
	    System.out.println(cars);
	    
	    System.out.println(cars.getFirst());
	    
	    System.out.println(cars.getLast());
	}

}