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


//see this.
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


//
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                if nums[i]+nums[j]==target:
                    return [i,j]
def fun(nums, target):
    hash = {}
    for i in range(len(nums)):
        complement = target - nums[i]
        if complement in hash:
            return [hash[complement], i]
        hash[nums[i]] = i
    return []   # return empty list if no solution is found

nums = [2, 7, 11, 15]
target = 22
print(fun(nums, target))   # [1, 3]

target = 100
print(fun(nums, target))   # []




    // o(n)
    def twoSum(nums, target):
    lookup = {}
    for i, num in enumerate(nums):
        complement = target - num
        if complement in lookup:
            return [lookup[complement], i]
        lookup[num] = i

// two pointer approach
        def fun(nums, target):
   
   l,r=0,len(nums)-1
   
   while(l<r):
       total=nums[l]+nums[r]
       if total==target:
           return [l,r]
       elif(total<target):
           l+=1
       else:
           r-=1
   return []   
            
    
    

nums = [2,5,6,8,11]
target = 146
print(fun(nums, target))  # Output: (1, 3)

