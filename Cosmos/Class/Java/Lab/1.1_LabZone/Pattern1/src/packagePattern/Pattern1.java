package packagePattern;
import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		int rows, columns;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of rows: ");
		rows = sc.nextInt();
		System.out.print("Enter no. of coloumns: ");
		columns = sc.nextInt();
		
		System.out.print("\n1st Pattern\n");
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.print("\n2nd Pattern\n");
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=columns;j++) {
				if(i==1 || i==rows || j==1 || j==columns)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}
