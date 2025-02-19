import java.util.Arrays;

public class TwoSumTarget {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=9;
        int i;

        for(i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(Arrays.toString(new int[] {i,j}));
                }
            }
        }
    }
}


//see this
//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[] {i, j}; // Return the indices of the two numbers
//                }
//            }
//        }
//        return new int[] {}; // Return empty array if no solution found
//    }
//}
