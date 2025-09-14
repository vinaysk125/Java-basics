package Day4_RevisionBasics;

public class RevisionPrintNumber {
    public static void main(String[] args){
        System.out.print("This is RevisionPrintNumber program");

//        for (int i = 1; i <= 10; i++){
//            System.out.println(i);
//        }
        // Print even numbers up to 20 (while loop)
//        int i = 1;
//        while (i <= 20){
//            if(i % 2 == 0){
//                System.out.println(i);
//            }
//            i++;
//        }

        // Print patter
        //*
        //**
        //***
        //****

        for (int i = 0; i <= 4; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
