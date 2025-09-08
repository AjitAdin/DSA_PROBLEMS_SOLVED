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





arr = [2, 5, 1, 7, 10]
k = 14

Max_len = 0
l, r = 0, 0
s, e = 0, 0
curr_sum = 0

while r < len(arr):
    curr_sum += arr[r]

    while curr_sum > k and l <= r:
        curr_sum -= arr[l]
        l += 1

    if curr_sum <= k and Max_len < r - l + 1:
        Max_len = r - l + 1
        s, e = l, r + 1   # r+1 because Python slicing is end-exclusive

    r += 1

print("Subarray:", arr[s:e])
print("Maximum Length:", Max_len)
