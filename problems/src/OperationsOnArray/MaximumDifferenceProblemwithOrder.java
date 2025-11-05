package OperationsOnArray;
//Maximum Difference Problem with Order

// LEETCODE  2016
public class MaximumDifferenceProblemwithOrder {
	
	static int LargeNumber(int arr[],int n) {
		 
	      for (int i=0;i<n;i++) {
	    	  boolean flag=true;
	    	  for(int j=0;j<n;j++) {
	    		  if(arr[j]>arr[i]) {
	    			 flag=false;
	    			 break;//break only inner loop;
	    		  }
	    	  }
	    	  if(flag==true) {
	    		  return i;
	    	  }
	      }
	      return -1;
  	 
	}
	
	static void MaxDiff(int arr[],int n) {
		int large=LargeNumber(arr,n);
//			System.out.println(large);
		int temp[]=new int[n];
		for(int i=0;i<=large;i++) {
			temp[i]=arr[large]-arr[i];
		}
	
		int largediff=LargeNumber(temp,large);
		System.out.println(temp[largediff]);
		
	}
   public static void main(String args[]) {
  // 	 int arr[]= {2,3,10,6,4,8,1};
  // 	 int arr[] = {7, 9, 5, 6, 3, 2};
  int arr[] = {1, 2, 90, 10, 110};//109
  	 int n=arr.length;
  	 MaxDiff(arr,n);
   }
}

//Java program to find Maximum difference
//between two elements such that larger
//element appears after the smaller number
//class MaximumDifference
//{
//	/* The function assumes that there are at least two
//	elements in array.
//	The function returns a negative value if the array is
//	sorted in decreasing order.
//	Returns 0 if elements are equal */
//	int maxDiff(int arr[], int arr_size)
//	{
//		int max_diff = arr[1] - arr[0];
//		int i, j;
//		for (i = 0; i < arr_size; i++)
//		{
//			for (j = i + 1; j < arr_size; j++)
//			{
//				if (arr[j] - arr[i] > max_diff)
//					max_diff = arr[j] - arr[i];
//			}
//		}
//		return max_diff;
//	}
//
//	/* Driver program to test above functions */
//	public static void main(String[] args)
//	{
//		MaximumDifference maxdif = new MaximumDifference();
//		int arr[] = {1, 2, 90, 10, 110};
//		System.out.println("Maximum difference is " +
//								maxdif.maxDiff(arr, 5));
//	}
//}

// brute force approach
arr = [10, 1, 20, 5]

print(arr)
max_diff = 0

for i in range(len(arr)):
    diff = 0
    for j in range(i+1, len(arr)):
        if arr[i] < arr[j]:
            diff = arr[j] - arr[i]
            max_diff = max(max_diff, diff)

print(max_diff)



	// optimal approach
	def maximum_difference(nums):
    if len(nums) < 2:
        return -1
    
    min_val = nums[0]
    max_diff = -1  # default if no valid pair exists

    for i in range(1, len(nums)):
        if nums[i] > min_val:  # valid pair
            max_diff = max(max_diff, nums[i] - min_val)
        else:  # update min_val if current is smaller
            min_val = nums[i]

    return max_diff

# Test examples
print(maximum_difference([7,1,5,4]))   # Output: 4
print(maximum_difference([9,4,3,2]))   # Output: -1
print(maximum_difference([1,5,2,10]))  # Output: 9
