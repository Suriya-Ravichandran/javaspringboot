package muthu;


// Main Class
class Multit {
	 
	public static void main(String[] args)
    {
	static run()
	    {
	        System.out.println("Current thread name: "
	                           + Thread.currentThread().getName());
	        System.out.println("run() method called");
	        
	    }
	    
        int n = 8; // Number of threads
        for (int i = 0; i <= n; i++) {
            Thread object
                = new Thread();
            object.start();
            //System.out.println(object.isAlive());
            Multit.run();
            System.out.println(object.isAlive());
        }
    }

}
