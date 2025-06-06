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

