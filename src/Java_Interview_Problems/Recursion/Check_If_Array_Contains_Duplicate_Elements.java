package Java_Interview_Problems.Recursion;
// Program: Check_If_Array_Contains_Duplicate_Elements
// Topic: Recursion
// Description: This program checks if an array contains any duplicate elements using recursion.
// int[] arr = {1, 2, 3, 4, 5, 4};  // Example Array
// Array contains duplicates: true
public class Check_If_Array_Contains_Duplicate_Elements {
    public static boolean hasDuplicate(int[] arr, int index) {
        // Base case: if index reaches the end of the array, no duplicates found
        if (index == arr.length) {
            return false;
        }

        // Compare the current element with the rest of the elements
        for (int i = index + 1; i < arr.length; i++) {
            if (arr[index] == arr[i]) {
                return true;  // Duplicate found
            }
        }

        // Recursively check for duplicates in the remaining array
        return hasDuplicate(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4};  // Example array
        System.out.println("Array contains duplicates: " + hasDuplicate(arr, 0));  // Start from index 0
    }
}
