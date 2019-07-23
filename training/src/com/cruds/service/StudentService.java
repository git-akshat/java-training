package com.cruds.service;

import javax.swing.table.DefaultTableModel;

import com.cruds.jdbc.StudentDAO;

public class StudentService {
	
	public static DefaultTableModel getDataForJTable()
	{
		StudentDAO dao = new StudentDAO();
		return dao.getTableData();
	}
	
	public static boolean delete(int rollNo)
	{
		StudentDAO dao = new StudentDAO();
		return dao.deleteByRollNo(rollNo);
	}

}
