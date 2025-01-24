

package eventhandle;
import java.awt.*;
	import java.awt.event.*;

import javax.swing.JFrame;
	public class eventhandle5

	 {
		
		eventhandle5 (){
			   JFrame fr=new JFrame();
			   Scrollbar obj=new Scrollbar();
			   obj.setBounds(100,100,200,100);
			   fr.add(obj);
			  
			   fr.setSize(400,400);
			   fr.setTitle("AWT - Label");
			   fr.setLayout(null);
			   fr.setVisible(true);
			   
		   }

		public static void main(String[] args) {
			eventhandle5  obj=new eventhandle5 ();

		}

	}

	


