package Week2;

import java.util.Scanner;

public class ArrayPractice1 {
public static void main (String[] args) {
    int [] numbers = {342,342,234,54,65,765};
    int[] numbers1 = new int[4];
    //    Write a program to find minimum element in array.
    int min_Element = numbers[0];
    for (int n : numbers) {
        if (min_Element > n) {
            min_Element = n;
        }
    }
    System.out.println("Minimum element in array numbers = " + min_Element);

    //    Find sum and average of array elements.
    int sum = 0;
        for (int n : numbers) {
        sum += n;
    }
    int average = sum / numbers.length;
    System.out.println("Sum of element in array numbers = " + sum + " And average of number = " + average);

    //    Accept array input from user (Scanner).
    Scanner sc = new Scanner(System.in);
    int[] arrUser = new int[5];
        for (int i=0; i<arrUser.length; i++) {
        System.out.println("Enter the " + i + " number for size " + arrUser.length + " array");
        arrUser[i] = sc.nextInt();
    }

    for (int i=0; i<arrUser.length; i++) {
        System.out.println(arrUser[i] + " ");
    }

    //    Print a 2D matrix in formatted style.
    int[][] arr2d = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
    };
    System.out.println("2D matrix array 3*3");
        for (int i=0; i<arr2d.length; i++) {
        for (int j=0; j<arr2d.length; j++) {
            System.out.print(arr2d[i][j] + " ");
        }
        System.out.println();
    }
}
}
