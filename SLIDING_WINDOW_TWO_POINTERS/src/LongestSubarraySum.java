//import java.util.*;
//
//public class LongestSubarraySum {
//
//    public static void main(String[] args) {
//        int targetSum = 14;
//        int[] nums = {9, 5, 1, 7, 10};
//
//        int maxLength = findMaxSubarrayLength(nums, targetSum);
//        System.out.println("Maximum subarray length with sum ≤ " + targetSum + ": " + maxLength);
//    }
//
//    public static int findMaxSubarrayLength(int[] nums, int k) {
//        int maxLength = 0;
//        int left = 0;
//        int sum = 0;
//
//        for (int right = 0; right < nums.length; right++) {
//            sum += nums[right];
//
//            while (sum > k && left <= right) {
//                sum -= nums[left];
//                left++;
//            }
//
//            maxLength = Math.max(maxLength, right - left + 1);
//        }
//
//        return maxLength;
//    }
//}








import java.util.*;

class LongestSubarraySum {

    public static void main(String[] args) {

        int k = 14;
        int[] arr = {9, 5, 1, 7, 10};

        int maxlength = 0;
        int l = 0, r = 0;
        int sum = 0;

        while (r < arr.length) {
            sum += arr[r];

            while (sum > k && l <= r) {
                sum -= arr[l];
                l++;
            }

            maxlength = Math.max(maxlength, r - l + 1);
            r++;
        }

        System.out.println(maxlength);
    }
}


//BRUTE FORCE APPROACH
//import java.util.*;
//
//class Main {
//    public static void main(String[] args) {
//        int[] arr = {2,5,1,7,10};
//        int sum=14; //sum<=14
//        int n = arr.length;
//        int max=Integer.MIN_VALUE;
//        int maxlength=0;
//        for(int i=0;i<n;i++){
//            int currsum=0;
//            int currlength=0;
//            for(int j=i;j<n;j++){
//                currsum+=arr[j];
//                if(currsum<=sum){
//                    max=Math.max(max,currsum);
//                    currlength++;
//                    maxlength=Math.max(maxlength,currlength);
//                }
//            }
//        }
//        System.out.println("length : "+ maxlength+ " SUM: "+ max);
//
//
//
//
//    }
//}