import java.util.Scanner;
public class TakeUserInputArray {
    public static void main(String[] args){
        System.out.println("This is TakeUserInputArray program.");

        int[] num = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num.length; i++){
            System.out.println("Enter " + (i + 1) + " number = ");
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < num.length; i++){
            System.out.println("You entered " + (i + 1) + " number = " + num[i]);
        }

        // sum of array
        int sum = 0;
        for (int number : num) {
            sum += number;
        }

        System.out.println("Sum of array is = " + sum);
        double average = (double) sum / num.length;
        System.out.println("Average of array is = " + average);

        sc.close();
    }

}
