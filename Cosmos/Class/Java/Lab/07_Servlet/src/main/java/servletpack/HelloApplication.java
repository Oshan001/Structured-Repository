package servletpack;

//This annotation registers the servlet with the URL pattern "/Hello"
//When user visits http://localhost:8080/<your-artifact-name>/Hello, this servlet is triggered
import jakarta.servlet.annotation.WebServlet;

//Required servlet classes for handling HTTP requests/responses
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.ServletException;

//For input/output operations (especially writing output to browser)
import java.io.*;

//Register this class as a servlet mapped to "/Hello"
@WebServlet("/Hello")
public class HelloApplication extends HttpServlet {

 // This method handles GET requests (i.e., when user types a URL in browser or clicks a link)
 // The method signature matches the HttpServlet class, so it properly overrides it
 @Override
 protected void doGet(HttpServletRequest req, HttpServletResponse resp)
         throws ServletException, IOException {

     // Set the type of the response sent to browser — here, we are returning HTML content
     resp.setContentType("text/html");

     // Get the response output stream (PrintWriter) to send data back to the browser
     PrintWriter out = resp.getWriter();

     // Write a simple HTML heading to the browser
     out.println("<h1> Hello from Servlet! </h1>");

     // Alternative shortcut:
     // resp.getWriter().println("<h1>Hello from Servlet!</h1>");
 }
}