package Week3.Java_Collections_Framework_And_Streams.Exception_Handling_And_Debugging_in_Java;

public class ExceptionHandling1 {
    static void main(String[] args) {


        try {
            int[] arr = new int[3];
            arr[3] = 4;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index issue." + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Match error." + e.getMessage());
        } catch (Exception e) {
            System.out.println("General exception." + e.getMessage());
        } finally {
            System.out.println("Program executed.");
        }

        // Handle NumberFormatException when converting "abc" to integer.

        try {
            int number = Integer.parseInt("ABC");
        } catch (NumberFormatException e) {
            System.out.println("Not converting as not correct." + e.getMessage());
        } finally {
            System.out.println("Program executed");
        }


        // Handle multiple exceptions using one catch (catch (Exception e)). This is used in real time company
        try {
            int[] arr = new int[3];
            arr[2] = 4;
            int result = 10 / 0;
            int number = Integer.parseInt("ABC");

        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | NumberFormatException e)  {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Program executed.");
        }

}
}