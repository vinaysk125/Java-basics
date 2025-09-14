package Week1;

public class Day1_Loops {
    public static void main(String[] args) {

        // Print numbers 1–10 - for loop because know exact condition

        for (int i=1; i<=10; i++){
            System.out.println(i);
        }

        // Sum of first N natural numbers. - while look because know condition

        int j = 1, n = 5;
        int sum = 0;
        while (j <= n){
            sum = sum + j;
            j++;
        }
        System.out.println("Sum of " + n + " is " + sum);

        // Reverse a number (123 → 321) - while loop because know exact condition

        int original_Number = 123;
        int reverse_Number = 0;

        while (original_Number > 0){
            int digit = original_Number % 10;

            reverse_Number = reverse_Number * 10 + digit;
            original_Number = original_Number / 10;
        }
        System.out.println("Reverse number of " + original_Number + " is = " + reverse_Number);

        // Fibonacci series up to N terms - do while because know exact condition and at least 1 run

         int fibonacci_Number = 5, fibonacci_First = 0, fibonacci_Second = 1;
         int temp = 0;
        // System.out.print(fibonacci_First + " " + fibonacci_Second + " ");
         do{
             System.out.print(fibonacci_First + " ");
             temp = fibonacci_First + fibonacci_Second;
             fibonacci_First = fibonacci_Second;
             fibonacci_Second = temp;
             fibonacci_Number--;
        } while(fibonacci_Number > 0);
    }
}
