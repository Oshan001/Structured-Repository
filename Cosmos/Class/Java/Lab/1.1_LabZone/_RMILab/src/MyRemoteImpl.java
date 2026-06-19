import java.rmi.*;
import java.rmi.server.*; // for UnicastRemoteObject

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{
    int totalAmt = 10000;
    public MyRemoteImpl() throws RemoteException{
        super();
    }
    public void deposite(int depositedAmt)throws RemoteException{
        totalAmt += depositedAmt;
        System.out.println(depositedAmt + " deposited successfully!");
    }
    public void withdraw(int withdrawnAmt)throws RemoteException{
        totalAmt -= withdrawnAmt;
        System.out.println(withdrawnAmt + " withdrawn successfully!");
    }
    public int showBalance()throws RemoteException{
        return totalAmt;
    }
}
