package muthu;



public class multithrad1 extends Thread {
public void run() 
    
    {
        try {
            // Displaying the thread that is running
            System.out.println(
                "Thread " + Thread.currentThread()
                + " is running");
           //int x=10;int 
           //y=x/0;
           //System.out.println(y);
           
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught"+e);
        }
        finally
        {
        	System.out.println("Exception is caughtSfgaeghswrx");
        }
    }
	public static void main(String[] args)
    {
    	
		multithrad1 t=new multithrad1();
    	//t.wait();

    	//t.getContextClassLoader().t
    	
            t.start();
            System.out.println(
                    "Thread " + Thread.currentThread()
                    + " is running");
            t.run();
        
    
}
}
