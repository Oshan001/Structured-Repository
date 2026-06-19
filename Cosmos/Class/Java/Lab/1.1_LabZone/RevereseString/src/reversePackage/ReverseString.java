package reversePackage;
import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String string = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(string);
		String reversedString = sb.reverse().toString();
		
		System.out.print(reversedString);
		
		// OR
		
		System.out.println("Enter another string: ");
		char[] string0 = sc.next().toCharArray();
		
		String reversed = "";
		
		for(int i = string0.length - 1; i>=0; i--) {
			reversed += string0[i];
		}
		
		System.out.print(reversed);
			
		sc.close();
	}
}
