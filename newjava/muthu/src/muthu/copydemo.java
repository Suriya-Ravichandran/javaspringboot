package muthu;

class employee{
 int i;
employee(int i)
{
	this.i=i;
}
	void displays()
	{
	int id=100;
	System.out.println(id);
}
	employee(employee l)
	{
		this.i=l.i;
	}
}

public class copydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee x=new employee(100);
		employee y=new employee(x);
		System.out.println(x.i);
		System.out.println(y.i);
		
		
	}

}
