<%
    String name = null;
    Cookie[] cookies = request.getCookies();
    if(cookies != null) {
        for(Cookie c : cookies) {
            if(c.getName().equals("user")) {
                name = c.getValue();
                break;
            }
        }
    }
%>

<html>
<body>
    <% if(name != null) { %>
        Hello, <%= name %>
    <% } else { %>
        No cookie found.
    <% } %>
</body>
</html>