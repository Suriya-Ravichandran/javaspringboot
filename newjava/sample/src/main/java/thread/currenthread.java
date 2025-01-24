package thread;

public class currenthread  extends Thread  {
public void run()  
    {    
        System.out.println( "Thread.currentThread().getName()");  
    }    
{    
  currenthread thread1=new  currenthread();    
    	  thread1.start();    
           
}    
}  

