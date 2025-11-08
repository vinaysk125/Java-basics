package Java_Interview_Problems.Array;
import java.util.Scanner;

// Program: Accept_Array_Input_From_User
// Topic: Array
// Description: This program takes input from the user to fill an array and then prints the array.
// It demonstrates how to use Scanner to accept array input.

public class Accept_Array_Input_From_User {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] arr = new int[n];

    for (int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }

    for (int i=0;i<n;i++){
        System.out.println(arr[i]);
    }
}
}
