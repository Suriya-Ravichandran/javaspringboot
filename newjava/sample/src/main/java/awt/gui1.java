package awt;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class gui1 extends JFrame implements ActionListener 
{
	public static void main(String[] args) {
		JFrame ff=new JFrame("Login Frame");
		ff.setBackground(Color.cyan);
		JLabel l1=new JLabel("User Name");
		l1.setBounds(40, 70, 150, 40);
	    final TextField tf=new TextField();
		tf.setBounds(200, 70, 150, 40);
		JLabel l2=new JLabel("Password");
		l2.setBounds(40, 150, 100, 40);
		final TextField tp=new TextField();
		tp.setBounds(200, 150, 150, 40);
		Button b1=new Button("Login");
		final Label l3=new Label();
		l3.setBounds(200, 200, 200, 40);
		b1.setBounds(200, 250, 100, 50);
		b1.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent ae)
			{
				String user=tf.getText();
				String pass=tp.getText();
				if(user.equals("livewire")&& pass.equals("1234"))
				{
					l3.setText("Welcome");
				}
				else {
					l3.setText("invalid");
				}
				tf.setText(null);
				tp.setText(null);}});
	ff.add(l1);
		ff.add(tf);
		ff.add(l2);
		ff.add(tp);
		ff.add(b1);
		ff.add(l3);
		ff.setSize(400, 400);
		
		ff.setLayout(null);
		ff.setVisible(true);
}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub 
		
	}
}