package OperationsOnArray;
//Left rotate the array by D means d times;
import java.util.Scanner;
public class LeftRotateArrayByD {
	 static void Rotate(int arr[],int n) {
		 int temp=arr[0];
		 for(int i=0;i<(n-1);i++) {
			 arr[i]=arr[i+1];
			 
		 }
		 arr[n-1]=temp;
	 }
	 
	 
	 static void RotateByD(int arr[],int D,int n) {
		 for(int i=0;i<D;i++) {
			 Rotate(arr,n);
		 }
	 }
	 static void display(int arr[],int n) {
		 System.out.println("Array after the rotating :");
		 for(int i=0;i<n;i++) {
			 System.out.println(arr[i]);
		 }
	 }
	
     public static void main(String args[]) {
    	 int arr[]= {1,2,3,4,5,};
    	 int n=arr.length;
    	 System.out.println("Array before the rotate:");
    	 for(int i=0;i<n;i++) {
			 System.out.println(arr[i]);
		 }
    	 System.out.println("Enter the D or number elements to be rotated:");
    	 Scanner inp=new Scanner(System.in);
    	 int D=inp.nextInt();
    	 RotateByD(arr,D,n);
    	 display(arr,n);
     }
}


class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // handle k > n

        // Step 1: reverse whole array
        reverse(nums, 0, n - 1);

        // Step 2: reverse first k elements
        reverse(nums, 0, k - 1);

        // Step 3: reverse the rest
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}



//py

from typing import List

class Solution:

    def helper(self, arr):
        last = arr[-1]
        for i in range(len(arr) - 1, 0, -1):
            arr[i] = arr[i - 1]
        arr[0] = last

    def rotate(self, nums: List[int], k: int) -> None:
        n = len(nums)
        k %= n  # handle k > n
        for _ in range(k):
            self.helper(nums)


// effic
	from typing import List

class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        n = len(nums)        # length of the array
        k %= n               # adjust k in case k > n
        nums[:] = nums[-k:] + nums[:-k]


obj=Solution()
nums=[1,2,3,4,5,6,7]
k=3
obj.rotate(nums,k)
print(nums)
