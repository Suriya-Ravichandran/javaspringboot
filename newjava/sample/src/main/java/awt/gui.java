package awt;
import java.awt.*;
public class gui 
{
public static void main(String[] args) 
	{Frame  f=new Frame();
		f.setBackground(Color.green);
		Label l1=new Label("User Name");
		l1.setBounds(40, 70, 150, 40);
		TextField tf=new TextField();
		tf.setBounds(200, 70, 150, 40);
		Label l2=new Label("Password");
		l2.setBounds(40, 150, 100, 40);
		 TextField tp=new TextField();
		tp.setBounds(200, 150, 150, 40);
		 
		
		Button b1=new Button("Login");
		b1.setBounds(200, 250, 100, 50);
		f.add(l1);
		f.add(tf);
		f.add(l2);
		f.add(tp);
		f.add(b1);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
