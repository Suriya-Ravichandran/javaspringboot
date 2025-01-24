package thread;

public class Threadop1 implements Runnable {
	public void run()
	{
		System.out .println("haiii");
	}

	public static void main(String[] args) {
		Threadop1 t=new Threadop1();
		Thread op=new Thread(t);
		
		op.start();
		op.setName("java");
System.out.println(""+op.getName());
	}
}
