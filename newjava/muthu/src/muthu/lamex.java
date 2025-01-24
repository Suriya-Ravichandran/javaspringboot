package muthu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;




public class lamex {
	
	public static void main(String[] args) {
		List<String> x=Arrays.asList("ram","ravi","salim");
		
		System.out.println("List of values-"+x);
		List list=x.stream()
				.map(s->s.length())
				.collect(Collectors.toList());
		System.out.println("List of values-"+list);
				
		
		
		
		// TODO Auto-generated method stub

	}

}
