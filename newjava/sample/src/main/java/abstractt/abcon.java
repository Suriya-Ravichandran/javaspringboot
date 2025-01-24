package abstractt;

public class abcon {

	public static void main(String[] args) 
	{
	outer out=new outer()
			{
		void hello()
		{
			System.out.println("Abstart class");
		}
			};

			out.hello();
	}

}