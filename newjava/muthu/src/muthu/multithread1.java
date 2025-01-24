package muthu;

class multithreadingDemo extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Thread"+Thread.currentThread().getId()+"is running");
		}
		catch(Exception e)
		{
			System.out.println("Exception is caught");
		}
		
	}
	
}

public class multithread1 extends Thread{
	public void run()
	{
		try
		{
			System.out.println("Thread"+Thread.currentThread().getId()+"is running");
		}
		catch(Exception e)
		{
			System.out.println("Exception is caught");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=6;
for(int i=0;i<n;i++);
{
	multithreadingDemo s=new multithreadingDemo();
	s.start();
	s.run();
}
	}

}
