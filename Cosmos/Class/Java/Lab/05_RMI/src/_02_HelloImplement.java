/**
 * Step 2: Implement the remote interface
 */
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class _02_HelloImplement extends UnicastRemoteObject implements _01_Hello {

    protected _02_HelloImplement() throws RemoteException {
        super();
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Helloooooooo";
    }
}
