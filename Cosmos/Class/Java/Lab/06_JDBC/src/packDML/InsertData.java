package packDML;

import java.sql.*; // Import the JDBC library (Java Database Connectivity) for DB operations

public class InsertData {
    public static void main(String[] args) throws Exception {

        // NOTE 1: Define the database URL
        // Format: jdbc:mysql://hostname:port/database_name
        // In our case, "NewDB" is already created
        String url = "jdbc:mysql://localhost:3306/NewDB";

        // NOTE 2: Set your database credentials
        String user = "root"; // MySQL default username (can be different in your system)
        String password = "<your-password>"; // Your current MySQL password

        // NOTE 3: Establish connection with the database
        // DriverManager.getConnection() returns a Connection object to interact with the DB
        Connection conn = DriverManager.getConnection(url, user, password);

        // NOTE 4: Prepare the SQL INSERT statement using placeholders (?) for safety
        // Using PreparedStatement protects against SQL injection & makes code cleaner
        String sql = "INSERT INTO students (name, age, email) VALUES (?, ?, ?)";

        // NOTE 5: Create a PreparedStatement object and bind the SQL string to it
        PreparedStatement pstmt = conn.prepareStatement(sql);

        // NOTE 6: Set actual values into the placeholders (1st ?, 2nd ?, 3rd ?)
        // Indexing starts from 1 (not 0)
        pstmt.setString(1, "Krishna");                // For "name"
        pstmt.setInt(2, 21);                          // For "age"
        pstmt.setString(3, "abc@example.com");        // For "email"

        // NOTE 7: Execute the SQL statement
        // executeUpdate() is used for INSERT, UPDATE, DELETE operations
        int rowsInserted = pstmt.executeUpdate();

        // NOTE 8: Check if the data was inserted
        if (rowsInserted > 0) {
            System.out.println("Data inserted successfully!");
        } else {
            System.out.println("No rows were inserted.");
        }

        // NOTE 9: Close resources (Good practice to free memory and DB locks)
        pstmt.close();
        conn.close();
    }
}
// ---- NOTES BELOW ----

/*
 * Why PreparedStatement is used instead of Statement:
 * ------------------------------------------------------
 * Prevents SQL Injection: '?' placeholders safely separate logic and data.
 * Better Performance: Query is precompiled and reused by the DB engine.
 * Cleaner Code: Uses type-safe methods like setString(), setInt() etc.
 * Automatic Handling of Quotes: Avoids manual string concatenation errors.
 *
 * How PreparedStatement works:
 * -------------------------------
 * 1. SQL with placeholders is parsed and compiled once by the DB.
 * 2. We bind values using .setXXX() methods.
 * 3. Executes safely, even if values contain special characters (like quotes).
 *
 * When NOT to use PreparedStatement:
 * -------------------------------------
 * Only when executing static queries like CREATE TABLE or DROP DATABASE,
 * where no values need to be dynamically inserted.
 */

/*
    Why PreparedStatement?
    - Safer than Statement.
    - Prevents SQL Injection by escaping malicious inputs.
    - Allows reuse of queries with different parameters.
    - Easier to read & write when using dynamic values.

    ***SQL Injection Example:***
    If we had used:
        Statement stmt = conn.createStatement();
        String sql = "SELECT * FROM students WHERE name = '" + userInput + "'";
    Then input like:
        userInput = "'; DROP TABLE students; --"
    Would delete the table! as the sql will be:
    SELECT * FROM students WHERE name = ''; DROP TABLE students; --'

    BUT with PreparedStatement:
        String sql = "SELECT * FROM students WHERE name = ?";
        pstmt.setString(1, userInput);
    The input is treated as plain data, not code — making it safe!

    executeUpdate() returns the number of affected rows.
    It's used for SQL statements that modify data (INSERT, UPDATE, DELETE).
*/