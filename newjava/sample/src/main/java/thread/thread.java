package thread;
public class thread extends Thread {
public void run()
{
    System.out.println("Thread is running");	
}
public static void main(String[] args) {
		thread t=new thread();
		t.start();
		
	}
}

