package servletpack;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.ServletException;
import java.sql.*;

@WebServlet("/FormServletDB")
public class addToDatabase extends HttpServlet {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/formDB";
    private static final String USER = "root";
    private static final String PASSWORD = "<your-password>";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        String name = req.getParameter("name");
        String email = req.getParameter("email");

        if (name == null || name.trim().isEmpty() || email == null || email.trim().isEmpty()) {
            out.println("<html><body><h3>Error: Name and email are required!</h3></body></html>");
            return;
        }

        try {
            // Explicitly load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
                 PreparedStatement ps = conn.prepareStatement("INSERT INTO information (name, email) VALUES (?, ?)")) {

                ps.setString(1, name);
                ps.setString(2, email);
                ps.executeUpdate();

                out.println("<html><body>");
                out.println("<h3>Data inserted successfully!</h3>");
                out.println("<p>Name: " + name + "</p>");
                out.println("<p>Email: " + email + "</p>");
                out.println("<a href='input.html'>Go back to form</a>");
                out.println("</body></html>");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            out.println("<html><body><h3>Driver not found: " + e.getMessage() + "</h3></body></html>");
        } catch (SQLException e) {
            e.printStackTrace();
            out.println("<html><body><h3>SQL Error: " + e.getMessage() + "</h3></body></html>");
        } finally {
            out.close();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Redirect GET requests to the form page
        resp.sendRedirect("input.html");
    }
}
