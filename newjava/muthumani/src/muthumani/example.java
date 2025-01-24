package muthumani;


class demo {
	public void show()
	{
System.out.println("welcome");
try
{
	int i=10;
	int x=10/0;
	System.out.println("welcome"+x);
}
catch(ArithmeticException e)
{
	System.out.println("Exception is "+e.getMessage());
}
finally
{
	System.out.println("finally block");
}

	}
}

public class example {

	public static void main(String[] args) {
		System.out.println("welcome devi");
		demo t=new demo();
		t.show();
	}

}


