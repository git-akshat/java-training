package com.cruds.swing;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;

import com.cruds.jdbc.StudentDAO;
import com.cruds.service.StudentService;

public class JTableDemo extends JFrame{
	
	private JTable table;
	private JButton btnDelete;
	private JScrollPane scrollpane;
	public JTableDemo() {
		setTitle("Table Demo");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Object[] colNames = new Object[] {"Roll No", "Name"};
		//Object[][] data = new Object[][] {{"101", "Anil"}, {"202", "Bhaskar"}, {"303", "Chetan"}};
		
		
		/* using vector */
		Vector<String> colNames = new Vector<>();
		colNames.add("Roll No");
		colNames.add("Name");
		
		Vector<Vector<String>> data = new Vector<>();
		Vector<String> row1 = new Vector<>();
		row1.add("101");
		row1.add("Anil");
		
		Vector<String> row2 = new Vector<>();
		row2.add("202");
		row2.add("Bhaskar");
		
		data.add(row1);
		data.add(row2);
		
		//table = new JTable(data, colNames);
		
		DefaultTableModel model = new DefaultTableModel(data, colNames);
		//table = new JTable(model); //passing created model
		
		table = new JTable(StudentService.getDataForJTable()); //retrieving from database
		scrollpane = new JScrollPane(table);
		
		btnDelete = new JButton("Delete");
		
		btnDelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int idx = table.getSelectedRow();
				if(idx == -1)
				{
					JOptionPane.showMessageDialog(scrollpane, "Nothing selected", "Invalid", JOptionPane.ERROR_MESSAGE);
					return;
				}
				int roll = Integer.parseInt(table.getModel().getValueAt(idx, 0).toString());
				
				if(StudentService.delete(roll))
				{
					table.setModel(StudentService.getDataForJTable());
					idx = -1;
				}
			}
		});
		add(scrollpane);
		add(btnDelete,BorderLayout.SOUTH);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JTableDemo();
	}
	
	

}
