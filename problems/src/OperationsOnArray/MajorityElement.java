package OperationsOnArray;
//Find the majority element in the array. A majority element in an array A[] of size n is an element that appears
//more than n/2 times (and hence there is at most one such element). 
public class MajorityElement {
	
	static void Majority(int arr[],int n) {
		int value=-1;
		int precount =0;
		for(int i=0;i<n;i++) {
			
			int count=0;
			for(int j=0;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(precount<count) {
				precount=count;
				value=arr[i];
			}
		}
		
		if(precount>(n/2)) {
			System.out.println("count"+precount+" "+"element"+value);
		}else {
			System.out.println("No majority element");
		}
		
	}
	
public static void main(String args[]) {
	//int arr[]= {3,3,4,2,4,4,2,4};
	int arr[]= {3,3,4,2,4,4,2,4,4};
	int n=arr.length;
	Majority(arr,n);
}
}



// second method using sorting
import java.util.*;

class Majarityele {
    
    // Method to find and print the majority element in the array
    public static void findMajority(int[] nums) {
        Arrays.sort(nums);  // Step 1: Sort the array to group identical elements together
        int half = nums.length / 2;  // Step 2: Calculate the majority threshold (more than half)
        
        int count = 1;      // Initialize count of current number
        int majority = -1;  // Variable to store the majority element (if found)
        
        // Step 3: Loop through the sorted array to count occurrences of each number
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;  // Same as previous, increase count
            } else {
                // If the current number's count exceeds half, we found the majority
                if (count > half) {
                    majority = nums[i - 1];
                    break;  // Exit early since majority found
                }
                count = 1;  // Reset count for new number
            }
        }
        
        // Step 4: After loop ends, check the last group (it may be the majority)
        if (majority == -1 && count > half) {
            majority = nums[nums.length - 1];
        }
        
        // Step 5: Print the result
        if (majority != -1) {
            System.out.println(majority);  // Majority element found
        } else {
            System.out.println("Not found");  // No majority element exists
        }
    }
    
    public static void main(String args[]) {
        // Define test cases
        int[][] testCases = {
            {1, 2, 3, 3, 3, 4, 1, 3, 3},   // Majority is 3
            {1, 1, 1, 2, 2},               // Majority is 1
            {2, 2, 1, 1, 1, 2, 2},         // Majority is 2
            {5, 5, 5, 5, 1, 2, 3},         // Majority is 5
            {1},                           // Majority is 1 (single element)
            {1, 2, 3, 4, 5}                // No majority
        };
        
        // Run each test case through findMajority method
        for (int i = 0; i < testCases.length; i++) {
            System.out.print("Test case " + (i + 1) + ": ");
            findMajority(testCases[i]);  // Call method to find and print the majority
        }
    }
}




// imp it is not done at
public class MajorityElementOptimized {

    static void findMajority(int[] arr) {
        int n = arr.length;

        // Step 1: Find a candidate for majority
        int candidate = arr[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = arr[i];
                    count = 1;
                }
            }
        }

        // Step 2: Verify the candidate
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > n / 2) {
            System.out.println("Majority element is: " + candidate + " with count " + count);
        } else {
            System.out.println("No majority element");
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4}; // Majority is 4
        findMajority(arr);
    }
}


