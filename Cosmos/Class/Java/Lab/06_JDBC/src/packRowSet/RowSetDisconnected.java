// RowSetDisconnected.java
package packRowSet;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

/**
 * Demonstrates the use of CachedRowSet, a disconnected RowSet.
 *
 * CachedRowSet connects to the database only when executing commands,
 * then disconnects allowing offline access and manipulation of data.
 *
 * Changes made offline can be synchronized back to the database later.
 */
public class RowSetDisconnected {
    public static void main(String[] args) throws Exception {
        // Create RowSetFactory using standard API (recommended over specific implementations)
        RowSetFactory factory = RowSetProvider.newFactory();

        // Create CachedRowSet object from the factory
        CachedRowSet cachedRowSet = factory.createCachedRowSet();

        // Set database connection details
        cachedRowSet.setUrl("jdbc:mysql://localhost:3306/TestPractice");
        cachedRowSet.setUsername("root");
        cachedRowSet.setPassword("");

        // Set the SQL query command
        cachedRowSet.setCommand("SELECT * FROM test");

        // Execute the query - establishes temporary connection and fetches data
        cachedRowSet.execute();

        // Now the CachedRowSet is disconnected from the database
        // You can iterate and access the data offline without an active DB connection
        while (cachedRowSet.next()) {
            int roll = cachedRowSet.getInt("roll");
            String name = cachedRowSet.getString("name");

            System.out.println("Offline: " + roll + " - " + name);
        }

        // You can modify data offline here using updateXXX methods, add rows, etc.
        // Later, you can call cachedRowSet.acceptChanges(conn) with an active Connection
        // to synchronize changes back to the database.
    }
}

        /*
         =======================
         NOTE:
         =======================
         - CachedRowSet is a **disconnected** rowset.
         - After calling `execute()`, it disconnects from the database and holds the result set in memory.
         - You can:
             • Scroll forward and backward (it's scrollable)
             • Modify data offline using `updateXXX()` methods
             • Add or delete rows offline
         - To sync changes back to the DB:
             • Call `cachedRowSet.acceptChanges(Connection conn)` with an active DB connection
         - Ideal for reducing DB load — no need to keep connection open for read-only or batch updates
         - Using RowSetFactory is preferred over direct instantiation (e.g., `new CachedRowSetImpl()`)
         - Offers better portability and future-proofing
        */