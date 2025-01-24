package muthu;
interface exalpme1
{
	static void add()
	{
	System.out.println("blomming");
	}
}
interface x extends exalpme1
{
	default void mul()
	{
		System.out.println("raissing");
	}
	default void mul1()
	{
		System.out.println("raissing");
	}
}
class m implements  exalpme1,x
	{
		public void div()
		{
			System.out.println("happy morning");
		}

		
	}



public class interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
m a=new m();
a.mul();
a.div();
	}

}
