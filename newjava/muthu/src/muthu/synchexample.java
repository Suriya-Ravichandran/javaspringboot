package muthu;
import java.io.*;
import java.util.*;
class Sender {
    public void send(String msg)
    {
        System.out.println("Sending\t" + msg);
        try {
            Thread.sleep(1000);
        }
        catch (Exception e) {
            System.out.println("Thread  interrupted.");
        }
        System.out.println("\n" + msg + "Sent");
    }
}
 class synchexample extends Thread {

	public static void main(String a[]) 
	{
	    private String msg;
	    Sender sender;
	    void ThreadedSend(String m, Sender obj)
	    {
	        msg = m;
	        sender = obj;
	    }
	     public void run()
	    {
	        
	        synchronized (sender)
	        {
	            sender.send(msg);
	        }
	    }
	

	}



