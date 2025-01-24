package thread;
public class thread1  implements Runnable {
	public void run()
	{
		System.out.println("java");
	}

	public static void main(String[] args) {
	thread1 op=new thread1();
		Thread t1= new Thread(op);
		t1.start();
	}
}






