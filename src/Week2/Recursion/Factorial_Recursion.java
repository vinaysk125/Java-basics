package Week2.Recursion;

public class Factorial_Recursion {

public static int printFactorial (int n) {

    if (n == 0) return 1;
    return n * printFactorial(n-1);
}

public static void main(String [] args) {
    int n = 5;
    int fact = printFactorial(n);
    System.out.println(fact);
}
}
