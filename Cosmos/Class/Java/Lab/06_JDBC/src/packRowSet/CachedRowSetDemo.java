package packRowSet;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class CachedRowSetDemo {
    public static void main(String[] args) throws Exception {

        // Step 1: Create RowSetFactory
        RowSetFactory factory = RowSetProvider.newFactory();

        // Step 2: Create CachedRowSet instance
        CachedRowSet crs = factory.createCachedRowSet();

        // Step 3: Set DB connection parameters
        crs.setUrl("jdbc:mysql://localhost:3306/NewDB");
        crs.setUsername("root");
        crs.setPassword("<your-password>"); // replace with your password

        // Step 4: Set SQL query
        crs.setCommand("SELECT * FROM students");

        // Step 5: Execute the query (fetches data from DB and disconnects)
        crs.execute();

        // Step 6: Work with the data like ResultSet (but it's now disconnected)
        while (crs.next()) {
            int id = crs.getInt("id");
            String name = crs.getString("name");
            int age = crs.getInt("age");
            String email = crs.getString("email");

            System.out.println("ID: " + id + " | Name: " + name + " | Age: " + age + " | Email: " + email);
        }

        // Step 7: Close the CachedRowSet
        crs.close();
    }
}

/*
    🔸 What is CachedRowSet?
    - It is a disconnected, scrollable, updatable version of ResultSet.
    - Data is fetched once and cached in memory.
    - After `execute()`, it no longer needs to stay connected to DB.
    - Good for lightweight apps, data processing, serialization.

    🔸 Use Cases:
    - Desktop or web applications where we want to reduce DB load.
    - Working offline on data, then reconnecting only for updates.

    🔸 Difference from JdbcRowSet:
    - JdbcRowSet is connected — always needs DB link.
    - CachedRowSet fetches, then disconnects (offline-safe).

    🔸 How it's safe:
    - You can manipulate data in memory, without affecting DB directly.
    - Later, changes can be propagated if needed (we’ll learn that later).

    🔸 Must include `javax.sql.rowset` package (Java SE 7+).
*/