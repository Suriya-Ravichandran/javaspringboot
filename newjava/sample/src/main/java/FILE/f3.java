package FILE;
import java.io.FileOutputStream;
public class f3 {
public static void main(String[] args) {
		try {
			FileOutputStream fs=new FileOutputStream("D:ex3.txt");
			String s ="Welcome to livewire";
			byte b[]=s.getBytes();
		fs.write(b);
		fs.close();
System.out.println("Success");	
		}

		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
