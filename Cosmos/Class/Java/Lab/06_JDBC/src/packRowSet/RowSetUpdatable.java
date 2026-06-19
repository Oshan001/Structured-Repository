package packRowSet;

// RowSetUpdatable.java
// This program demonstrates how to update a row in a database using JdbcRowSet created via RowSetFactory

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.ResultSet;

public class RowSetUpdatable {
    public static void main(String[] args) throws Exception {
        // Create RowSetFactory
        RowSetFactory factory = RowSetProvider.newFactory();

        // Create JdbcRowSet using the factory
        JdbcRowSet rowSet = factory.createJdbcRowSet();

        // Set DB connection details
        rowSet.setUrl("jdbc:mysql://localhost:3306/TestPractice");
        rowSet.setUsername("root");
        rowSet.setPassword("");  // Set your DB password here

        // IMPORTANT: Set scrollability and updatability
        rowSet.setType(ResultSet.TYPE_SCROLL_INSENSITIVE);
        rowSet.setConcurrency(ResultSet.CONCUR_UPDATABLE);

        // Set SQL command and execute
        rowSet.setCommand("SELECT * FROM test");
        rowSet.execute();

        // Iterate and update the matching record
        while (rowSet.next()) {
            if (rowSet.getInt("roll") == 1) {
                rowSet.updateString("name", "Updated Name");
                rowSet.updateRow(); // Commit changes to DB
                System.out.println("Successfully updated record with roll = 1");
            }
        }

        // Close the rowSet
        rowSet.close();
    }
}

/*
NOTES:

✔ What makes it Updatable?
- `setConcurrency(ResultSet.CONCUR_UPDATABLE)`
- `setType(ResultSet.TYPE_SCROLL_INSENSITIVE)` (required for updatability)
- Methods used:
    • updateString(column, value)
    • updateRow()

 Requirements:
- Ensure your MySQL user has UPDATE privileges
- Don't forget to call `updateRow()` or changes won’t apply!
- Make sure the underlying SQL SELECT includes a **primary key** or updatable result

 Without setting concurrency, you'll get:
   java.sql.SQLException: ResultSet is not updatable
*/