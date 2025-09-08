Feature	MaximumSumSubArray class	Solution class (maximumSubarraySum)
Problem type	Max sum of subarray of size k	Max sum of subarray of size k with distinct elements
Allows duplicates in subarray?	✅ Yes	❌ No
Uses HashSet?	❌ No	✅ Yes (to track uniqueness)
Related LeetCode problem	Closest to LeetCode #643	✅ LeetCode #2461
Complexity	O(n)	O(n) but with HashSet operations




public class MaximumSumSubArray {

    public static int maxSumSubarray(int[] nums, int k) {
        if (nums == null || nums.length < k) {
            throw new IllegalArgumentException("Invalid input");
        }

        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, 3, 3, 4, 5, -1};
        int k = 4;
        System.out.println("Max sum of subarray of size " + k + ": " + maxSumSubarray(nums, k));
    }
}

// BETTER APPROACH
//public class MaxSubarraySum {
//    public static int maxSumSubarray(int[] nums, int k) {
//        if (nums == null || nums.length < k || k <= 0) {
//            throw new IllegalArgumentException("Invalid input");
//        }
//
//        int maxSum = Integer.MIN_VALUE;  // To store the maximum sum found
//        int windowSum = 0;  // To keep track of the current sum of the window
//        int l = 0;  // Left pointer
//
//        // Iterate through the array using the right pointer
//        for (int r = 0; r < nums.length; r++) {
//            windowSum += nums[r];  // Add the current element to the window sum
//
//            // When the window size reaches k, calculate the sum
//            if (r - l + 1 == k) {
//                // Update the max sum if the current window sum is larger
//                maxSum = Math.max(maxSum, windowSum);
//
//                // Move the left pointer to shrink the window
//                windowSum -= nums[l];
//                l++;  // Shrink the window from the left
//            }
//        }
//
//        return maxSum;
//    }
//
//    public static void main(String[] args) {
//        int[] nums = {-1, 2, 3, 3, 4, 5, -1};
//        int k = 4;
//        System.out.println("Max sum of subarray of size " + k + ": " + maxSumSubarray(nums, k));
//    }
//}




curr_sum = sum(arr[:k])
Max = curr_sum

l, r = 0, k
while r < len(arr):
    curr_sum -= arr[l]      # remove leftmost
    curr_sum += arr[r]      # add new element
    Max = max(Max, curr_sum)
    l += 1
    r += 1




    Max = float('-inf')
curr_sum = 0
l, r = 0, 0

while r < len(arr):
    curr_sum += arr[r]
    if (r - l + 1) == k:
        Max = max(Max, curr_sum)
        curr_sum -= arr[l]  # shrink from left
        l += 1
    r += 1
