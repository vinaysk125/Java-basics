package Day4_RevisionBasics;

import java.util.Scanner;
public class RevsionArrayLargestSmallestNumber {
    public static void main(String[] args){
        System.out.println("Thi is RevsionArrayLargestSmallestNumber program");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value = ");
        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        int largest = array[0];
//        int smallst = array[0];

        for (int i = 0; i < n; i++){
            if (array[i] >  largest) {
                largest = array[i];
            }
        }

        int smallest = array[0];

        for (int i = 0; i < n; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        System.out.println("Largest element = " + largest);
        System.out.println("Smallest element = " + smallest);
        sc.close();
    }
}
