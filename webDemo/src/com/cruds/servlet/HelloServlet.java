package com.cruds.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        System.out.println("Inside Hello servlet constructor");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("GET Method :: HelloServlet");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter().append("Hello world from servlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
//		System.out.println("POST Method :: HelloServlet");
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		
//		String name = request.getParameter("username");
//		out.println("Hello " + name);
		
		String name = request.getParameter("username");
		String usn = request.getParameter("usn");
		request.setAttribute("USERNAME", name);
		request.setAttribute("USN", usn);
		request.setAttribute("MESSAGE", "Hello " + name + ":" + usn);
		RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
		rd.forward(request, response);
	}

}
