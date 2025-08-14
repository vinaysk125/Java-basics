import java.util.Scanner;

public class PrintEvenNum1to20Enhance {
    public static void main(String[] args) {

        System.out.println("This is PrintEvenNum1to20Enhance program.");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 'even' or 'odd' to print number 1 to 20 = ");
        String input = sc.nextLine().toLowerCase();

        for (int i = 1; i <= 20; i++) {
            if (input.equals("even") && i % 2 == 0) {
                System.out.println(i);
            } else if (input.equals("odd") && i % 2 != 0) {
                System.out.println(i);
            }

        }
        sc.close();
    }
}
