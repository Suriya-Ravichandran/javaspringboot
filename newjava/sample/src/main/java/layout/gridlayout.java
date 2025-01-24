package layout;
import java.awt.*;  
import javax.swing.*;
public class gridlayout {
	JFrame f;
	 gridlayout(){
		    	   f=new JFrame();
		    	  JButton b1=new JButton("Python");
		    	
		    	   JButton b2=new JButton("Java");
		    	   JButton b3=new JButton(".net");
		    	   JButton b4=new JButton("Angular");
		    	   JButton b5=new JButton("node");
		    	   JButton b6=new JButton("node");
		    	    f.add(b1);
		    	   f.add(b2);
		    	   f.add(b3);
		    	   f.add(b4);
		    	   f.add(b5);
		    	   f.add(b6);
		    	   
		    	   f.setLayout(new GridLayout(3,2));
		    	   f.setSize(400,400);
		    	   f.setVisible(true);
		    	   
		       }
	      public static void main(String[] arg) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
	    	 new  gridlayout();
	      }
		}


