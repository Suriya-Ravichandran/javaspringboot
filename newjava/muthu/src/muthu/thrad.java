package muthu;

class x1  extends Thread
{
	
	public  void run()
	{
		for(int i=0;i<2;i++){
			
		synchronized (this) {
	    System.out.println("welcomesub"+i);
		try {
			this.wait(100);
			this.notify();
		} catch (InterruptedException e) {
			 //TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
    }}
		}
}
public class  thrad extends Thread {

	public static  void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 
		x1 t=new x1();
		t.start();
		//Thread t1=new Thread();
		//t1.start();
		
		
		
		for(int i=0;i<2;i++) {
			System.out.println("welcomemain"+i);
			}
		
	}
	}

