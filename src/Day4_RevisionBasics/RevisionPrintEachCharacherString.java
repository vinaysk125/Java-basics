package Day4_RevisionBasics;

import java.util.Scanner;

public class RevisionPrintEachCharacherString {
    public static void main(String[] args){

        System.out.println("This is RevisionPrintEachCharacherString program.");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a name = ");
        String name = sc.nextLine();



        for (int i = 0; i < name.length(); i++){

            char ch = name.charAt(i);

            System.out.println(ch);
        }
        sc.close();
    }
}

