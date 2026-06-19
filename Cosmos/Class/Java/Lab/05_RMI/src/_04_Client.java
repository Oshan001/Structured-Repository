/**
 * Step 4: Write the client to look up and call remote method
 */
import java.rmi.registry.*;

public class _04_Client {
    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.getRegistry("localhost", 1099);
        _01_Hello stub = (_01_Hello) registry.lookup("HelloService");

        String response = stub.sayHello();
        System.out.println("Response: "+response);
    }
}
