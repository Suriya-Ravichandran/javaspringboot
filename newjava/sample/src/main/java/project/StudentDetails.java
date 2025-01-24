package project;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StudentDetails extends JFrame {

	private JPanel contentPane;
	private JTextField id;
	private JTextField name;
	private JTextField course;
	private JTextField contact;
	private JTable table;
	
	private JScrollPane scrollPane;
	private JButton btnAdd;
	private JButton btnUpadate;
	private JButton btnDelete;
	private JButton btnClear;
	DefaultTableModel model;
	
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentDetails frame = new StudentDetails();
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
	public StudentDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 255));
		panel.setBounds(0, 0, 572, 366);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		lblNewLabel.setBounds(38, 45, 119, 14);
		panel.add(lblNewLabel);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		lblName.setBounds(38, 86, 119, 14);
		panel.add(lblName);
		
		JLabel lblCourse = new JLabel("COURSE");
		lblCourse.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		lblCourse.setBounds(38, 127, 119, 14);
		panel.add(lblCourse);
		
		JLabel lblNewLabel_1 = new JLabel("CONTACT");
		lblNewLabel_1.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		lblNewLabel_1.setBounds(38, 168, 119, 14);
		panel.add(lblNewLabel_1);
		
		
		
		id = new JTextField();
		id.setBounds(137, 42, 141, 20);
		panel.add(id);
		id.setColumns(10);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(137, 83, 141, 20);
		panel.add(name);
		
		course = new JTextField();
		course.setColumns(10);
		course.setBounds(137, 162, 141, 20);
		panel.add(course);
		
		contact = new JTextField();
		contact.setColumns(10);
		contact.setBounds(137, 124, 141, 20);
		panel.add(contact);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(295, 11, 267, 344);
		panel.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
		
			
			public void mouseClicked(MouseEvent e) {
				int i=table.getSelectedRow();

			
				id.setText(model.getValueAt(i,0).toString());
				name.setText(model.getValueAt(i,1).toString());
				contact.setText(model.getValueAt(i,2).toString());
				course.setText(model.getValueAt(i,03).toString());
				
			}
		});
		table.setBackground(new Color(192, 192, 192));
		model=new DefaultTableModel();
		Object [] column= {"ID","Name","Contact","Course"};
		final Object [] row= new Object[4];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			
				
				{
		
				}
			
					{
		
				row[0]=id.getText();
				row[1]=name.getText();
				row[2]=contact.getText();
				row[3]=course.getText();
				model.addRow(row);
				
				id.setText("");
				name.setText("");
			contact.setText("");
			course.setText("");
			
			
				}
			}
		



					

		});
		btnNewButton.setFont(new Font("Gadugi", Font.BOLD, 15));
		btnNewButton.setBounds(26, 231, 119, 29);
		panel.add(btnNewButton);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i=table.getSelectedRow();
				model.setValueAt(id.getText(),i,0);
				model.setValueAt(name.getText(),i,1);
				model.setValueAt(contact.getText(),i,2);
				model.setValueAt(course.getText(),i,3);
			}
		});
		btnUpdate.setFont(new Font("Gadugi", Font.BOLD, 15));
		btnUpdate.setBounds(155, 231, 123, 29);
		panel.add(btnUpdate);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i=table.getSelectedRow();
				model.removeRow(i);
			}
			
		});
		btnDelete.setFont(new Font("Gadugi", Font.BOLD, 15));
		btnDelete.setBounds(22, 294, 123, 29);
		panel.add(btnDelete);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				id.setText("");
				name.setText("");
				contact.setText("");
				course.setText("");
			}
		});
		btnClear.setFont(new Font("Gadugi", Font.BOLD, 15));
		btnClear.setBounds(155, 294, 123, 29);
		panel.add(btnClear);
	}
}

