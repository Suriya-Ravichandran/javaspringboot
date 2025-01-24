package muthu;

class methodexample1
{

	int m;
	int n;
	//double i = 100.245; 
	methodexample1()//default constructor
	{
		
		int a = 20;
		this.m=a;
		int b = 10;
		this.n=b;
		b=m+n;
		//System.out.println(b);
	}
	methodexample1(int a,int b)//parameter constructor
	{
		//int m,n;
		this.m=a;
		this.n=b;
		b=m+n;
		System.out.println(b);
	}
	public int shows()//method with no parameter
	{int m=100,n=20;
	 int c=m+n;
	System.out.println(c);
	//System.out.println(i);
		return(c);
		//return(b);
	}

	public int show(int a,int b)//parameterized method
	{//int m,n;
	int c=a+b;
	//int k = (int)i; 
	System.out.println(c);
	//System.out.println(i);
		return(c);
		//return(b);
	}
	
}

public class methodexample {

	public static void main(String[] args) {
		//methodexample1 x=new methodexample1(100,50);
		methodexample1 x=new methodexample1();
		/*Thread t=new Thread();
		Thread t1=new Thread();
		t.start();
		t.sleep(20);
		t1.start();*/
		//int k=x.shows();
		//System.out.println(k);
		//System.out.println(x.m+"   "+x.n);
		//System.out.println(h);
		int t=x.show(10,20);
		System.out.println(t);
		//methodexample1.show();
	}

}


