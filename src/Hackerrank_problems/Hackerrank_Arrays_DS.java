//An array is a data structure that stores elements of the same type in a contiguous block of memory. In an array, , of size , each memory location has some unique index,  (where ), that can be referenced as  or .
//
//Your task is to reverse an array of integers.
//
//        Note: If you've already solved our C++ domain's Arrays Introduction challenge, you may want to skip this.
//
//Example
//
//Return .
//
//        Function Description
//
//Complete the function  with the following parameter(s):
//
//        : the array to reverse
//Returns
//
//: the reversed array
//Input Format
//
//The first line contains an integer, , the number of integers in .
//The second line contains  space-separated integers that make up .
//
//        Constraints
//
//Sample Input 1
//
//CopyDownload
//Array: arr
//1
//        4
//        3
//        2
//
//
//        4
//        1 4 3 2
//Sample Output 1
//
//        2 3 4 1
//Explanation 1
//
//The original array is . Reversed, it is .

package Hackerrank_problems;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        List<Integer> reversed = new ArrayList<>();
        for (int i = a.size() - 1; i >= 0; i--) {  // this starts from last valid index
            reversed.add(a.get(i));
        }
        return reversed;
    }


}



public class Hackerrank_Arrays_DS {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        List<Integer> res = Result.reverseArray(arr);

        for (int i = 0; i < res.size(); i++) {
            bufferedWriter.write(String.valueOf(res.get(i)));

            if (i != res.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
