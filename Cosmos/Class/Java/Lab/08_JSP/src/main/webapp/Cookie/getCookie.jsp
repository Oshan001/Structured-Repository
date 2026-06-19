<%
    Cookie[] cookies = request.getCookies();
    String username = null;

    if (cookies != null) {
        for (Cookie c : cookies) {
            if (c.getName().equals("user")) {
                username = c.getValue();
                break;
            }
        }
    }
%>

<html>
<body>
    <% if (username != null) { %>
        <h2>🍪 Welcome back, <%= username %>!</h2>
        <a href="deleteCookie.jsp">Logout (Delete Cookie)</a>
    <% } else { %>
        <h2>❌ No cookie found.</h2>
        <a href="setCookie.jsp">Set Cookie</a>
    <% } %>
</body>
</html>