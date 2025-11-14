package Java_Interview_Problems;

public class Merge_two_sorted_array {
    public static void main(String[] args) {
        //        Merge two sorted array in java {1,2,3,0,0,0} , {3,4,5}
//        M and n size are fixed here
//        Time complexity = O(m+n) and space complexity O(1)
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {3,4,5};
        int m = 3, n = 3; // must be known
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (num1[i] > num2[j]) {
                num1[k] = num1[i];
                i--;
            } else {
                num1[k] = num2[j];
                j--;
            }
            k--;
        }
        while (j >= 0) {
            num1[k] = num2[j];
            j--;
            k--;
        }

        for (int num : num1) {
            System.out.print(num + " ");
        }
    }
}
