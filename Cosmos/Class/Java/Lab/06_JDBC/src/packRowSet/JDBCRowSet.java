package packRowSet;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class JDBCRowSet {
    public static void main(String[] args) throws Exception {
        // Create RowSetFactory using standard API (not com.sun)
        RowSetFactory factory = RowSetProvider.newFactory();

        // Create JdbcRowSet from factory
        JdbcRowSet rowSet = factory.createJdbcRowSet();

        // Set DB connection info
        rowSet.setUrl("jdbc:mysql://localhost:3306/NewDB");
        rowSet.setUsername("root");
        rowSet.setPassword("<your-password>");

        // Set SQL command to execute
        rowSet.setCommand("SELECT * FROM students");
        rowSet.execute();

        // Iterate through the result
        while (rowSet.next()) {
            int id = rowSet.getInt("id");
            String name = rowSet.getString("name");
            int age = rowSet.getInt("age");
            String email = rowSet.getString("email");

            System.out.println("ID: " + id + " | Name: " + name +
                    " | Age: " + age + " | Email: " + email);
        }

        // Close rowset
        rowSet.close();
    }
}
/*
    🔸 What is JdbcRowSet?
        - A connected RowSet (wrapper around ResultSet).
        - Scrollable, updatable, and JavaBean-compliant.
        - Works like ResultSet but with more flexibility.

    🔸 Why use RowSetProvider.newFactory()?
        - It’s the standard way to obtain a RowSetFactory.
        - Avoids using deprecated or internal APIs (e.g., com.sun.rowset).
        - Portable and clean — works with future Java versions.

    🔸 What does rowSet.setCommand(...) do?
        - Sets the SQL query to be executed when .execute() is called.

    🔸 What’s the advantage?
        - Clean syntax, scrollable data, works with GUI apps (e.g., JavaFX/Swing).
        - Can be reused and serialized.

    🔸 When to use JdbcRowSet?
        - When you want a scrollable ResultSet.
        - When building GUI apps or need cleaner data navigation.
        - When staying connected to the database is okay.


        ROWSET ADVANTAGES:

        - Scrollable: Move cursor freely (first(), last(), previous(), etc.)
        - Updatable: Modify and update data directly
        - Disconnected (CachedRowSet): Work offline, sync later
        - Event-driven: Can attach listeners (e.g., on row change)
        - JavaBeans compliant

        Types:
        - JdbcRowSet: Connected, simple wrapper over ResultSet
        - CachedRowSet: Disconnected, scrollable, updatable
        - WebRowSet: XML-based
        - FilteredRowSet: Filter rows dynamically
        - JoinRowSet: Join multiple RowSets

        Used when ResultSet is too limited or always connected.

*/