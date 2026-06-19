class AgeException extends Exception{
    AgeException(String msg){
        super(msg);
    }
}

class AgeCheck{
    static int age = 20;
    static void AgeChecker() throws AgeException{
        if(age<18){
            throw new AgeException("Not eligible");
        }
        else{
            System.out.print("Eligible to Vote");
        }
    }

}
public class UserDefinedException {
    public static void main(String[] args){
        try{
            AgeCheck.AgeChecker();
        } catch(AgeException e){
            System.out.print(e.getMessage());
        }
    }
}
