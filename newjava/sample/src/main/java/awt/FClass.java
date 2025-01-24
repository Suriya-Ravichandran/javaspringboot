package awt;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class FClass extends SClass{
	public static void main (final String []args) {
		final SClass scl = new SClass();
		
JFrame f = new JFrame();
		
		JLabel ll = new JLabel("User name");
		ll.setBounds (40,70,150,40);
		final JTextField tf = new JTextField();
		tf.setBounds(200,70,150,40);
		
		JLabel l2 = new JLabel("password");
		l2.setBounds(40,150,100,40);
		final JTextField tf2 =new JTextField();
		tf2.setBounds(200,150,150,40);
		
		JButton b = new JButton("ok");
		b.setBounds(200,250,100,50);
		b.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			
			
			public void actionPerformed(ActionEvent a) {
				String user = tf.getText();
				String pass = tf2.getText();
				if(user.equals("selaiyur") && pass.equals("12345")) {
					scl.main(args);
				}else {JFrame jf3 =new JFrame();
				
				JLabel j4 = new JLabel("please enter the right user name and password");
				j4.setBounds (40,70,300,40);
				
				jf3.add(j4);
				jf3.setLayout(null);
				jf3.setSize(500, 500);
				jf3.setVisible(true);
				
			}
			}});
		
		
		
		f.add(ll);
		f.add(l2);
		f.add(tf);
		f.add(tf2);
		f.add(b);
		//f.add(l3);
		
		f.setBackground(Color.red);
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
	}

}