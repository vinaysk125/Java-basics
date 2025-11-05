package Week2;

public class DSAArrayProblem1 {
    public static void main(String[] args) {
//    Reverse an array

        int[] reverseArray = {1,2,3,4,5};
        int start = 0;
        int end = reverseArray.length - 1;
        while (start < end) {
            int temp = reverseArray[start];
            reverseArray[start] = reverseArray[end];
            reverseArray[end] = temp;
            start++;
            end--;
        }
        System.out.println("---Reverse array reversArray---");
        for (int n : reverseArray) {
            System.out.print(n + " ");
        }
        System.out.println("\n---To find second largest number---");
//    Find second-largest element
        int [] secondLargest = {5, 8, 12, 3, 9};
        int largestNumber = Integer.MIN_VALUE; // very small starting point
        int secondLargestNumber = Integer.MIN_VALUE; // Same here

        for (int num : secondLargest) {
            // Case 1: Found a new biggest number
            if (num > largestNumber) {
                secondLargestNumber = largestNumber; // previous biggest becomes 2nd biggest
                largestNumber = num;  // update largest
            }
            // Case 2: Not biggest, but bigger than 2nd biggest
            else if (num > secondLargestNumber && num < largestNumber) {
                secondLargestNumber = num; // update second largest only
            }
        }
        System.out.println("First largest number = " + largestNumber);
        System.out.println("Second largest number = " + secondLargestNumber);

//    Check if array is sorted
        int [] checkSortedArray = {1,2,3,4,5};
        boolean isSorted = true; // assume array is sorted initially
        for (int i=0; i<checkSortedArray.length-1; i++) {
            if(checkSortedArray[i] > checkSortedArray[i+1]) {
                isSorted = false;
                break; // no need to check further
            }
        }
        if (isSorted) {
            System.out.println("Array is sorted!");
        } else {
            System.out.println("Array is not sorted!");
        }

//    Rotate array by one position
//        Input:  [1, 2, 3, 4, 5]
//        Output: [5, 1, 2, 3, 4]

        int[] rotateArrayBy1 = {1,2,3,4,5};
        int last = rotateArrayBy1[rotateArrayBy1.length-1];

        for (int i=rotateArrayBy1.length-2; i>=0; i--){
            rotateArrayBy1[i+1] = rotateArrayBy1[i];
        }
        rotateArrayBy1[0] = last;
        System.out.println("After Rotate array by one position");
        for (int num : rotateArrayBy1) {
            System.out.print(num + " ");
        }

//    Count frequency of each element
        System.out.println("\nCount frequency of each element");
        int[] arrFrequency = {10, 10, 20, 30, 40, 50, 20, 40};

        // To mark visited elements
        boolean[] isVisited = new boolean[arrFrequency.length];

        for (int i=0; i<arrFrequency.length; i++) {
            if (isVisited[i]) continue;
            int count = 1;

            for (int j=i+1; j<arrFrequency.length; j++) {
                if (arrFrequency[i] == arrFrequency[j]) {
                    count++;
                    isVisited[j] = true;
                }
            }
            System.out.println(arrFrequency[i] + "        | " + count);
        }
    }
}

//        for(int i=0;i<arrFrequency.length;i++) {
//            int x = arrFrequency[i];
//            int count=0;
//            if (x == -1) continue;
//            for (int j=0;j<arrFrequency.length;j++) {
//                if (x == arrFrequency[j]) {
//                    count++;
//                    arrFrequency[j] = -1;
//                }
//            }
//            System.out.println("Frequency of " + x + " is = " + count);
//        }