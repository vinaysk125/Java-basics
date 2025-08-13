public class TypeCastingDemo {
    public static void main(String[] args){

        System.out.println("This is TypeCastingDemo program.");

        //Declare int and assign it as double (widening)
        int a = 5;
        double b = a;
        System.out.println("Widening = " + b);

        //Declare double and assign it as int (narrowing)
        double c = 7.0;
        int d = (int) c;
        System.out.println("narrowing = " + d);

        // Show difference between integer division and floating division.
        int p = 6, q = 2;
        System.out.println("Integer division = " + (p/q));
        System.out.println("floating division = " + (p / (float) q));

        // Parse "2500" into an int and "12.75" into a double.
        String strnum = "2500";
        int parsed = Integer.parseInt(strnum);
        System.out.println("Integer parse = " + parsed);

        String str1num = "12.75";
       // double num2 = double.parsedouble(str1num);
        double num2 = Double.parseDouble(str1num);
        System.out.println("double parse = " + num2);
    }
}
