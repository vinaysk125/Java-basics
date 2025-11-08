package Java_Interview_Problems.Array;
// Program: Sum_And_Average_Of_Array_Elements
// Topic: Array
// Description: This program calculates the sum and average of elements in an array.
// It demonstrates array traversal and basic arithmetic operations.

import java.util.Scanner;

public class Sum_And_Average_Of_Array_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n]; // Declare array
        int sum = 0; // Initialize sum

        // Input array elements and calculate sum
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            sum += arr[i]; // Add each element to sum
        }

        double average = (double) sum / n; // Calculate average

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);

        sc.close(); // Close Scanner
    }
}
