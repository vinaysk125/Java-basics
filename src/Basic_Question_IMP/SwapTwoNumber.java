package Basic_Question_IMP;

public class SwapTwoNumber {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        // using temp
//        int temp = num1;
//        num1 = num2;
//        num2 = temp;

        // without using temp
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        

        System.out.println("Num1 = " + num1 + " Num2 = " + num2);

    }
}
//Logic without using temp
//num1 = 10 + 20 = 30;
//num2 = 30 - 20 = 10
//num1 = 30 - 20 = 20