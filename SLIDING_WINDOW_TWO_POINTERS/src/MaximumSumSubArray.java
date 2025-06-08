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
