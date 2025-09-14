package Day4_RevisionBasics;

import java.util.Scanner;

public class RevisionArray {
    public static void main(String[] args){
        System.out.println("Thisi is Take n numbers from user and print them back.");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number = ");
        int n = sc.nextInt();

        int[] numArray = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i+1) + " Number = ");
            numArray[i] = sc.nextInt();
        }
        // Print
        for (int i = 0; i < n; i++) {
            System.out.println("User entered " + (i+1) + " value = " + numArray[i]);
        }

        sc.close();
    }
}
