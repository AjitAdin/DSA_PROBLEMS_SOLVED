
// LEETCODE 485 WITHOUT FLIPS
public class MaxConseOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int maxLen = 0;
        int l = 0;
        int r = 0;

        while (r < nums.length) {
            if (nums[r] == 1) {
                maxLen = Math.max(maxLen, r - l + 1);
            } else {
                l = r + 1;
            }
            r++;
        }

        return maxLen;
    }

    public static void main(String[] args) {
        MaxConseOnes sol = new MaxConseOnes();

        int[][] testCases = {
                {1, 1, 0, 1, 1, 1},
                {1, 0, 1, 1, 0, 1},
                {0, 0, 0, 0},
                {1, 1, 1, 1},
                {},
                {1}
        };

        for (int i = 0; i < testCases.length; i++) {
            int result = sol.findMaxConsecutiveOnes(testCases[i]);
            System.out.printf("Test %d → Max consecutive 1s: %d%n", i + 1, result);
        }
    }
}


class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {


        int maxlen=0;

        for(int i=0;i<nums.length;i++){

            int currlen=0;
            for(int j=i;j<nums.length;j++){

                if(nums[j]!=1){
                    break;
                }
                currlen++;
            }
            maxlen=Math.max(maxlen,currlen);

        }

        return maxlen;
    }
}

// LEETCODE 1004 WITH FLIPS
//  two pointer and  sliding window  approach   

public class Solution {

    // Brute-force method to find the longest subarray with at most k zero flips
    public int longestOnes(int[] nums, int k) {
        int maxLen = 0;
        int n = nums.length;

       
       int l=0,r=0;
       int flips=0;
       
       while(r<n){
           
           if(nums[r]==0){
               flips++;
           }
        //   System.out.println(flips);
           
           while(flips>k){
               if(nums[l]==0){
                   flips--;
               }
               l++;
           }
           
           maxLen=Math.max(maxLen,r-l+1);
           
           
           r++;
       }

        return maxLen;
    }

    // Main method with test cases
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test Case 1
        int[] arr1 = {1, 1, 1, 0, 0, 1, 1, 1, 0, 1};
        int k1 = 2;
        System.out.println("Test 1 Output: " + sol.longestOnes(arr1, k1)); // Expected: 8

        // Test Case 2
        int[] arr2 = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k2 = 3;
        System.out.println("Test 2 Output: " + sol.longestOnes(arr2, k2)); // Expected: 10

        // Test Case 3
        int[] arr3 = {1, 0, 1, 0, 1, 0, 1};
        int k3 = 1;
        System.out.println("Test 3 Output: " + sol.longestOnes(arr3, k3)); // Expected: 3

        // Test Case 4 - All 1s
        int[] arr4 = {1, 1, 1, 1};
        int k4 = 2;
        System.out.println("Test 4 Output: " + sol.longestOnes(arr4, k4)); // Expected: 4

        // Test Case 5 - All 0s
        int[] arr5 = {0, 0, 0, 0};
        int k5 = 2;
        System.out.println("Test 5 Output: " + sol.longestOnes(arr5, k5)); // Expected: 2

        // Test Case 6 - No flips allowed
        int[] arr6 = {1, 0, 1, 0, 1};
        int k6 = 0;
        System.out.println("Test 6 Output: " + sol.longestOnes(arr6, k6)); // Expected: 1
    }
}

//1004. Max Consecutive Ones III
//Medium
//        Topics
//Companies
//        Hint
//Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
