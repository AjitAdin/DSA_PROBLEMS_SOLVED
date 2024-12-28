//Kth Smallest Element

//Given an array and a number k where k is smaller than the size of the array, we need to find the k'th smallest element in the given array. 
//It is given that all array elements are distinct.

package sortingProblems;
import java.util.Arrays;
import java.util.Collections;

public class KthSmallestElement {

	// Function to return k'th smallest
    // element in a given array
    public static int kthSmallest(Integer[] arr,
                                  int k)
    {
        // Sort the given array
        Arrays.sort(arr);

        // Return k'th element in
        // the sorted array
        return arr[k - 1];
    }

    // driver program
    public static void main(String[] args)
    {
        Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 };
        int k = 2;
        System.out.print("K'th smallest element is " + kthSmallest(arr, k));
    }
	
}
