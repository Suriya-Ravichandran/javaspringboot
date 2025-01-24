package muthu;
class overloadrideexample
{
	
		 public void display()
			{
				System.out.println("welcome");
			}
			 int display(int a)
			{
				System.out.println(a);
				return a;
			}
		}
		class override extends overloadrideexample
		{
			public void display()
			{
				System.out.println("over ridding programming");
				System.out.println("override"+super.display(500));
			}
			public void show()
			{
				System.out.println("welcome to java");
			}
		}

 
class overloadride {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloadrideexample x=new overloadrideexample();
		override y=new override();
		x.display();
		x.display(100);
		y.display();
		y.show();
		

	}

}
