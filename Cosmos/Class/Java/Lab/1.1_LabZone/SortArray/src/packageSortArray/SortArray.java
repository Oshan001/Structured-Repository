package packageSortArray;
import java.util.Scanner;

public class SortArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size;
		System.out.print("Enter the size of array: ");
		size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.print("Enter the array elements: ");
		for(int i=0;i<size;i++) {
			int element = sc.nextInt();
			arr[i] = element;
		}
		
		//Sorting
		for(int i=0; i<size;i++) {
			for(int j=i+1; j<size; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		//Printing sorted array
		System.out.print("Sorted array is: \n");
		for(int i: arr) {
			System.out.print(i+"\t");
		}
	}
}
