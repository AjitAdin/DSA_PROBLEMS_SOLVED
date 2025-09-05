package OperationsOnArray;

public class MoveZerostoEndOfArray {
	static void MoveZeroToEndOfArray(int arr[],int n){
		int temp[] =new int[n];
		int index=1;
		for(int i=0;i<n;i++) {
		if(arr[i]==0) {
			temp[n-index]=arr[i];
			index++;
			
		}
		else {
			temp[index]=arr[i];
		}
		
	}
		
		for(int i=0;i<n;i++) {
			arr[i]=temp[i];
		}
	}
	
	static void display(int arr[],int n) {
		System.out.println("After moving the zeros:");

		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
	
	
   public static void main(String args[]) {
	   int arr[] = {8,5,0,2,05,5,9,0,7,8,0,23,0,10,0,20};
	   int n=arr.length;
	   
	   System.out.println("Before moving the zeros:");
	   for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	   MoveZeroToEndOfArray(arr,n);
	   display(arr,n);
   }
}


def move_zeros_end(arr):
    n = len(arr)
    pos = 0  # position to place the next non-zero
    
    # Move non-zeros forward
    for i in range(n):
        if arr[i] != 0:
            arr[pos] = arr[i]
            pos += 1
    
    # Fill the rest with zeros
    while pos < n:
        arr[pos] = 0
        pos += 1
    
    return arr

arr = [0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0]
print(move_zeros_end(arr))



	// TWO POINTER APPROACH 
	from typing import List

class Solution:
    @staticmethod
    def moveZeroes(nums: List[int]) -> None: // not take a self because it is static method
        left = 0
        for right in range(len(nums)):
            if nums[right] != 0:
                nums[left], nums[right] = nums[right], nums[left]
                left += 1

nums = [0, 1, 9, 8, 4, 0, 2]
Solution.moveZeroes(nums)   # call directly on the class
print(nums)   # ✅ [1, 9, 8, 4, 2, 0, 0]

