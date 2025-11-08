package Java_Interview_Problems.Array;
// Program: Move_All_Zeros_To_End_Of_Array
// Topic: Array
// Description: This program moves all zeros in an array to the end while maintaining the order of non-zero elements.
// It demonstrates array traversal and in-place modification.

import java.util.Scanner;

public class Move_All_Zeros_To_End_Of_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int count = 0; // Count of non-zero elements

        // Traverse the array and move non-zero elements forward
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i]; // Place non-zero element at the next available position
                count++;
            }
        }

        // Fill remaining positions with zeros
        while (count < n) {
            arr[count] = 0;
            count++;
        }

        // Print the modified array
        System.out.print("Array after moving zeros to the end: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close(); // Close Scanner
    }
}
