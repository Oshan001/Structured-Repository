package packDDL;

import java.sql.*;

/**
 * NOTE:
 * This Java program connects to a MySQL database named 'NewDB'
 * and creates a table called 'students' (if it doesn't already exist).
 */
public class CreateTable {
    public static void main(String[] args) throws Exception {

        // JDBC URL: Format is jdbc:mysql://host:port/database_name
        String url = "jdbc:mysql://localhost:3306/NewDB";  // Here, database is 'NewDB'
        String user = "root";                               // Username for MySQL
        String password = "<your-password>";                // Replace with your MySQL password

        // STEP 1: Establish connection to the database
        // NOTE: DriverManager handles the actual connection setup
        Connection conn = DriverManager.getConnection(url, user, password);

        // STEP 2: Create a Statement object
        // Used to send SQL queries to the database
        Statement stmt = conn.createStatement();

        // STEP 3: Define the SQL query to create the 'students' table
        /*
            id     : INT type, auto-incremented primary key
            name   : VARCHAR(100), cannot be null (required field)
            age    : INT, optional
            email  : VARCHAR(100), optional
         */
        String sql = "CREATE TABLE IF NOT EXISTS students(" +
                "id INT AUTO_INCREMENT PRIMARY KEY," +
                "name VARCHAR(100) NOT NULL," +
                "age INT," +
                "email VARCHAR(100))";  // Make sure closing parenthesis is included

        // STEP 4: Execute the SQL query
        // executeUpdate() is used here for DDL operations like CREATE, ALTER, DROP
        stmt.executeUpdate(sql);

        // Feedback to the user
        System.out.println("Table created successfully!");

        // STEP 5: Close resources to prevent memory leaks
        stmt.close();
        conn.close();
    }
}