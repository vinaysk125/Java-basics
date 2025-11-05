package Week2.Array;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int[] marks = {90, 80, 85, 70, 95};

//    Print the length of the array.
        System.out.println("Length of makes array is = " + marks.length);
//    Print the 3rd element (remember: array indexes start from 0).
        System.out.println("3rd element of array index is = " + marks[2]);
//        Print all elements of the array using an enhanced for loop (for-each).
        for (int m : marks) {
            System.out.print(m + " ");
        }
//        Find the highest mark in the array using a loop (don’t use built-in functions).
        int highest_Marks = marks[0];
        for (int m : marks) {
            if (m > highest_Marks) {
                highest_Marks = m;
            }
        }
        System.out.println("Highest marks = " + highest_Marks);

//    Sort the array in ascending order using the Arrays.sort() method from the java.util package.
        Arrays.sort(marks);
        System.out.println("Sorted array = " + Arrays.toString(marks));

//    Create a 2D array (matrix) with two rows and three columns, for example: {{1, 2, 3}, {4, 5, 6}}

        int[][] arr2d = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("The element in the 2nd row and 3rd column in 2d array is  = " + arr2d[1][2]);
    }

}