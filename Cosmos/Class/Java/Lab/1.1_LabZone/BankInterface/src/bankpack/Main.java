package bankpack;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		BankClass obj = new BankClass();
		Scanner sc = new Scanner(System.in);
		int depositAmount, withdrawAmount, choice;
		do {
		System.out.println("Enter what you wanna do?? 1 for Deposite amount and 2 for Withdraw amount and 3 for exit:");
		choice = sc.nextInt();
		switch(choice) {
			case 1:
				System.out.println("Enter amount to be deposited: ");
				depositAmount = sc.nextInt();
				obj.deposit(depositAmount);
				System.out.println(depositAmount + " deposited successfullyyy!!");
				System.out.println("\n\nYour new balance in account is: ");
				obj.showBalance();
				break;
			
			case 2:
				System.out.println("Enter amount to be withdrawn: ");
				withdrawAmount = sc.nextInt();
				obj.withdraw(withdrawAmount);
				System.out.println(withdrawAmount + " withdrawn successfullyyy!!");
				System.out.println("\n\nYour new balance in account is: ");
				obj.showBalance();
				break;
		
			case 3:
				System.out.println("Exiting...");
				break;
			
			default:
				System.out.println("Invalid choiceeee!! Try againnn");
			}
		
		}while(choice!=3);
		
		}
}
