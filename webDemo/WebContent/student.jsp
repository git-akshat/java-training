<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.cruds.entity.Student" %>
    <%@ page import="java.util.List" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>
		<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Student page</title>

		<script type="text/javascript">
		
		function setData(rollno)
		{
			document.studentform.hdnRollNo.value = rollno;	
		}

		function submitform()
		{
			document.studentform.ACTION.value = 'DELETE';
			document.studentform.submit();
		}
		
		function editform()
		{
			document.studentform.ACTION.value = 'EDIT';
			document.studentform.submit();
		}

		</script>

		</head>

		<body>

			<h2>Student page</h2>
	<%
		String msg = (String) request.getAttribute("MESSAGE");
		List<Student> list = (List<Student>) request.getAttribute("STUD_LIST");
	%>

	<%-- <%
		if (msg != null)
		{
	%>
			<p> <%= msg %> </p>
	<%
		}
	%> --%>
	
	<table border = "1">
		<thead>
			<tr>
				<td>Roll No</td>
				<td>Name</td>
				
			</tr>
		</thead>
		
		<%
		if(list != null){
			for(Student s : list){	
		%>
		
		<tr>
			<td> <%= s.getRollNo() %> </td>
			<td> <%= s.getName() %></td>
			<td><input type="checkbox" onclick="setData(<%= s.getRollNo() %>)"/></td>
		</tr>
		
		<%
			}}
		%>
		
	</table>
	
	<input type="button" value="delete" onclick="submitform()"/>
	<input type="button" value="Edit" onclick="editform()"/>
	
	</form>

	<form name="studentform" action="StudentServlet" method="post">
		<label>Name</label> <input type="text" name="studentname"/><br/>
		<label>Roll No</label> <input type="text" name="rollno"/><br/>
		<input type="hidden" name="ACTION" value="CREATE"/>
		<input type="hidden" name="hdnRollNo" value="CREATE"/>
		<input type="hidden" name="hdnName" value="CREATE"/>
		<input type="submit" value="Create"/><br/>	
	</form>
</body>
</html>