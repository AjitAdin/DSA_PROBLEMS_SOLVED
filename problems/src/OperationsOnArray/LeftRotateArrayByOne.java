package OperationsOnArray;
//rotate the array by counter clock wise ;
public class LeftRotateArrayByOne {
	
	 static void Rotate(int arr[],int n) {
		 int temp=arr[0];
		 for(int i=0;i<(n-1);i++) {
			 arr[i]=arr[i+1];
			 
		 }
		 arr[n-1]=temp;
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
    	 Rotate(arr,n);
    	 display(arr,n);
     }
}


arr = [1, 2, 3, 4, 5]
temp=arr[0]

for i in range(1,len(arr)):
    arr[i-1]=arr[i]
arr[len(arr)-1]=temp

print(arr)

// using slicing 
arr = [1, 2, 3, 4, 5]
arr = arr[1:] + arr[:1]
print(arr)
from collections import deque

arr = deque([1, 2, 3, 4, 5])
arr.rotate(-1)  # rotate left by 1
print(list(arr))
