<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Third Page</title>
</head>
<body>
	<form action = "third">
	<%-- <input type = "hidden" name = "t1" value = "<%=request.getParameter("t1")%>"/>
	<br>
	<input type = "hidden" name = "t2" value = "<%=request.getParameter("t2")%>"/>
	<br> --%>
	First Data: <%=  session.getAttribute("fd")  %>
	<br>
	Second data: <%=  session.getAttribute("sd")  %>
	<br>
	Third data: <input type = "text" name = "t3">
	<br>
	<input type = "submit" value = "Go To Next Page">
	</form>
</body>
</html>