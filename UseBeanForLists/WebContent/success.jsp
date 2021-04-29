<%-- <%@ page import = "com.Student" %> --%>
<%-- <jsp:useBean id="d" class = "com.Student" scope = "request"></jsp:useBean> --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach items = "${d}" var = "s">
	<c:out value = "${s.rollno}"> </c:out>
	<c:out value = "${s.name}"> </c:out>
	<c:out value = "${s.addr}"> </c:out>
</c:forEach>
</body>
</html>