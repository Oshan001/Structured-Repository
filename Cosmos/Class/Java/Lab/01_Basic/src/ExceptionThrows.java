public class ExceptionThrows {
    static void AgeChecker() throws Exception {
        int age = 2;
        if(age<18){
            throw new Exception("Not eligible!");
        }
        else{
            System.out.println("Eligible");
        }
    }
    public static void main(String[] args){
        try{
            AgeChecker();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
