<%
    // 🔸 Create a new cookie with name = "user", value = "Krishna"
    Cookie cookie = new Cookie("user", "Krishna");

    // 🔸 Set the cookie expiry to 1 day (in seconds)
    cookie.setMaxAge(60 * 60 * 24);

    // 🔸 Add the cookie to the response
    response.addCookie(cookie);
    
    /*
    🍪 What is Cookie?
    - Small data stored in browser.
    - Sent with every request to the same domain.

    ✅ setMaxAge(seconds):
        > Positive value → cookie lasts for that many seconds.
        > 0 → cookie is deleted immediately.
        > Negative → cookie is temporary (deleted on browser close).

    🚫 Limitations:
    - Can be disabled by browser.
    - Size limit (usually 4KB).
    - Not secure for sensitive data (stored on client-side).

    ✅ Good for:
    - Remembering preferences
    - Non-sensitive tracking info

    ❌ Not good for:
    - Passwords, session security (use Session for that!)
*/
%>

<html>
<body>
    <h2>✅ Cookie has been set!</h2>
    <a href="getCookie.jsp">Go to Get Cookie</a>
</body>
</html>
