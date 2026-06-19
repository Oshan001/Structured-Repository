<%
    // 🔸 Create a cookie with same name and set max age to 0
    Cookie cookie = new Cookie("user", "");
    cookie.setMaxAge(0);
    response.addCookie(cookie);
%>

<html>
<body>
    <h2>🗑️ Cookie deleted!</h2>
    <a href="setCookie.jsp">Set Again</a>
</body>
</html>