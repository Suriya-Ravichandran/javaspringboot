package muthu;

public class forpro {

	public static void main(String[] args) {
		
	//for(int j=0;j<=7;j++)
	//{
	//System.out.println("welcome to java");

	//}
	String x="Devi",y="devi";
	int l=10,m=10;
	
	if(x.equals(y))
	{
		System.out.println("java");
	}
	
	if(l==m)
	{
		System.out.println("welcome to java");
	}
	if(x.equalsIgnoreCase(y))
	{
		System.out.println("welcome to java");
	}
	String s1="hello";  
	String s2="hello";  
	String s3="meklo";  
	String s4="hemlo";  
	String s5="flag";  
	System.out.println(s1.compareTo(s2));//0 because both are equal  
	System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"  
	System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"  
	System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f"  
	System.out.println("My name is ".concat("Rumplestiltskin"));
	System.out.println(x.concat(y));
	System.out.println("length="+x.length());
	String replaceString=s1.replace("l","w"); 
	System.out.println(replaceString);
	
	System.out.println(x.substring(2));
	System.out.println(x.substring(1,3));
	String x1=new String("hello");  
	String x2="hello";  
	String x3=s1.intern();
	System.out.println(x3);//returns string from pool, now it will be same as s2  
	System.out.println(x1==x2);//false because reference variables are pointing to different instance  
	System.out.println(x2==x3);//true because reference variables are pointing to same instance  
	}

}

