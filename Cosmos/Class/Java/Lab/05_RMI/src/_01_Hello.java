/**
 * Step 1: Define the Remote Interface
 */

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface _01_Hello extends Remote {
    String sayHello() throws RemoteException;
}