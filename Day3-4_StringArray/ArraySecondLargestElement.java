import java.util.Scanner;
public class ArraySecondLargestElement {
    public static void main(String args[]){
        System.out.println("This is ArraySecondLargestElement program");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n = ");
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        // find first largest element

        int firstLargest = array[0];
        for (int i = 0; i < n; i++){
            if(array[i] > firstLargest){
                firstLargest = array[i];
            }
        }
        System.out.println("Largest element = " + firstLargest);

        // Second Largest

        int secondLargest = -1;
        for (int i = 0; i < n; i++){
            if (array[i] > secondLargest && array[i] != firstLargest){
                secondLargest = array[i];

            }
        }
        System.out.println("Second smallest element = " + secondLargest);

        sc.close();
    }

}
