package factorialPackage;
import java.util.Scanner;

public class Fact {
	public static long fact(int n) {
		if(n==1 || n==0)
			return 1;
		else
			return n*fact(n-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
		System.out.print("Enter a number: ");
		n = sc.nextInt();
		
		if(n<0)
			System.out.println("Factorial is not defined for -ve no.s so please enter +ve no.s or 0 only...");
		} while(n < 0);
			
		System.out.print("\n"+n+"!"+" = "+fact(n));
		sc.close();
	}
}

/*
public class Fact {
	public long fact(int n) {
		if(n==1 || n==0)
			return 1;
		else
			return n*fact(n-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
		System.out.print("Enter a number: ");
		n = sc.nextInt();
		
		if(n<0)
			System.out.println("Factorial is not defined for -ve no.s so please enter +ve no.s or 0 only...");
		} while(n < 0);
			
		Fact f = new Fact();
		System.out.print("\n"+n+"!"+" = "+f.fact(n));
		sc.close();
	}
}
*/
