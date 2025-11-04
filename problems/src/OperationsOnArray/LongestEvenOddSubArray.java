
// 2760. Longest Even Odd Subarray With Threshold
//alternate even or odd


package OperationsOnArray;
//Given an array a[] of N integers, the task is to find the length of the longest 
//Alternating Even Odd subarray present in the array.
public class LongestEvenOddSubArray {

	 static void meth(int arr[],int n){
	        int pre=0;
	        int count;
	        
	        
//	         for (int i = 0; i < n - 1; i++) {
//            count = 1; // Start count at 1 for the first element in the subarray
//            for (int j = i; j < n - 1; j++) {
//                if ((arr[j] % 2 == 0 && arr[j + 1] % 2 != 0) || (arr[j] % 2 != 0 && arr[j + 1] % 2 == 0)) {
//                    count++;
//                } else {
//                    break;
//                }
//            }
//            if (pre < count) {
//                pre = count;
//            }
//        }
	        
	        



//EFFICIENT ALGORITHM
import java.util.*;

public class LongestEvenOddSubArray {

    static void findLongestEvenOddSubarray(int arr[], int n) {
        if (n == 0) {
            System.out.println(0);
            return;
        }

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < n; i++) {
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) || 
                (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 1; // Reset the current length
            }
        }

        System.out.println("Length of longest alternating even-odd subarray: " + maxLength);
    }

    public static void main(String args[]) {
        int arr[] = {10, 12, 12, 14, 7, 8, 6, 14, 7, 8, 9};
        int n = arr.length;
        findLongestEvenOddSubarray(arr, n);
    }
}


// brute force approach
		 arr=[5,10,20,6,3,8]

max_count=0
for i in range(len(arr)):
    count=1
    for j in range(i+1,len(arr)):
        if arr[j]%2==0 and arr[j-1]%2!=0:
            count+=1
        elif arr[j]%2!=0 and arr[j-1]%2==0:
            count+=1
        else:
            break
    max_count=max(max_count,count)
    
print(max_count)



// optimal 
	arr=[5,10,20,6,3,8,10]

max_count=1

count=1
for j in range(1,len(arr)):
    if arr[j]%2==0 and arr[j-1]%2!=0:
            count+=1
    elif arr[j]%2!=0 and arr[j-1]%2==0:
            count+=1
    else:
        count=1
    max_count=max(max_count,count)

    
print(max_count)
		 

	
//also prints array 
arr = [10, 12, 14, 7, 8, 9, 2, 3]



max_count=1

count=1
start,end=0,0
for j in range(1,len(arr)):
    if arr[j]%2==0 and arr[j-1]%2!=0:
            count+=1
    elif arr[j]%2!=0 and arr[j-1]%2==0:
            count+=1
    else:
        count=1
        

    if max_count<count:
        start=j-count+1
        end=j
        max_count=count
    

    
print(max_count)
print(arr[start:end+1])
