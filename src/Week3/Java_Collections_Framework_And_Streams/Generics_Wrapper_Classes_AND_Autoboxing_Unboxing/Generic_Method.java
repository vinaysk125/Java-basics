package Week3.Java_Collections_Framework_And_Streams.Generics_Wrapper_Classes_AND_Autoboxing_Unboxing;


public class Generic_Method {

    public static <T> void printArray(T [] arr) {
        for (T num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        printArray(arr);

        String[] names = {"Vinay", "Karan", "Rohit"};
        printArray(names);
    }

}
