package packException;

import java.sql.*;

public class JDBCExceptionDemo {
    public static void main(String[] args) {

        // Initialize to null to handle cleanup in finally block safely
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            // Load and register JDBC driver
            // This step tells Java which database driver to use
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection to the database
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/<your-DB-Name>", "root", "<your-password>");

            // Prepare SQL query with placeholders (?) for parameters
            String sql = "INSERT INTO test (roll, name) VALUES (?, ?)";

            // Create PreparedStatement object to safely insert data
            stmt = conn.prepareStatement(sql);

            // Set values for placeholders
            stmt.setInt(1, 1);
            stmt.setString(2, "Ram");

            // Execute the query
            int rowsInserted = stmt.executeUpdate();
            System.out.println("Rows inserted: " + rowsInserted);

        } catch (ClassNotFoundException e) {
            // Handles case where JDBC driver class isn't found
            System.out.println("JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            // Handles SQL-related exceptions (bad query, bad connection, etc.)
            System.out.println("Database error occurred.");
            e.printStackTrace();
        } finally {
            // Clean up database resources

            // Close the statement if it was opened
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            // Close the connection if it was opened
            try {
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

/*
 NOTE:

     Why `Connection conn = null;` and `PreparedStatement stmt = null;`?
   - So that these variables are **accessible in the finally block**.
   - In case an exception is thrown inside the `try`, we still need to close `conn` and `stmt`
     to avoid resource leaks. Declaring them beforehand enables this cleanup.

    Exceptions involved in JDBC:

     ClassNotFoundException
      → Thrown by: `Class.forName("com.mysql.cj.jdbc.Driver");`
      → Reason: If the JDBC driver class is not found in the classpath.
      → Happens when: The MySQL JDBC driver `.jar` is missing or not added properly to project libraries.

     SQLException
      → Thrown by:
         - `DriverManager.getConnection(...)`
         - `conn.prepareStatement(...)`
         - `stmt.executeUpdate()` / `stmt.executeQuery()`
         - Any JDBC method that talks to the database
      → Reasons:
         - Invalid SQL syntax
         - Connection refused or wrong database URL
         - Wrong credentials (username/password)
         - Table/column doesn't exist
         - Data type mismatch
         - Constraints violated (like duplicate primary key)

    Why `finally` block?
   - Ensures that database resources are closed **regardless of success or failure**.
   - Prevents memory leaks and resource locks on the DB.
   - You check `if (conn != null)` to avoid NullPointerException if connection never opened.

    Alternative:
   - From Java 7 onwards, you can use **try-with-resources**:
     ```java
     try (Connection conn = ...; PreparedStatement stmt = ...) {
         // use conn and stmt
     } catch (SQLException e) { ... }
     ```
   - This automatically closes resources without needing a `finally` block.

 Summary:
- ClassNotFoundException → driver class not found → `Class.forName(...)`
- SQLException → DB errors → bad connection, invalid query, wrong table, etc.
- Always handle both separately for clear debugging
- Use `finally` or try-with-resources to release JDBC resources safely
*/