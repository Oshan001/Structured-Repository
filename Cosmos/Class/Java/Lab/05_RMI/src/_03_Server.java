/**
 * Step 3: Create the server to register the remote object
 */
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class _03_Server {
    public static void main(String[] args) throws Exception{
            _02_HelloImplement obj = new _02_HelloImplement();

            // Create and export registry on port 1099
            Registry registry = LocateRegistry.createRegistry(1099);

            // Bind the remote object's stub in the registry
            registry.rebind("HelloService", obj);

            System.out.println("Server ready.");
    }
}
