package Week2.Recursion;

public class Print_numbers_from_N_to_1_Recursion {


public static void printRecursion(int n) {

    if (n == 0) return;
    System.out.print(n + " ");
    printRecursion(n-1);
}

public static void main (String[] args) {
    int n = 5;
    printRecursion(n);
}
}
