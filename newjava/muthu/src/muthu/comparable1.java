package muthu;
import java.io.*;
import java.util.*;


class Result implements Comparable<Result>
{
	private int rank;
	private int year;
	private String name;
	public int CompareTo(Result n)
	{
	
		return this.rank - n.rank;
	}
	public Result(String nm,int rk,int yr)
	{
		this.name=nm;
		this.rank=rk;
		this.year=yr;
		
	}
		
	
	public String getname() {return name;}
	public int getrank() {return rank;}
	public int getyear() {return year;}
	@Override
	public int compareTo(Result o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}


public class comparable1 {

	public static void main(String[] args) {
		ArrayList<Result>r=new ArrayList<Result>();
		r.add(new Result("muthumani",15,2011));
		r.add(new Result("elakiya",11,2010));
		r.add(new Result("dharunika",1,2020));
		r.add(new Result("iniyaal",2,2021));
		
		Collections.sort(r);
		
		System.out.println("Rank after Sorting:");
		for(Result  result:r)
		{
			System.out.println(result.getname()+""+
								result.getrank()+""+
								result.getyear());
		
		}
			
		
		
		
		// TODO Auto-generated method stub

	}

}
