import java.rmi.*;

public class RMIClient {
    public static void main(String[] args)throws Exception{
    MyRemote obj = (MyRemote) Naming.lookup("rmi://localhost/MyObject");
    System.out.println("Total Amount: "+obj.showBalance());
    obj.deposite(1000);
    System.out.println("Total amout after deposite: "+obj.showBalance());
    obj.withdraw(6000);
    System.out.println("Total amount after withdraw: "+obj.showBalance());
    }
}
