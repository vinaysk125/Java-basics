package Java_Interview_Problems.Recursion;
// Program: Sum_Of_Array_Using_Recursion
// Topic: Recursion
// Description: This program calculates the sum of all elements in an array using recursion.
public class Sum_Of_Array_Using_Recursion {

    public static int printSum(int[] arr, int n) {
        if (n == 0) return 0;

        return arr[n - 1] + printSum(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(printSum(arr,arr.length));
    }
}
