public class FunctiontoCheckEvenorOddNumber {

    // First function/method
    static String evenOrOdd (int num){
        if (num % 2 == 0){
            return "Even number";
        } else{
            return  "Odd number";
        }
    }

    static void funTwo(){
        System.out.println("This is Second Function");
    }

    // Main function to execute first.

    public static void main(String[] args){

        System.out.println("This is FunctiontoCheckEvenorOddNumber program.");

        System.out.println("Go to First function = " + evenOrOdd(2)); // must to be return anything.

        funTwo(); // This will not return anything only print.

    }
}
