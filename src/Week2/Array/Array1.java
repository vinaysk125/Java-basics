package Week2.Array;

public class Array1 {

    // 1D Array
    int[] numbers = new int[5];          // Declaration + memory allocation
    int[] marks = {90, 80, 85, 70, 95};  // Direct initialization

    // 2D Array
    int[][] matrix = new int[2][3];

    int[][] mat = {
            {1,2,3},
            {4,5,6}
    };

    // Main method to start program

public static void main(String[] args) {
    Array1 a = new Array1();
    System.out.println(a.numbers.length);
    System.out.println(a.marks[0]);
//    a.marks[0] = 96;
    System.out.println(a.marks[0]);
    System.out.println(a.numbers[2]);

    for (int i : a.marks) {
        System.out.println(i);
    }

    // 2D array output

    System.out.println(a.mat[0][1]);
}
}
