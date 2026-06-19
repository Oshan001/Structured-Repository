package exceptionpack;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.print("Enter the first number: ");
        n1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        n2 = sc.nextInt();

        Integer result = div(n1, n2); // Using Integer object to allow null

        if (result != null) {
            System.out.println(n1 + " / " + n2 + " = " + result);
        }

        sc.close();
    }

    static Integer div(int num1, int num2) {
        try {
            return num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
            return null;
        }
    }
}