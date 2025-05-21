import java.util.Scanner;
import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Initialize 2D array
        int[][] arr = new int[rows][cols];

        // Input elements
        System.out.println("Enter elements of the matrix (" + rows + " x " + cols + "):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Display the matrix
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
//            System.out.println(Arrays.toString(arr[row]));
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close(); // Always close the scanner
        }
    }
