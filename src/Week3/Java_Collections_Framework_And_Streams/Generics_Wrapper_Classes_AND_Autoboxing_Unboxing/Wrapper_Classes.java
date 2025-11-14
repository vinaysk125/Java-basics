package Week3.Java_Collections_Framework_And_Streams.Generics_Wrapper_Classes_AND_Autoboxing_Unboxing;

public class Wrapper_Classes {
    public static void main(String[] args) {

        int primitiveInt = 50;
        Integer wrapperInt = primitiveInt; // Autoboxing
        int newInt = wrapperInt;            // Unboxing

        System.out.println("Primitive: " + primitiveInt);
        System.out.println("Wrapper: " + wrapperInt);
        System.out.println("Unboxed: " + newInt);

        // Utility methods
        String numStr = "123";
        int parsed = Integer.parseInt(numStr);
        System.out.println("Parsed from String: " + parsed);


//        Convert a double primitive to a Double object and back.


        double d = 12.34;                   // primitive
//      Double obj = Double.valueOf(d);     // valueOf() method (recommended):
        Double obj = d;                     // autoboxing / Java automatically boxes the primitive
        double num = obj;                   // unboxing // Java automatically unboxes the object

        System.out.println("Primitive: " + d);
        System.out.println("Wrapper object: " + obj);
        System.out.println("Unboxed primitive: " + num);

//        Use Character.isLetter() and Character.isDigit() methods.

        char char1 = 'A';
        char char2 = '1';
        char char3 = '#';

        System.out.println(Character.isLetter(char1));
        System.out.println(Character.isDigit(char2));
        System.out.println(Character.isLetterOrDigit(char3));

//        Parse a String "45.67" to double using Double.parseDouble().
        String num1 = "45.67";
        double num2 = Double.parseDouble(num1);
        System.out.println(num2);
    }
}
