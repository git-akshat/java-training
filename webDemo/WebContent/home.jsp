<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Home</title>
	</head>
	<body>

	<%
		//scriplet
		String username = (String) request.getAttribute("USERNAME");
		String msg = (String) request.getAttribute("MESSAGE");
		String usn = (String) request.getAttribute("USN");
	%>
	
	<p> Home page </p>
	
	<p> <%= username %>:<%= usn %> </p>
	<br/>
	<p> <%=msg %> </p>
	


	</body>
</html>