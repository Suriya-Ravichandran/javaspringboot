package muthu;
import java.lang.*;
//import java.util.Collection;

class threadpriority extends Thread {
 
  
 
    public static void main(String[] args)
    {
        
    	threadpriority t1 = new threadpriority();
    	threadpriority t2 = new threadpriority();
    	threadpriority t3 = new threadpriority();
 
    	final int run()
    	    {  int a=10,b=20;
    	        int x=a+b;
    	        System.out.println("Inside run method"+x);
    	        t1.start();
    	        return(0);
    	    }
        System.out.println("t1 thread priority : "
                           + t1.getPriority());
        System.out.println("t2 thread priority : "
                           + t2.getPriority());
        System.out.println("t3 thread priority : "
                           + t3.getPriority());
        t1.setPriority(2);
        t2.setPriority(5);
        t3.setPriority(8);
 
        // t3.setPriority(21); will throw
        // IllegalArgumentException
 
        // 2
        System.out.println("t1 thread priority : "
                           + t1.getPriority());
 
        // 5
        System.out.println("t2 thread priority : "
                           + t2.getPriority());
 
        // 8
        System.out.println("t3 thread priority : "
                           + t3.getPriority());
 
        // Main thread
 
        // Displays the name of
        // currently executing Thread
        System.out.println(
            "Currently Executing Thread : "
            + Thread.currentThread().getName());
 
        System.out.println(
            "Main thread priority : "
            + Thread.currentThread().getPriority());
 
        // Main thread priority is set to 10
        Thread.currentThread().setPriority(10);
 
        System.out.println(
            "Main thread priority : "
            + Thread.currentThread().getPriority());
    }
}