package Basic_Question_IMP;

import java.time.Year;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter year to check leap year = ");
        int year = sc.nextInt();

        System.out.println((year%4==0) ? "Leap year." : "Not Leap year.");

        sc.close();
    }
}

