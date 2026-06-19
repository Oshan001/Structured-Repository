package addpack;
import java.util.Scanner;

public class MatAdd {
    public static void main(String[] args) {
        int rows, cols;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the order of both matrices:");
        System.out.print("Number of rows: ");
        rows = sc.nextInt();
        System.out.print("Number of columns: ");
        cols = sc.nextInt();

        int[][] MatA = new int[rows][cols];
        int[][] MatB = new int[rows][cols];

        System.out.println("\nEnter the elements of Matrix A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                MatA[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nEnter the elements of Matrix B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                MatB[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatrix A:");
        printMatrix(MatA, rows, cols);

        System.out.println("\nMatrix B:");
        printMatrix(MatB, rows, cols);

        System.out.println("\nMatrix A + Matrix B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print((MatA[i][j] + MatB[i][j]) + "\t");
            }
            System.out.println();
        }

        sc.close();
    }

    public static void printMatrix(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}