package muthu;

abstract class demo2
{
	void print()
	{
		System.out.println("hello");
		
	}
	 
}
class sample1 extends demo2
{
	void add()
	{
		System.out.println("Have a nice day");
	}
}
	
		
public class abstracclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample1 a=new sample1();
	
		a.print();
		a.add();
		

	}
}
