<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display Page</title>
</head>
<body>
	First Data: <%= session.getAttribute("fd") %>
	<br>
	Second data: <%= session.getAttribute("sd") %>
	<br>
	Third data: <%= session.getAttribute("td") %>
	<br>
</body>
</html>