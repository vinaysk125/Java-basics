import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args){

        System.out.println("THis is ReverseArray program.");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }
        // int length = array.length;
        // System.out.println(length);
        // Reverse array
        for (int j = n-1; j >= 0; j--){
            System.out.println(array[j]);
        }
        sc.close();
    }

}
