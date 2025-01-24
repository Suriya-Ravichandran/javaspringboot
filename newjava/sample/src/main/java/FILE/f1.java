package FILE;
import java.io.FileWriter;
public class f1 {
public static void main(String[] args) {
	try {
	int phone=123;
	FileWriter fw=new FileWriter("D:ex1.txt");
	fw.write(phone);
	fw.close();
	
	}
	catch(Exception e) {
	System.out.println(e);
	
	}
	System.out.println("Success");
	}

}