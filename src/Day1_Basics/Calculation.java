package Day1_Basics;
public class Calculation {
    public static void main(String[] args) {
        int a = 6;
        double b = 3.0;

        System.out.println("This is calculation program.");
        // Arithmatic operators
        System.out.println("Sum of a +  b = " + (a+b));
        System.out.println("Difference of a - b = " + (a-b));
        System.out.println("Product of a * b = " + (a*b));
        System.out.println("Quotient of a / b = " + (a/b));
        System.out.println("Modulus/reminder of a % b = " + (a%b));

        // String compare
        String compare = (a > b) ? "a is bigger" : "b is bigger";
        System.out.println(compare);

        int x = 10;
        // boolean condition check
        boolean condition = (a > b) && (a > x);
        System.out.println(condition);

        // pre/post operators

        int p = 1, q = 1;

        System.out.println("Pre increment = " + ++p);
        System.out.println("post increment = " + p++);
        System.out.println("After post increment =" + p);

        System.out.println("Pre decrement = " + --q);
        System.out.println("Post decrement = " + q--);
        System.out.println("After post decrement = " + q);


    }
}