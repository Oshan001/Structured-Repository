package packDQL;

import java.sql.*;

public class ResultSetMetaDataDemo {
    public static void main(String[] args) throws Exception{
        // JDBC URL - Replace with your DB and port if needed
        String url = "jdbc:mysql://localhost/NewDB";
        String user = "root";
        String pass = "<your-password>";           // Replace with your MySQL password

        // Establish the database connection
        Connection conn = DriverManager.getConnection(url, user, pass);

        // Create a Statement object to execute SQL queries
        Statement stmt = conn.createStatement();

        // Execute a SELECT query to get all data from 'students' table
        ResultSet rs = stmt.executeQuery("SELECT * FROM students");

        // Get metadata about the ResultSet (like column count, names, types)
        ResultSetMetaData rsmd = rs.getMetaData();

        // Get number of columns in the result set
        int columnCount = rsmd.getColumnCount();
        System.out.println("No. of columns: "+columnCount);

        // Loop through each column to print its metadata info
        for(int i=1; i<=columnCount; i++){
            System.out.println("Column "+i+": "+rsmd.getColumnName(i)+
                    " | Type: "+rsmd.getColumnTypeName(i)+
                    " | Nullable: "+(rsmd.isNullable(i) == ResultSetMetaData.columnNullable ? "YES" : "NO"));
        }

        System.out.println("\nData: ");
        // Iterate through each row of the result set
        while(rs.next()){
            // For each row, iterate through all columns and print their values separated by tabs
            for(int i=1; i<=columnCount; i++){
                System.out.print(rs.getString(i) + "\t");
            }
            System.out.println();
        }

        // Close resources to avoid memory leaks
        rs.close();
        stmt.close();
        conn.close();
    }
}

/*
Detailed Notes:

1. Connection:
   - `DriverManager.getConnection(...)` establishes a connection to the database.
   - The URL format for MySQL is: jdbc:mysql://host:port/database
   - If port is default 3306, it can be omitted.

2. Statement:
   - Used to execute static SQL queries.
   - For dynamic queries with parameters, PreparedStatement is preferred.

3. ResultSet:
   - Holds data returned by executing a SELECT query.
   - Cursor starts before the first row; call rs.next() to move to next row.

4. ResultSetMetaData:
   - Provides metadata (information) about the ResultSet’s columns.
   - Useful for dynamically handling queries where columns or types may change.
   - Methods used:
     - `getColumnCount()`: number of columns.
     - `getColumnName(i)`: name of the i-th column.
     - `getColumnTypeName(i)`: SQL type name of i-th column.
     - `isNullable(i)`: checks if column allows NULL values.

5. Column Indexing:
   - Columns are 1-indexed (start at 1, not 0).

6. Looping through data:
   - `rs.next()` moves to next row; returns false when no more rows.
   - You can fetch column data using `rs.getString()`, `rs.getInt()`, etc.

7. Closing resources:
   - Always close ResultSet, Statement, and Connection to free resources and avoid leaks.

8. Exception Handling:
   - In production code, use try-with-resources or try-catch-finally to properly close resources and handle exceptions.

9. Use Case:
   - This demo is useful when you don't know table structure at compile time.
   - You can write generic code to print or process any ResultSet.

*/