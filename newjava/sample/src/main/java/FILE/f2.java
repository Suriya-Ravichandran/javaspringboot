package FILE;
import java.io.FileWriter;
public class f2 {
public static void main(String[] args) {
	try {
	
	FileWriter fw=new FileWriter("D:ex2.txt");
	fw.write("Livewire");
	fw.append("selaiyur");

	fw.close();
	
	}
	catch(Exception r) {
	System.out.println();
	
	}
	System.out.println("Success");
	}

}
