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

//1004. Max Consecutive Ones III
//Medium
//        Topics
//Companies
//        Hint
//Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.