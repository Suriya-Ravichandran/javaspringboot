package devi;

class example
{
	void print()
	{
		System.out.println("welcomer");
	}
	
	
}
interface  example1
{
	default int print()
	{
		System.out.println("welcomer");
		return(0);
	}
	
	
}
class sample extends example,example1
{
	 void add() {
		 System.out.println("welcomer to java");
	 }
}
public class abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//example obj1=new example();
		sample obj=new sample();
		obj.add();
		obj.print();
	}

}
