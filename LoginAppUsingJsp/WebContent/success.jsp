<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import = "com.loginApp.Student" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success Page</title>
</head>
<body>
 	Hello, <%= request.getParameter("t1") %>
 	<br>
 	Class name: <%= request.getAttribute("msg") %>
 	<br>
 	Faculty: <%= request.getAttribute("faculty") %>
 	<br>
 	<% Student stu = (Student)request.getAttribute("data"); %>
 	Roll number: <%= stu.getRollno() %>
 	<br>
 	Name: <%= stu.getName() %>
</body>
</html>