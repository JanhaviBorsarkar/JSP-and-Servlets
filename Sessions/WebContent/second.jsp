<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Second Page</title>

</head>
<body>
	<form action = "second">
		<input type = "hidden" name = "t1" value = "<%=request.getParameter("t1")%>"/>
		First Data: <%= request.getParameter("t1") %>
		<br>
		Second data: <input type = "text" name = "t2">
		<br>
		<input type = "submit" value = "Go To Next Page">
	</form> 
</body>
</html>