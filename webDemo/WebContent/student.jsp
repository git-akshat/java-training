<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student page</title>
</head>
<body>

	<h2>Student page</h2>
	<% 
		String msg = (String) request.getAttribute("MESSAGE");
	%>
	
	<%
		if (msg != null)
		{
	%>
			<p> <%= msg %> </p>
	<%
		}
	%>

	<form action="StudentServlet" method="post">
		<label>Name</label> <input type="text" name="studentname"/><br/>
		<label>Roll No</label> <input type="text" name="rollno"/><br/>
		<input type="submit" value="submit"/><br/>	
	</form>
</body>
</html>