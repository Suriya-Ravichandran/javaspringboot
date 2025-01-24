package muthu;

class MultithreadingDemo implements Runnable {
    public void run()
    {
        try {
            // Displaying the thread that is running
            System.out.println(
                "Thread " + Thread.currentThread().getId()
                + " is running");
            int a=10,b=20;
	        int x=a+b;
	        System.out.println(x);
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }

	
}
 
// Main Class
class Multi {
    public static void main(String[] args)
    {
        int n = 2; // Number of threads
        MultithreadingDemo  t1= new MultithreadingDemo();
        t1.Start();
     
    }
}
