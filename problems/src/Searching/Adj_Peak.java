package Searching;

class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int mid = (l + r) / 2;

            if (nums[mid] < nums[mid + 1]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        return l;
    }
}

public class Adj_Peak {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 1, 3, 5, 6, 4};
        int[] nums3 = {1, 10, 1, 3, 5, 6, 4};

        int result1 = solution.findPeakElement(nums1);
        int result2 = solution.findPeakElement(nums2);
        int result3 = solution.findPeakElement(nums3);

        System.out.println("Peak index in nums1: " + result1 + " (Value: " + nums1[result1] + ")");
        System.out.println("Peak index in nums2: " + result2 + " (Value: " + nums2[result2] + ")");
        System.out.println("Peak index in nums3: " + result3 + " (Value: " + nums3[result3] + ")");
    }
}
