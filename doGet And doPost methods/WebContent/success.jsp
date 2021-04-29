<%@ page import="com.Student" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Success Page
	<%
		List<Student> list = (List)request.getAttribute("d");
		for(Student stu : list)
		{
			%>
			Rollno: <%=stu.getRno() %>
			<br>
			Name: <%= stu.getName() %>
			<br>
			Address: <%= stu.getAddr() %>
			<br>
			<%} %>
</body>
</html>