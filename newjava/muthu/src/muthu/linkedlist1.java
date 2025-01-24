package muthu;
import java.util.*;
public class linkedlist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Double> z=new LinkedList<Double>();
		z.add(2.5);
		z.add(1.5);
		System.out.println(z);
		z.add(3.5);
		System.out.println(z);
		Collections.sort(z);
		System.out.println(z);
		z.addLast(4.5);
		System.out.println(z);
		z.addFirst(5.5);
		System.out.println(z);
		Collections.sort(z);
		
		System.out.println(z);
		//Collections.replace(1,6.5);
		System.out.println(z);
	}

}
