package packDQL;

import java.sql.*;

public class FetchData {
    public static void main(String[] args) throws Exception {
        // Step 1: Database connection setup
        String url = "jdbc:mysql://localhost:3306/NewDB"; // Database name added
        String user = "root";
        String password = "<your-password>"; // Use your correct password

        // Step 2: Establish the connection
        Connection conn = DriverManager.getConnection(url, user, password);

        // Using a SELECT query to fetch all student data
        String sql = "SELECT * FROM students";

        // Step 3: Create a Statement object to send SQL to the database
        Statement stmt = conn.createStatement();

        // Step 4: Execute the query and store the result in ResultSet
        ResultSet rs = stmt.executeQuery(sql);

        // Step 5: Loop through the ResultSet to read data row by row
        while (rs.next()) {
            // Retrieve data by column name (you can also use column index)
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            String email = rs.getString("email");

            // Print the fetched data
            System.out.println("ID: " + id + " | Name: " + name + " | Age: " + age + " | Email: " + email);
        }

        // Step 6: Close resources in reverse order of opening
        rs.close();
        stmt.close();
        conn.close();
    }
}

/*
    🔹 What is ResultSet?
    - It's a table of data returned from a SELECT query.
    - You can iterate over rows using rs.next()
    - You can access each column by:
        Column name: rs.getString("name")
        Column index (starting from 1): rs.getString(2)

    🔹 Common getXXX() Methods:
        rs.getInt("age")         → for INT column
        rs.getString("email")    → for VARCHAR column
        rs.getDouble("salary")   → for DOUBLE column

    🔹 Why close ResultSet, Statement, and Connection?
    - To free up database resources and avoid memory leaks.

    🔹 If your table has nulls:
        - Handle them to avoid NullPointerExceptions, eg:
            rs.getString("email") might return null
*/