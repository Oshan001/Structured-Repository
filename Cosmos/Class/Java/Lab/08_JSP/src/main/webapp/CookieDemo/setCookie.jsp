<%
    String name = request.getParameter("username");
    if(name != null) {
        Cookie c = new Cookie("user", name);
        response.addCookie(c);
        out.println("Cookie Added");
    }
    response.sendRedirect("getCookie.jsp");
%>