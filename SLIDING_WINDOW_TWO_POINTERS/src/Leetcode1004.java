public class Leetcode1004  {

    public int longestOnes(int[] nums, int k) {
        int left = 0, right = 0;
        int maxLen = 0;
        int zeroCount = 0;

        while (right < nums.length) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            // Shrink the window if we exceeded k flips
            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            // Update max length of the valid window
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        return maxLen;
    }

    // Main method to test
    public static void main(String[] args) {
        Leetcode1004  sol = new Leetcode1004 ();

        int[] nums1 = {1,1,1,0,0,0,1,1,1,1,0};
        int k1 = 2;
        System.out.println("Test 1 Output: " + sol.longestOnes(nums1, k1)); // Expected: 6

        int[] nums2 = {0,0,1,1,1,0,0};
        int k2 = 0;
        System.out.println("Test 2 Output: " + sol.longestOnes(nums2, k2)); // Expected: 3

        int[] nums3 = {1,1,1,1};
        int k3 = 2;
        System.out.println("Test 3 Output: " + sol.longestOnes(nums3, k3)); // Expected: 4

        int[] nums4 = {0,0,0,0};
        int k4 = 1;
        System.out.println("Test 4 Output: " + sol.longestOnes(nums4, k4)); // Expected: 1
    }
}
