package muthu;
import java.util.*;
public class collection1 {

	public static  void main(String[] args) {
		
		ArrayList<String> x=new ArrayList<String>();
		//HashSet<String> x=new HashSet<String>();
		x.add("good");
		x.add("morning");
		x.add("hello");
		//System.out.println(x);
		//x.remove(0);
		//System.out.println(x);
		//x.replaceAll("hi");
		//x.set(1, "devi");
		//System.out.println(x);
		// TODO Auto-generated method stub
		//String s = null;
				//x.get(0);
				//x.iterator();
		//System.out.println(s);
		x.stream();
		//Collections.sort(x);
		//System.out.println(x);
		Iterator a = x.iterator(); 
		while (a.hasNext()) { 
            System.out.println(a.next()); 
        } 
	}

}
