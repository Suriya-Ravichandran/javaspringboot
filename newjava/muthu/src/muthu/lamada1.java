package muthu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;




public class lamada1 {

	public static void main(String[] args) {
		List<Integer> x=Arrays.asList(9,25,16,49);
		List<String> y=Arrays.asList("ram","john","salim");
		List<List<Integer>> z=new ArrayList<>();
		System.out.println("List of the values="+x);
		System.out.println("list of values"+y);
		z.add(Arrays.asList(5,6));
		z.add(Arrays.asList(7,8));
		
		
		List list=y.stream()
				.map(s->s.length())
				.collect(Collectors.toList());
		System.out.println("List of values-"+list);
		System.out.println("List of values-"+z);
		
		
		List<Integer>flatlist=z.stream()
				.flatMap(list1->list1.stream())
				.collect(Collectors.toList());
		System.out.println("List generated by map-"+flatlist);
		
		x.stream().map(t->Math.sqrt(t))
		.forEach(p->System.out.println(p));
		Collections.sort(x,(t,p)->t.compareTo(p));
		System.out.println(x);
		
		
		x.stream().filter(num->num/9==1).forEach(System.out::println);
		
		
		
		
		
		
	
		
		// TODO Auto-generated method stub

	}

}
