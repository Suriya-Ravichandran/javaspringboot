package eventhandle;
import java.awt.*;
import java.awt.event.*;
public class eventhandle3 
{
eventhandle3  (){
		   Frame fr=new Frame();
		   Checkbox c=  new Checkbox("Male");
		   c.setBounds(30,100,60,40);
		   fr.add(c);
		   Checkbox c1=new Checkbox("Female");
		   c1.setBounds(30,140,80,40);
		   fr.add(c1);
		   final Label label=new Label();
		   label.setBounds(30,300,300,30);
		   fr.add(label);
		   
		   
		   c.addItemListener(new ItemListener() {
			   public void itemStateChanged(ItemEvent e)
			   {
		label.setText("Male gender is :"+(e.getStateChange()==1?"checked":"unchecked"));
			   }
		   });
		   c1.addItemListener(new ItemListener() {
			   public void itemStateChanged(ItemEvent e)
			   {
				label.setText("Female gender is :"
						   +(e.getStateChange()==1?"checked":"unchecked"));
			   }
		   });
		   
		   fr.setSize(400,400);
		   fr.setTitle("AWT - Label");
		   fr.setLayout(null);
		   fr.setVisible(true);
		   
	   }
	public static void main(String[] args) {
		eventhandle3 obj=new eventhandle3 ();
	}

}


