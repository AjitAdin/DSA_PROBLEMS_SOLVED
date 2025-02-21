class ThirdMaxNumber {
    public static void main(String[] args) {

        int arr[] = {10, 20, 20, 30, 30};


        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max3=max2;
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2 && arr[i]<max1){
                max3=max2;
                max2=arr[i];
            }
            else if(arr[i]>max3 &&arr[i]!=max1 && arr[i]!=max2){
                max3=arr[i];
            }

        }



        System.out.println(max3);

    }
}


///best methods
//import java.util.*;
//class Main {
//    public static void main(String[] args) {
//        int[] arr = {2, 2, 3, 1};
//        Arrays.sort(arr);
//        int max=Integer.MAX_VALUE;
//        System.out.println(Arrays.toString(arr));
//
//        int n=arr.length;
//        int count =0;
//
//        for(int i=n-1;i>=0;i--){
//
//            if(arr[i]<max){
//
//                max=arr[i];
//                count++;
//            }
//
//            if(count==3){
//                break;
//            }
//        }
//        System.out.println(max);
//
//    }
//}


//lly method'
//import java.util.Arrays;
//
//public class ThirdMaxNumber {
//    public static void main(String[] args) {
//        int[] arr = {2, 2, 3, 1};
//        System.out.println(Arrays.toString(arr));
//        int result = findThirdMax(arr);
//
//        System.out.println("The third maximum number is: " + result);
//    }
//
//    public static int findThirdMax(int[] nums) {
//        Arrays.sort(nums);
//        // System.out.println(Arrays.toString(nums));
//        int uniqueCount = 1;
//        int currentMax = nums[nums.length - 1];
//
//        for (int i = nums.length - 2; i >= 0; i--) {
//            System.out.println(nums[i]);
//            if (nums[i] != currentMax) {
//                uniqueCount++;
//                currentMax = nums[i];
//            }
//            if (uniqueCount == 3) {
//                return currentMax;
//            }
//        }
//
//        // If there are fewer than 3 unique numbers, return the maximum number
//        return nums[nums.length - 1];
//    }
//}
