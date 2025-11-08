package Week2.Recursion;

public class SumOfArray_Recursion {

    public static int sumArray(int[] a, int n) {
        if (n == 0) return 0;

        return a[n-1] + sumArray(a, n-1);
    }

    public static void main(String [] args) {
        int[] a = {1,2,3,4,5};
        int n = a.length;

        System.out.println(sumArray(a,n));
    }
}
