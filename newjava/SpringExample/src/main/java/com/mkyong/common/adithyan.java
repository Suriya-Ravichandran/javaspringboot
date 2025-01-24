package com.mkyong.common;

class print
{
	void show()
	{
		System.out.println("welcome to java");	
	}
	void display()
	{
		System.out.println("welcome to spring");	
	}
	int add(int a,int b) {
		return a+b;
		
	}
	static void hello() {
		System.out.println("hello");
	}
}


public class adithyan {

	public static void main(String[] args) {
		System.out.println("welcome");
		print a=new print();
		a.show();
		a.display();
		int result=a.add(20, 30);
		print.hello();
		System.out.println(result);
	}

}
