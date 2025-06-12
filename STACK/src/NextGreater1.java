

// MONOTONIC STACKS
















//tricks
//without stack

//import java.util.*;
//class Main {
//    public static void main(String[] args) {
//        int[] arr={6,0,8,1,3};
//        int n=arr.length;
//        int[] result = new int[n];
//
//        for(int i=0;i<n;i++){
//            boolean found=false;
//            for(int j=i+1;j<n;j++){
//                if(arr[i]<arr[j]){
//                    result[i]=arr[j];
//                    found=true;
//                    break;
//                }
//            }
//            if(!found){
//                result[i]=-1;
//            }
//        }
//
//        System.out.println(Arrays.toString(result));
//    }
//}
//











//class Solution {
//    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//        HashMap<Integer,Integer> hs= new  HashMap<>();
//        Stack<Integer> stack=new Stack<>();
//
//        int[] ans=new int[nums1.length];
//
//
//        for(int i=0;i<nums2.length;i++){
//            while(!stack.isEmpty() && stack.peek()<nums2[i]){
//                hs.put(stack.pop(),nums2[i]);
//            }
//            stack.push(nums2[i]);
//        }
//
//        for(int j=0;j<nums1.length;j++){
//
//            if(hs.containsKey(nums1[j])){
//                ans[j]=hs.get(nums1[j]);
//            }else{
//                ans[j]=-1;
//            }
//        }
//
//        return ans;
//    }
//}









// class Solution {


//      public static int nextgreater(int ele,int[] nums2){


//         int index=0;

//         for(int i=0;i<nums2.length;i++){
//             if(nums2[i]==ele){
//                 index=i;
//                 break;
//             }
//         }

//         for(int j=index;j<nums2.length;j++){
//             if(nums2[j]>nums2[index]){
//                 return nums2[j];
//             }
//         }

//         return -1;

//      }


//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {


//         int[] ans=new int[nums1.length];

//         for(int i=0;i<nums1.length;i++){
//             int res=nextgreater(nums1[i],nums2);
//             ans[i]=res;
//         }


//         return ans;
//     }
// }