package layout;
import java.awt.*;  
import javax.swing.*;
public class cardlayout extends JFrame
{	        
	        CardLayout card;
	        JButton btn;
	        Container cPane;
	      public cardlayout(){
	    	   
	    	  cPane=getContentPane();
	    	  card=new CardLayout();
	    	  cPane.setLayout(card);
	    	  
	    	  btn=new JButton("java");
	    	  cPane.add("p",btn);	
	    
	    	  btn=new JButton("java");
	    	  cPane.add("p",btn);	
	    
	    	 
	    	   setSize(400,400);
	    	   setVisible(true);
	    	   
	       }
      public static void main(String[] arg) {
    	  cardlayout c1=new cardlayout();
      }
	}

