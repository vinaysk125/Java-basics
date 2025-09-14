package Basic_Question_IMP;

public class FindSizeofDataType {
    public static void main(String[] args){
//        int intType;
//        float floatType;
//        double doubleType;
//        char charType;
        // Use DataType.SIZE function to get size in bit to convert it in byte devide by 8.
        System.out.println(Byte.SIZE / 8);
        System.out.println(Short.SIZE / 8);
        System.out.println(Integer.SIZE / 8);
        System.out.println(Float.SIZE / 8);
        System.out.println(Double.SIZE / 8);
        System.out.println(Long.SIZE / 8);
        System.out.println(Character.SIZE / 8);
        // System.out.println((double) Boolean.SIZE / 8);
        // The actual size of a boolean in memory is JVM-dependent.
        // Even though logically it's just 1 bit, the JVM usually uses 1 byte or more for alignment reasons.

    }
}
