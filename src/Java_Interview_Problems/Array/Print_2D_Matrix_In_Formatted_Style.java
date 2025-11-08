package Java_Interview_Problems.Array;
// Program: Print_2D_Matrix_In_Formatted_Style
// Topic: Array
// Description: This program takes a 2D array (matrix) input from the user
// and prints it in a well-formatted style. It demonstrates nested loops for matrices.

import java.util.Scanner;

public class Print_2D_Matrix_In_Formatted_Style {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols]; // Declare a 2D array

        // Input elements for the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print the matrix in formatted style
        System.out.println("\nThe 2D matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t"); // '\t' adds tab spacing for alignment
            }
            System.out.println(); // Move to next row
        }

        sc.close(); // Close Scanner
    }
}
