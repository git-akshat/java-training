package com.cruds.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import com.cruds.entity.Student;

public class StudentDAO {
	
	public List<Student> getAllStudent()
	{
		String sql = "select rollno,name from student";
		Student s = null;
		ArrayList<Student> slist= new ArrayList<>();
		
		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs != null && rs.next())
			{
				s = new Student(rs.getInt(1), rs.getString(2));
				slist.add(s);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return slist;
	}
	
	public Student getByRollNo(int rollNo)
	{
		String sql = "select name from student where rollno = ?";
		Student s = null;
		
		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, rollNo);
			
			ResultSet rs = ps.executeQuery();
			if(rs != null && rs.next())
			{
				s = new Student(rollNo, rs.getString(1));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return s;	
	}
	
	public Student getByName(String name)
	{
		String sql = "select rollno from student where name = ?";
		Student s = null;
		
		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			
			ResultSet rs = ps.executeQuery();
			if(rs != null && rs.next())
			{
				s = new Student(rs.getInt(1), name);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return s;
		
	}
	
	public boolean deleteByRollNo(int rollNo)
	{
		String sql = "delete from student where rollno = ?";
		int rows = 0;
		
		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, rollNo);
			rows = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows > 0;
	}
	
	public boolean updateName(int rollNo, String name)
	{
		String sql = "update student set name = ? where rollno = ?";
		int rows = 0;
		
		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, rollNo);
			rows = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows > 0;
	}
	
	public boolean create(Student student)
	{
		String sql = "insert into student(rollno, name) values(?, ?)";
		int rows = 0;
		
		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, student.getRollNo());
			ps.setString(2,  student.getName());
			
			rows = ps.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return rows > 0;
	}
	
	public DefaultTableModel getTableData()
	{
		String sql = "select rollno, name from student";
		Vector<String> colNames = new Vector<>();
		colNames.add("Roll no");
		colNames.add("Name");
		
		Vector<Vector<String>> data = new Vector<>();
		
		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs != null && rs.next())
			{
				Vector<String> row = new Vector<>();
				row.add(String.valueOf(rs.getInt(1)));
				row.add(rs.getString(2));
				data.add(row);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return new DefaultTableModel(data, colNames);
	}

}
