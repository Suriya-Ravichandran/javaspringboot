package muthu;


import java.io.*;
class params {
    // data members of the class.
   int m,n;
	params(int a,int b)
    	{
    		//int m,n;
    		this.m=a;
    		this.n=b;
    		b=m+n;
    		System.out.println(b);
    	}

}


public class paramizedconstructorexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		params x = new params(100,50);
        System.out.println( x.m
                           + "   " + x.n);
	}

}
