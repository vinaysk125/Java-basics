package Day2_LoopsArraysFolder;

import java.util.Scanner;
public class MultiTableUserEnterValue {
    public static void main(String[] args) {

        System.out.println("This is MultiTableUserEnterValue");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to print table = ");
        int number = sc.nextInt();

        for (int i=1; i<=10; i++){
            System.out.println(number + " * " + i + " = " + (i*number));

        }
        sc.close();
    }
}
