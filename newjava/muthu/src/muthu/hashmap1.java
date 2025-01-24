package muthu;
import java.util.*;

public class hashmap1 {

	public static void main(String[] args) {
		HashMap<Integer,String>s=new HashMap<Integer,String>();
		s.put(1, "cat");
		s.put(2, "dog");
		s.put(3, "cow");
		System.out.println(s);
		s.remove(1);
		System.out.println(s);
		s.put(1,"lion");
		System.out.println(s);
		
		// TODO Auto-generated method stub

	}

}
