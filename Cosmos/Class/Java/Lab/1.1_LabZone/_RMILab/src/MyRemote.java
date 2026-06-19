import java.rmi.*;
public interface MyRemote extends Remote{
    public void deposite(int depositedAmt) throws Exception;
    public void withdraw(int withdrawnAmt) throws Exception;
    public int showBalance() throws Exception;
}