<%@ page import="java.sql.*, java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title> Your Info</title>
</head>
<body>
<%
	String name = request.getParameter("name");
	String gender = request.getParameter("gender");
	String time = request.getParameter("time");
	String[] course = request.getParameterValues("course");
	
	String courseStr = "";
	if(course != null)
		courseStr=String.join(",",course);
%>
<h1>Your Info</h1>
<strong>Name:</strong> <%=name%><br>
<strong>Gender:</strong> <%=gender%><br>
<strong>Time:</strong> <%=time%><br>

<strong>Courses:</strong>
<ul>
<%
	if(course!=null){
		for(String c: course){
%>
<li><%= c %></li>
<%
}
}
else {
%>
<li>No course selected</li>
<%
}
%>
</ul>

<%
    // JDBC connection info
    String DB_URL = "jdbc:mysql://localhost:3306/formDB";
    String DB_USER = "root";
    String DB_PASS = "<your-password>"; 

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");  // Ensure driver is loaded

        Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        PreparedStatement ps = conn.prepareStatement(
            "INSERT INTO userinfo (name, gender, course, time) VALUES (?, ?, ?, ?)"
        );
        ps.setString(1, name);
        ps.setString(2, gender);
        ps.setString(3, courseStr);
        ps.setString(4, time);

        int status = ps.executeUpdate();

        if (status > 0) {
%>
<p style="color:green;">✅ Successfully inserted into database!</p>
<%
        } else {
%>
<p style="color:red;">❌ Failed to insert data into database.</p>
<%
        }

        ps.close();
        conn.close();
    } catch (Exception e) {
%>
<p style="color:red;">❌ Database Error: <%= e.getMessage() %></p>
<%
        e.printStackTrace();
    }
%>

</body>
</html>