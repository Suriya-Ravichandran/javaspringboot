package eventhandle;
import java.awt.*;

import javax.swing.JFrame;
public class eventhandle2 

{
	TextArea ta;
	eventhandle2  ()
	{
		   JFrame fr=new JFrame();
		   ta=new TextArea();
		   ta.setBounds(30,30,300,300);
		   fr.add(ta);		  
		  
		   fr.setSize(400,400);
		   fr.setTitle("AWT - Label");
		   fr.setLayout(null);
		   fr.setVisible(true);
	   }

	public static void main(String[] args) {
		eventhandle2  obj=new eventhandle2(); 

	}

}

