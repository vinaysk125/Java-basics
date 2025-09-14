package Day3_4_StringArray;

public class StringCommonMethod {
    public static void main(String[] args){

        String str = "Vinay Palankar";

        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.substring(0, 6));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println("Vinay".equals("vinay"));
        System.out.println(str.contains("kar"));
        System.out.println(str.startsWith("Vi"));
        System.out.println(str.endsWith("kar"));


    }
}
