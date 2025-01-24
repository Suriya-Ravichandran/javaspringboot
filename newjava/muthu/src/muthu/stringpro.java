package muthu;

public class stringpro 
{
	public static void main(String args[])
	{
	String x="Devi",y="devi";
	int l=10, m=10;
	if(x.equals(y))
	{
	System.out.println("Welcome to java");
	}
	else
	{
		System.out.println("Welcome to javaaa");
	}
	if(l==m)
	{
		System.out.println("Welcome to java1");
	}
	if(x.equalsIgnoreCase(y)) 
	{
		System.out.println("Welcome to java2");
		
	}
	String s1="hello";
	String s2="hello";
	String s3="jello";
	String s4="hemlo";
	String s5="flag";
	System.out.println(s1.compareTo(s2));
	System.out.println(s1.compareTo(s3));
	System.out.println(s1.compareTo(s4));
	System.out.println(s1.compareTo(s5));
	System.out.println("My name is ".concat("muthumani"));
	System.out.println(x.concat(y));
	System.out.println("length is"+x.length());
	String replaceString=s1.replace("l","w");
	System.out.println(replaceString);
	System.out.println(x.substring(2));
	System.out.println(x.substring(1,4));
	String x1=new String("hello");
	String x2="hello";
	String x3=s1.intern();
	System.out.println(x3);
	System.out.println(x==x2);
	System.out.println(x2==x3);
	
	
	
	
}
}