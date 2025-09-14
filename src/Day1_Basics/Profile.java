package Day1_Basics;
public class Profile {
    public static void main(String[] args) {
        System.out.println("This is profile information");
        String name = "Vinay";
        final int age = 24; // constant variable 'final'
        String city = "Mumbai";
        char grade = 'A';
        double bigpointnumber = 123.21312323;
        float smallpointnumber = 12.121f;
        boolean decision = true;

        System.out.println("Name = " + name);
        System.out.println("age = " + age);
        System.out.println("city = " +city);
        System.out.println("grade = " + grade);
        System.out.println("big_point_number = " + bigpointnumber);
        System.out.println("small_point_number = " + smallpointnumber);;
        System.out.println("decision = " + decision);

        // Example using printf for cleaner numeric formatting
        System.out.printf("Formatted point number for 4 decimal = %.4f%n", bigpointnumber);
        System.out.printf("Formatted point number for 4 decimal = %.2f", smallpointnumber);
    }
}
