package OperationsOnArray;
import java.io.*;
import java.lang.*;
import java.util.*;

//Given a sorted array, arr[] consisting of N integers, the task is to find the
//frequencies of each array element.
public class FrequencyInSortedArray {
	// Java program for the above approach
	class GFG {

	    // Function to print the frequency
	    // of each element of the sorted array
	    static void printFreq(int arr[], int N)
	    {

	        // Stores the frequency of an element
	        int freq = 1;

	        // Traverse the array arr[]
	        for (int i = 1; i < N; i++) {
	            // If the current element is equal
	            // to the previous element
	            if (arr[i] == arr[i - 1]) {
	                // Increment the freq by 1
	                freq++;
	            }
	 
	            // Otherwise,
	            else {
	                System.out.println("Frequency of "
	                                   + arr[i - 1]
	                                   + " is: " + freq);
	                // Update freq
	                freq = 1;
	            }
	        }

	        // Print the frequency of the last element
	        System.out.println("Frequency of " + arr[N - 1]
	                           + " is: " + freq);
	    }

	    // Driver Code
	    public static void main(String args[])
	    {
	        // Given Input
	        int arr[]
	            = { 1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 10 };
	        int N = arr.length;

	        // Function Call
	        printFreq(arr, N);
	    }
	}

}



// import java.util.HashMap; // Import the HashMap class

// public class Main {
//     public static void main(String[] args) {
//         // Declare and initialize an array
//         int[] numbers = {0, 1, 1, 2, 2, 3, 4, 6, 6};

//         // Create a HashMap to store frequency of each number
//         HashMap<Integer, Integer> frequencyMap = new HashMap<>();

//         // Loop through each number in the array
//         for (int number : numbers) {
//             // Check if the number already exists in the map
//             // If yes, increment the count by 1
//             // If no, add the number with count 1
//             int count = frequencyMap.getOrDefault(number, 0);
//             frequencyMap.put(number, count + 1);
//         }

//         // Print out the frequencies
//         System.out.println("Frequencies of elements:");
//         for (int key : frequencyMap.keySet()) {
//             int value = frequencyMap.get(key);
//             System.out.println("Frequency of " + key + " is: " + value);
//         }
//     }
// }

