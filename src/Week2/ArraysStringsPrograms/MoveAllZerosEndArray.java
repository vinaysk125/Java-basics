package Week2.ArraysStringsPrograms;
//  Move all zeros to end of array

public class MoveAllZerosEndArray {

    public static void moveZeros(int[] arr) {
        int index = 0;
        for(int i=0; i<arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
    }

public static void main(String[] args)    {
    int[] arr = {0,1,0,2,12};
    System.out.println("Array length = " + arr.length);
    moveZeros(arr);

    for (int num: arr) {
        System.out.print(num + " ");
    }
}
}
