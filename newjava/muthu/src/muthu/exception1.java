package muthu;
class hello 
{
	public void run()
	{
		try
		{
			int x=10;
			int y=x/5;
			System.out.println(y);
			
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Exception is caught"+e);
			
		}
		finally
		{
			System.out.println("Exception caught");
		}
	}
}

public class exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hello m=new hello();
		m.run();

	}

}
