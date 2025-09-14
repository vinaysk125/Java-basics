package Day2_LoopsArraysFolder;

import java.util.Scanner;
public class MultiTableUserEnterMultipleValues {
    public static void main(String[] args){
        System.out.println("This is MultiTableUserEnterMultipleValues program.");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many times you print table = ");
        int NoOfTimes = sc.nextInt();

        for (int i = 1; i<=NoOfTimes; i++){
            System.out.println("Enter " + i + " number to create and print multiplication table = ");
            int num = sc.nextInt();

            for (int j = 1; j<=10; j++){
                System.out.println(num + " * " + j + " = " + (num * j));
            }
        }
        sc.close();
    }
}
