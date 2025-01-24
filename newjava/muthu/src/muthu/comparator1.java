package muthu;
import java.io.*;
import java.util.ArrayList;
import java.util.Collection.*;
class Result1 implements Comparable<Result1>
{
	private int ranking;
	private int year;
	private String name;
	
	public int CompareTo(Result1 m)
	{
		return this.ranking - m.ranking;
	
		
	}
	public Result1 (String nm,int rk,int yr)
	{
		this.name=nm;
		this.ranking=rk;
		this.year=yr;
	}
	public int getRanking() {return ranking;}
	public String getName() {return name;}
	public int getYear() {return year;}
	@Override
	public int compareTo(Result1 o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
class  resulting compare implements Comparator(result)
{
	public int compare(result r1,result r2)
	{
		if (r1.getranking()<r2.getranking())
			return -1;
		if (r1.getranking()>r2.getranking())
			return 1;
		else
			return 0;
		
	}
}
class NameCompare implements Comparator<Result1>
{
	public int compare(result r1,result r2)
	{
		return r1.getname().CompareT(r2.getNmae());
	}
}
 class comparator1 {

	public static void main(String[] args) {
		ArrayList<result> list=new ArrayList <result>();
		list.add(new result("Ramesh", 20 ,2015));
		list.add(new result("john",  15   ,2017));
		list.add(new result("Ram", 10, 2020));
		System.out.println("Sorted by ranking");
		rankingCompare rankingcompare=new rankingCompare();
		Collections.sort(list,rankingcompare);
		
		for(Result1 result1:list)
			System.out.println(result1.getRanking()+""
							+result1.getName()+""
							+result1.getYear());
		
		System.out.println("\nSorted by Nmae");
		NameCompare namecompare=new NameCompare();
		Collections.sort(list,namecompare);
		
		for(Result1 result1:list)
			System.out.println(result1.getName()+""
					+result1.getRanking()+""
					+result1.getYear());
		
		System.out.println("\n Sorted by Year");
		Collections.sort(list,Yearcompare);
		for(Result1 result1:list) 
			System.out.println(result1.getName()+""
							+result1.getRanking()+""
							+result1.getYear());
			
		
			
			
			
		
				
				
		
		
		
		// TODO Auto-generated method stub

	}

}
