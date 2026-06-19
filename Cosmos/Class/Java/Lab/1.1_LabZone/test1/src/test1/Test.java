package test1;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter your name: ");
		String name = sc.next(); // It only reads one word and does not consume new line i.e., when I press enter then it won't consume that
		
		sc.nextLine(); // It consumes that new line that wasn't consumed by above line..if we don't do this the response = sc.nextLine() will think '\n' is already there so we won't be able to give i/p
		
		System.out.print("Hi, "+name+"....How are u???");
		String response = sc.nextLine(); 
		
		//if(response=="Good" || response=="Fine") in java we can't compare stings using == so we need to use .equals
		if(response.equalsIgnoreCase("Good") || response.equalsIgnoreCase("Fine"))
			System.out.print("That's niceeeee");
		
		else
			System.out.print("Ohhh!! Take careeee");
		
		sc.close(); // Good practice - release system resources
	}
}
