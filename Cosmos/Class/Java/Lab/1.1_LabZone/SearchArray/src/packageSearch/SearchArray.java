package packageSearch;
import java.util.Scanner;

public class SearchArray {
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
				
				//Searching
				int searchElement;
				System.out.print("Enter the searching element: ");
				searchElement = sc.nextInt();
				
				for(int i=0;i<size;i++) {
					if(arr[i]==searchElement) {
						System.out.print("Element found at index "+i);
						break;
				}
					else if(i==size-1 && arr[i]!=searchElement)
					{
						System.out.print("Element not found!!");
					}
				
			}

	}
}
