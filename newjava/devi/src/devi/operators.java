package devi;

public class operators {

	public static void main(String[] args) {
		int a=100;
		int b=5;
		int c=10;
		int f=1;
		  int  z;
		  int d = 0b1010;
	        int e = 0b1100;
	       boolean p=a>b;
	       boolean q=a<b;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(a*b);
		System.out.println(a%b);
		System.out.println(a^b);
		System.out.println("value="+a++);
		System.out.println(a);
		System.out.println(++b);
		System.out.println(c--);
		System.out.println(--b);
		 System.out.println("f += 3: " + (f += 3));
	        System.out.println("f -= 2: " + (f -= 2));
	        System.out.println("f *= 4: " + (f *= 4));
	        System.out.println("f /= 3: " + (f /= 3));
	        System.out.println("f %= 2: " + (f %= 2));
	        System.out.println("f &= 0b1010: " + (f &= 0b1010));
	        System.out.println("f |= 0b1100: " + (f |= 0b1100));
	        System.out.println("f ^= 0b1010: " + (f ^= 0b1010));
	        System.out.println("f <<= 2: " + (f <<= 2));
	        System.out.println("f >>= 1: " + (f >>= 1));
	        System.out.println("f >>>= 1: " + (f >>>= 1));
	        System.out.println("a > b: " + (a > b));
	        System.out.println("a < b: " + (a < b));
	        System.out.println("a >= b: " + (a >= b));
	        System.out.println("a <= b: " + (a <= b));
	        System.out.println("a == c: " + (a == c));
	        System.out.println("a != c: " + (a != c));
	        boolean x = true;
	        boolean y = false;
	      
	        System.out.println("x && y: " + (p && q));
	        System.out.println("x || y: " + (p || q));
	        System.out.println("!x: " + (!p));
	        z= ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
	        //z= ((a > b) ? (a > c) ? "welcome":"");
	        System.out.println("Max ="+ z);
	     // using left shift
	        System.out.println("a : " + a);
		      
	        System.out.println("a<<1 : " + (a << 1));
	        System.out.println("a : " + a);
	        // using right shift
	        System.out.println("a>>1 : " + (a >> 1));
	        System.out.println("a : " + a);
	        int x = 9, y = 8,n = -2;   
	     // bitwise and   
	     // 1001 & 1000 = 1000 = 8  
	     System.out.println("x & y = " + (x & y));  
	  // 1001 | 1000 = 1001 = 9  
	     System.out.println("x | y = " + (x | y));     
	     //~0010= 1101 = -3  
	     System.out.println("~x = " + (~n)); 
	  // 1001 ^ 1000 = 0001 = 1  
	     System.out.println("x ^ y = " + (x ^ y));  
	     System.out.println("value="+a++);
	     System.out.println(++b);
	     System.out.println("x && y: " + (p && q));
	        System.out.println("x || y: " + (p || q));
	}

}
