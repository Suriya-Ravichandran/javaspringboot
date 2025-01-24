public class Example
{
    public static float pi()
    {
        return 3.142f;
    }

    public static int sum(int a, int b)
    {
        int c;
        c=a+b;
        return c;
    }

    public static void main(String args[])
    {
        int x=10, y=20, z;
        System.out.println("The value of PI is 22/7 = " + pi());
        z=sum(x,y);
        System.out.println("Sum of " + x + " and " + y + " is " + z);
    }
}
