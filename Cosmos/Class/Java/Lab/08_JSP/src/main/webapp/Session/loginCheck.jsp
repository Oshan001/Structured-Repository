<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	
	String validUser = "admin";
	String validPass = "1234";
	
	if(username.equals(validUser) && password.equals(validPass)){
		session.setAttribute("user", username);
		response.sendRedirect("home.jsp");
	} else{
		response.sendRedirect("login.html");
	}
%>
</body>
</html>