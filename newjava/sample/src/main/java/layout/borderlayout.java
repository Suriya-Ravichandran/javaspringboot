package layout;
import java.awt.*;  
import javax.swing.*;
public class borderlayout {
				JFrame f;
		        borderlayout(){
		    	   f=new JFrame();
		    	   JButton b1=new JButton("Python");
		    	   JButton b2=new JButton("Java");
		    	                                                                                                                                                  
		    	   
		    	   f.add(b1,BorderLayout.NORTH);
		    	   f.add(b2,BorderLayout.SOUTH);
		    	   
		    	   JButton b3=new JButton("Python");
		    	   JButton b4=new JButton("Java");
		    	   f.add(b3,BorderLayout.EAST);
		    	   
		    	   f.add(b4,BorderLayout.WEST);
		    	   f.setSize(400,400);
		    	   
		    	   
		    	   f.setVisible(true);
		    	   
		       }
	      public static void main(String[] arg) {
	    	 new borderlayout();
	      }
		}

