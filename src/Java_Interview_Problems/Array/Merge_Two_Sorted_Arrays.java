package Java_Interview_Problems.Array;
// Program: Merge_Two_Sorted_Arrays
// Topic: Array
// Description: This program merges two sorted arrays into a single sorted array.
// It demonstrates array traversal, comparison, and merging logic.

import java.util.Scanner;

public class Merge_Two_Sorted_Arrays {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first sorted array
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first sorted array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input second sorted array
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second sorted array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] merged = new int[n1 + n2]; // Array to store merged result
        int i = 0, j = 0, k = 0;

        // Merge arrays by comparing elements
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Copy remaining elements from first array
        while (i < n1) {
            merged[k++] = arr1[i++];
        }

        // Copy remaining elements from second array
        while (j < n2) {
            merged[k++] = arr2[j++];
        }

        // Print merged array
        System.out.print("Merged sorted array: ");
        for (int idx = 0; idx < merged.length; idx++) {
            System.out.print(merged[idx] + " ");
        }

        sc.close(); // Close Scanner
    }
}
