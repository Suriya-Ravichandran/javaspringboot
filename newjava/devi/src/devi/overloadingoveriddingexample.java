package devi;

class overload
{
int x=100;	//If you make any method as final, you cannot override it.
public void display()
{
	System.out.println("welcome");
}
public int display(int a)
{//a=10;
	System.out.println(a);
	return a;
}
}
class override extends overload 
{
public void display()
{
	System.out.println("override programming");
	System.out.println("override"+super.display(500));
}
public void shows()
{
	System.out.println("welcome to java");
	
}
}


public class overloadingoveriddingexample {

	public static void main(String[] args) {
		overload x=new overload(); 
		override y=new override(); 
		
		x.display();
		x.display(100);
		y.display();
		y.shows();
	}
	

}
