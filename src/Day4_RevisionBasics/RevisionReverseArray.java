package Day4_RevisionBasics;

import java.util.Scanner;
public class RevisionReverseArray {
    public static void main(String[] args){
        System.out.println("This is RevisionReverseArray program.");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array n value = ");
        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // print in reverse order

        for (int i = 0; i < n; i++) {
            System.out.println(array[n - 1 - i]);
        }

        sc.close();
     }
}
