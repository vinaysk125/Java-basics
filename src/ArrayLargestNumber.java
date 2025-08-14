import java.util.Scanner;
public class ArrayLargestNumber {
    public static void main(String[] args){

        System.out.println("This is ArrayLargestNumber program.");

        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];

        for (int i = 0; i < num.length; i++){
            System.out.println("Enter " + (i + 1) + " number = " );
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < num.length; i++){
            System.out.println("You entered " + (i + 1) + " number = " + num[i]);
        }
        int largest = num[0];

        for (int i = 0; i < num.length; i++){
            if (num[i] > largest){
                largest = num[i];

            }
        }

        int smallest = num[0];

        for (int i = 0; i < num.length; i++){
            if (num[i] < smallest){
                smallest = num[i];
            }
        }

        System.out.println("Latgest array element = " + largest);
        System.out.println("Smallest array element = " +smallest);


        // very simple using for-each loop for largest
        // int largest = num[0];
        // for (int number : num) {
        //      if (number > largest)
        //          largest = number;
        // }

        // very simple using for-each loop for smallest
        // int smallest = num[0];
        // for (int number : num) {
        //      if (number < smallest)
        //          smallest = number;
        // }
    }
    }
