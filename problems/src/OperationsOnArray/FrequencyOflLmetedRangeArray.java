


// public class FrequencyCount {
//     public static int[] countFrequency(int[] arr, int N, int P) {
//         int[] freq = new int[N];  // frequency array for elements 1 to N

//         for (int num : arr) {
//             if (num >= 1 && num <= N && num <= P) {
//                 freq[num - 1]++;
//             }
//         }

//         return freq;
//     }

//     public static void main(String[] args) {
//         int[] arr = {2, 3, 2, 5, 7, 1, 2, 10, 0};
//         int N = 7;
//         int P = 7;

//         int[] frequency = countFrequency(arr, N, P);

//         System.out.println("Frequency of elements from 1 to " + N + ":");
//         for (int i = 0; i < N; i++) {
//             System.out.println((i + 1) + " -> " + frequency[i]);
//         }
//     }
// }

















package OperationsOnArray;
//FREQUENCY OF LIMITED RANGE ARRAY
import java.util.*;

public class FrequencyOflLmetedRangeArray {
	 // Function to count the frequency of all elements from 1 to N in the array.
    public void frequencyCount(int[] arr, int N, int P) {
        int i = 0;
        while (i < N) {
            // If this element is already processed,
            // or out of the range [1, N] or [1, P]
            if (arr[i] <= 0 || arr[i] > N || arr[i] > P) {
                i++;
                continue;
            }

            // Find index corresponding to this element
            // For example, index for 5 is 4
            int elementIndex = arr[i] - 1;

            // If the elementIndex has an element that is not
            // processed yet, then first store that element
            // to arr[i] so that we don't lose anything.
            if (arr[elementIndex] > 0) {
                arr[i] = arr[elementIndex];

                // After storing arr[elementIndex], change it
                // to store initial count of 'arr[i]'
                arr[elementIndex] = -1;
            } else {
                // If this is NOT the first occurrence of arr[i],
                // then decrement its count.
                arr[elementIndex]--;

                // And initialize arr[i] as 0 means the element
                // 'i+1' is not seen so far
                arr[i] = 0;
                i++;
            }
        }
        
        // Adjust the counts to positive values
        for (int j = 0; j < N; j++) {
            if (arr[j] < 0) {
                arr[j] = -arr[j];
            } else {
                arr[j] = 0;
            }
        }
    }

    public static void main(String[] args) {
    	FrequencyOflLmetedRangeArray sol = new FrequencyOflLmetedRangeArray();
        int[] arr = {2,6,4, 3, 1, 3, 5,2};
        int N = 8;
        int P =5;
        sol.frequencyCount(arr, N, P);
        System.out.println(Arrays.toString(arr)); 
    }
}



//You’ve correctly understood the problem. In the case of the input you’ve provided:
//
//Input: N = 2 arr[] = {8,9} P = 9
//
//The output is indeed: 0 0
//
//Explanation:
//
//The number 1 does not appear in the array, so its frequency is 0.
//The number 2 also does not appear in the array, so its frequency is 0.
//Since P is 9, it indicates that the array could include numbers up to 9. However, because we’re only interested in the frequencies of numbers from 1 to N (which is 2 in this case), we ignore the elements 8 and 9 in the array as they are greater than N.
