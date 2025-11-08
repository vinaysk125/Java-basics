package Java_Interview_Problems.Array;
// Program: Find_Minimum_Element_In_Array
// Topic: Array
// Description: This program finds the minimum element in a given array.
// It demonstrates array traversal and comparison logic.
public class Find_Minimum_Element_In_Array {
public static void main(String[] args) {

    int[] arr = {21,43,3,54,65,7};

    // Initialize minimum with the first element
    int min = arr[0];

    // Traverse the array to find the minimum
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i]; // Update min if current element is smaller
        }
    }
    System.out.println("The minimum element in the array is: " + min);

    }
}
