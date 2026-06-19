import java.rmi.*;
import java.rmi.registry.*;

public class MyRemoteServer {
    public static void main(String[] args) throws Exception{
        MyRemoteImpl obj = new MyRemoteImpl();
        LocateRegistry.createRegistry(1099);
        System.out.println("RMI Registry Started...");
        Naming.rebind("MyObject", obj);
    }
}
