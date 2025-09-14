package Day3_4_StringArray;

// import java.util.Scanner; Not required as we are using here StringBuilder for string not scanner
public class StringBuilderBasic {
    public static void main(String[] args){

        System.out.println("This is StringBuilderBasic program");

        StringBuilder sb = new StringBuilder();

        sb.append("Hello").append(" ").append("Vinay");

        String result = sb.toString(); // Convert StringBuilder to normal String

        sb.reverse(); // Reverse the String it used sb as StringBuilder

        System.out.println(result);
        System.out.println(sb);
    }
}
