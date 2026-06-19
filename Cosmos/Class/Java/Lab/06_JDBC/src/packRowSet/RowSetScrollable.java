package packRowSet;

// RowSetScrollable.java

import javax.sql.rowset.JdbcRowSet;               // Interface that extends ResultSet with scrolling and updating
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class RowSetScrollable {
    public static void main(String[] args) throws Exception {

        /*
         *  RowSetFactory and RowSetProvider:
         * - RowSetFactory is the official way to create different types of RowSets.
         * - RowSetProvider.newFactory() returns a factory implementation (typically from `com.sun.rowset` behind the scenes).
         */
        RowSetFactory factory = RowSetProvider.newFactory();

        // Create a connected JdbcRowSet instance
        JdbcRowSet rowSet = factory.createJdbcRowSet();

        // Set database connection details
        rowSet.setUrl("jdbc:mysql://localhost:3306/TestPractice"); // Database URL
        rowSet.setUsername("root");                                // DB Username
        rowSet.setPassword("");                                    // DB Password (keep secure in real-world use)

        // Set the SQL command (query) to execute
        rowSet.setCommand("SELECT * FROM test");

        // Executes the query and fetches the data
        rowSet.execute();

        /*
         * ➤ SCROLLING METHODS in JdbcRowSet:
         * - .next(): moves the cursor forward one row
         * - .previous(): moves the cursor one row backward
         * - .first(): moves the cursor to the first row
         * - .last(): moves the cursor to the last row
         * - .absolute(int row): moves to the specific row number
         * - .relative(int rows): moves relative to the current row
         * - .beforeFirst(): moves before the first row (cursor is not pointing to any row)
         * - .afterLast(): moves after the last row
         * - .getRow(): gets the current row number
         */

        // Move to last row and print
        rowSet.last(); // Cursor to last row
        System.out.println("Last Row (" + rowSet.getRow() + "): "
                + rowSet.getInt("roll") + " - " + rowSet.getString("name"));

        // Move to first row and print
        rowSet.first(); // Cursor to first row
        System.out.println("First Row (" + rowSet.getRow() + "): "
                + rowSet.getInt("roll") + " - " + rowSet.getString("name"));

        // Move before the first row to start forward traversal
        rowSet.beforeFirst(); // Reset cursor before the first row

        System.out.println("\n▶ Forward Traversal:");
        while (rowSet.next()) { // Move row-by-row
            int roll = rowSet.getInt("roll");
            String name = rowSet.getString("name");
            System.out.println("Row " + rowSet.getRow() + ": " + roll + " - " + name);
        }

        // Example of backward traversal
        rowSet.afterLast(); // Set cursor after last row

        System.out.println("\n◀ Backward Traversal:");
        while (rowSet.previous()) {
            int roll = rowSet.getInt("roll");
            String name = rowSet.getString("name");
            System.out.println("Row " + rowSet.getRow() + ": " + roll + " - " + name);
        }

        // Move to a specific row using absolute
        System.out.println("\n Absolute Row Access:");
        if (rowSet.absolute(2)) { // Move to 2nd row
            System.out.println("Row 2: " + rowSet.getInt("roll") + " - " + rowSet.getString("name"));
        } else {
            System.out.println("Row 2 doesn't exist.");
        }

        // Relative movement
        if (rowSet.relative(1)) { // rowSet.relative(-1) Move one row backward relative to the current row
            System.out.println("Relative +1 (now at row " + rowSet.getRow() + "): "
                    + rowSet.getInt("roll") + " - " + rowSet.getString("name"));
        }

        // Done - close the RowSet
        rowSet.close();
    }
}

/*
 NOTES:
- JdbcRowSet is a connected rowset that wraps ResultSet with scrollable and updatable functionality.
- It is more powerful than plain ResultSet, especially useful in GUI and event-driven apps.
- RowSet is serializable — can be sent over the network or saved to disk.
- Always close the rowSet (like closing ResultSet/Connection) to free up DB resources.

 Make sure:
- MySQL JDBC driver (e.g., mysql-connector-j-8.0.xx.jar) is added to classpath.
- Database and table `test` exist with columns `roll` (int), `name` (varchar).

 SCROLLING FUNCTIONS IN BRIEF:
--------------------------------------------------
| Function        | Description                  |
|----------------|------------------------------|
| next()         | Next row                     |
| previous()     | Previous row                 |
| first()        | First row                    |
| last()         | Last row                     |
| absolute(n)    | n-th row (positive or neg.)  |
| relative(n)    | Move n rows from current     |
| beforeFirst()  | Before 1st (no row selected) |
| afterLast()    | After last                   |
| getRow()       | Current row index            |
--------------------------------------------------
*/