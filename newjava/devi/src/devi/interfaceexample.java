package devi;

interface myexample
{
	  default void add(){
		 
		System.out.println("welcome");
	}
	
}
interface a
{
	default void mul(){
		 
		System.out.println("welcome to java");
	}
}
class b implements myexample,a
{
	 void div(){
		 
		System.out.println("welcome to java div");
	}
}


public class interfaceexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
b x=new b();

x.add();
x.mul();
x.div();
	}

}
