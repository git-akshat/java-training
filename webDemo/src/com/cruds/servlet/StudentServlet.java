package com.cruds.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cruds.db.StudentDAO;
import com.cruds.entity.Student;

/**
 * Servlet implementation class StudentServlet
 */
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("student.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("studentname");
		String rollno = request.getParameter("rollno");
		
		StudentDAO dao = new StudentDAO();
		
		
		if(dao.create(new Student(Integer.parseInt(rollno), name)))
		{
			request.setAttribute("MESSAGE", "Record Inserted Successfully");
		}
		else
		{
			request.setAttribute("MESSAGE", "Problem in creating record");
		}
		RequestDispatcher rd = request.getRequestDispatcher("student.jsp");
		rd.forward(request, response);
	}

}
