import java.util.Scanner;
public class Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] strArray = new String[10];
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println("\nEnter 5 names: \n");
        for(int i = 0; i<5; i++){
            strArray[i] = sc.nextLine();
        }

        for(int i = 0; i<intArray.length; i++){
                System.out.println(intArray[i] + ": "+strArray[i]);
        }

        // for-each case for array traversal
        for(String names: strArray){
            System.out.println("\n\n"+names);
        }
    }
}