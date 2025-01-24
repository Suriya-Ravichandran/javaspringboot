package thread;
public class SleepExp1 extends Thread  
{    
    public void run()  
    {    
        for(int i=1;i<=5;i++)  
        {    
            try
            {  
                Thread.sleep(3000);  
            }
            catch( Exception e){
            	System.out.println(e);
            	}    
            System.out.println(i); 
            System.out.println("update");
        } 
    }
        
        
    public static void main(String args[])  
    {    
        SleepExp1 thread1=new SleepExp1();    
      
        thread1.start();    
        
    }    
}  
 