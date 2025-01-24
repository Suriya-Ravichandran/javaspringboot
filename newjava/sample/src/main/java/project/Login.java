package project;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.TextField;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	protected Object JOptionpane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 612, 324);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(212, 77, 46, -50);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("USER LOGIN");
		lblNewLabel.setBackground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel.setBounds(178, 11, 408, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("USER NAME");
		lblNewLabel_2.setFont(new Font("Vijaya", Font.BOLD, 20));
		lblNewLabel_2.setBounds(27, 77, 96, 34);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("PASSWORD");
		lblNewLabel_2_1.setFont(new Font("Vijaya", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(27, 145, 96, 34);
		contentPane.add(lblNewLabel_2_1);
		
		textField =new JTextField();
		textField.setBounds(212, 85, 226, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(212, 145, 226, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=textField.getText();
				String password=passwordField.getText();
				if(password.contains("12345")&&username.contains("abinesh"))
				{
					textField.setText(null);
					passwordField.setText(null);
					JOptionPane.showMessageDialog(null,"Sussesfull");
					
					
				}
				else
				{
					
				JOptionPane.showMessageDialog(null,"INVALID LOGIN","ERROR",JOptionPane.ERROR_MESSAGE);
				
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(34, 222, 89, 40);
		contentPane.add(btnNewButton);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	textField.setText(null);
	passwordField.setText(null);
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnReset.setBounds(252, 222, 89, 40);
		contentPane.add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnExit.setBounds(454, 222, 89, 40);
		contentPane.add(btnExit);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 190, 586, 1);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 56, 586, 1);
		contentPane.add(separator_1);
	}
}
