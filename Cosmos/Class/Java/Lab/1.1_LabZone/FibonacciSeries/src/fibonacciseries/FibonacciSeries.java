package fibonacciseries;
import java.util.Scanner;

/*
public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a=0, b=1, c, n;
		System.out.println("Enter no. of terms upto which u wanna print fibonacci seris: ");
		n = sc.nextInt();
		
		if(n<=0)
			System.out.println("Nothing to print...");
		else {
			for(int i=1; i<=n; i++) {
				System.out.print(a+"\t");
				c=a+b;
				a=b;
				b=c;
			}
		}
		sc.close();
	}
}

*/

// Using Recursion

public class FibonacciSeries{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter no. of terms: ");
		int terms = sc.nextInt();
		
		for(int i=0; i<terms; i++) {
			System.out.print(Fibonacci(i)+"\t");
		}
	}
	
	public static int Fibonacci(int n) {
		if(n==0 || n==1)
			return n;
		else
			return Fibonacci(n-1)+Fibonacci(n-2);
	}
}