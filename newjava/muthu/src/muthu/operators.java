package muthu;

public class operators {

	public static void main(String[] args) {
		int a=100;
		int b=5;
		int c=10;
		int f=1;
		int z;
		int d=0b1010;
		int e=0b1100;
		boolean p=a>b;
		boolean q=a<b;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a%b);
		System.out.println(a^b);
		System.out.println("value="+a++);
		System.out.println(a);
		System.out.println(++b);
		System.out.println(c--);
		System.out.println(c);
		System.out.println(--b);
		System.out.println("f+=3:"+(f+=3));
		System.out.println("f-=2:"+(f-=2));
		System.out.println("f*=4:"+(f*=4));
		System.out.println("f/=3:"+(f/=3));
		System.out.println("f%=2:"+(f%=2));
		System.out.println("f<<=2:"+(f<<=2));
		System.out.println("f>>=1:"+(f>>=1));
		System.out.println("f>>>=1:"+(f>>>=1));
		System.out.println("a>b:"+(a>b));
		System.out.println("a<b:"+(a<b));
		System.out.println("a>=b:"+(a>=b));
		System.out.println("a<=b:"+(a<=b));
		System.out.println("a==c:"+(a==c));
		System.out.println("a!=c:"+(a!=c));
		//boolean x=true;
		//boolean y=false;
		System.out.println("x&&y:"+(p&&q));
		System.out.println("x||y:"+(p||q));
		System.out.println("!x:"+(!p));
		z=((a>b)?(a>c)?a:c:(b>c)?b:c);
	
		System.out.println("max="+z);
		System.out.println("a<<1:"+(a<<1));
		System.out.println("a>>1:"+(a>>1));
		int x=6,y=5,n=10;
	
		System.out.println("x&y="+(x&y));
		System.out.println("x|y="+(x|y));
		System.out.println("~x="+(~n));
		System.out.println("x^y="+(x^y));
		
		System.out.println("x&&y:"+(p&&q));
		System.out.println("x||y:"+(p||q));
		System.out.println("!x:"+(!p));
		System.out.println("x^y="+(x^y));
		
		
		/*6->110
		5->101
		3->011*
		10->1010*/
		
		
		

	}

}
