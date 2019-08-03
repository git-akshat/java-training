<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Demo Page</title>

	<script type="text/javascript">
		
		function hello(str)
		{
			//alert('HI' + str);
			document.forms[0].hdnaction.value = str;
			document.forms[0].submit();
		}
	
	</script>

</head>
<body>

	<form action="DemoServlet" method="post">
		<input type="text" name="firstName"/>
		<input type="hidden" name="hdnaction" value="DEFAULT"/>
		<input type="button" value="Modify Action"  onclick="hello('ACT-DELETE')"/>
		<input type="submit" value="Click"/>
	</form>

</body>
</html>