package com.cruds.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.cruds.demo.Student;
import com.cruds.exception.StudentException;
import com.cruds.jdbc.StudentDAO;

public class TextFieldDemo extends JFrame{
	
	private JTextField txtName;
	private JTextField txtRollNo;
	private JLabel rollLabel;
	private JLabel nameLabel;
	private JPanel panel;
	private JButton btnSubmit;
	private int size = 7;
	
	public TextFieldDemo() {
		setTitle("Text Field Demo");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		panel = new JPanel();
		rollLabel = new JLabel("Roll No.");
		txtRollNo = new JTextField(size);
		
		nameLabel = new JLabel("Name ");
		txtName = new JTextField(size);
		
		btnSubmit = new JButton("Submit");		
		btnSubmit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				StudentDAO dao = new StudentDAO();
				String name = txtName.getText();
				
				if(name.trim().length() == 0 || txtRollNo.getText().trim().length() == 0)
				{
					getToolkit().beep();
					JOptionPane.showMessageDialog(panel, "Error", "Failed", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				int rollNo = Integer.parseInt(txtRollNo.getText());
				
				
				try {
					if(dao.create(new Student(rollNo, name)))
					{
						JOptionPane.showMessageDialog(panel, "Student created successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
						txtName.setText("");
						txtRollNo.setText("");
					}
					else
					{
						getToolkit().beep();
						JOptionPane.showMessageDialog(panel, "Error", "Failed", JOptionPane.ERROR_MESSAGE);
					}
				} catch (StudentException ex) {
					ex.printStackTrace();
				}
			}
		});
		
		panel.add(rollLabel);
		panel.add(txtRollNo);
		
		panel.add(nameLabel);
		panel.add(txtName);
		
		panel.add(btnSubmit);
		
		add(panel);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TextFieldDemo();
	}
	

}
