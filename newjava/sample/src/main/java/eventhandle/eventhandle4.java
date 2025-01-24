package eventhandle;
import java.awt.*;
import java.awt.event.*;

public class eventhandle4 {
eventhandle4  (){
		   Frame fr=new Frame();
		   final List c=new List(4);
		   
		   c.setBounds(100,100,75,90);
		   c.add("Apple");
		   c.add("orange");
		   c.add("Cherry");
		   c.add("Banana");
		   fr.add(c);	
		   Button btn=new Button("Submit");
		   btn.setBounds(200,100,100,30);
		   fr.add(btn);
		   
		  final Label l=new Label();
		  l.setBounds(100,150,300,30);
		  fr.add(l);
		  btn.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
				  String output="Your favourite Fruit is:"
			  +c.getItem(c.getSelectedIndex());
				  l.setText(output);
			  }
		  });
		   fr.setSize(400,400);
		   fr.setTitle("AWT - Label");
		   fr.setLayout(null);
		   fr.setVisible(true);
		   
	   }

	public static void main(String[] args) {
		 eventhandle4 obj=new  eventhandle4 ();

	}

}
