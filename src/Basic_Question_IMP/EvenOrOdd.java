package Basic_Question_IMP;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to check even or odd = ");
        int number = sc.nextInt();

        System.out.println((number % 2 == 0) ? "Even" : "Odd");

        }
    }
