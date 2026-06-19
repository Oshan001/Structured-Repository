public class BasicException {
    public static void main(String[] args){
        int numerator = 5;
        int denominator = 8;
        try{
            int result = numerator/denominator;
            System.out.print(result);
        } catch(Exception e){
            System.out.println("Can't divide by zero!");
        }
    }
}
