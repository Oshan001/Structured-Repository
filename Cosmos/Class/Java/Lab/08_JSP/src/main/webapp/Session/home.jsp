<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
<%
	String user = (String) session.getAttribute("user");

if(user==null){
	response.sendRedirect("login.html");
	return;
}
%>
<h2>Welcome, <%= user %></h2>
<p> You are successfully logged in using session.</p>
<a href="logout.jsp">Logout</a>
</body>
</html>