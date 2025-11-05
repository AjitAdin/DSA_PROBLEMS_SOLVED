package OperationsOnArray;

public class SeclrgeleAry {
         static int Largest(int arr[],int n) {
        	 int res=0;
        	 for(int i=0;i<n;i++) {
        		 if(arr[i]>arr[res]) {
        			 res=i;
        		 }
        	 }
        	 return arr[res];
         }
         static int SecondLargest(int arr[]) {
        	 int n=arr.length;
        	 int largest=Largest(arr,n);
        	 int res=0;
        	 for(int i=0;i<n;i++) {
        		 if(arr[i]!=largest) {
        			 if(arr[i]>arr[res]) {
        				 res=i;
        			 }
        		 }
        	 }
        	 return arr[res];
        	
         }
         
         public static void main(String args[]) {
        	 int arr[]= {0,20,20,20,20};
//      	 int arr[]= {5,20,12,20,0};
        	 
        	 boolean allSame=true;
        	 for(int i=0;i<arr.length;i++) {
        		 if(arr[i]!=arr[0]) {
        			 allSame=false;
        			 break;
        		 }
        		 
        	 }
        	 
        	 if(allSame) {
        		 System.out.println("All are Same:");
        	 }
        	 else {
        		 System.out.println("Second Largest element is:"+SecondLargest(arr));
        	 }
//        	 System.out.println("Second Largest element is:"+SecondLargest(arr));
        	 
        	 
        	
         }
}




//JAVA Code for Find Second largest
//element in an array  and it is the efficiency method (12,7,13,9);
//class GFG {
//
//	/* Function to print the second largest
//	elements */
//	public static void print2largest(int arr[],
//									int arr_size)
//	{
//		int i, first, second;
//
//		/* There should be atleast two elements */
//		if (arr_size < 2) {
//			System.out.print(" Invalid Input ");
//			return;
//		}
//
//		first = second =-1;
//		for (i = 0; i < arr_size; i++) {
//			/* If current element is greater than
//			first then update both first and second */
//			if (arr[i] > first) {
//				second = first;
//				first = arr[i];
//			}
//
//			/* If arr[i] is in between first and
//			second then update second */
//			else if (arr[i] > second && arr[i] != first)
//				second = arr[i];
//		}
//
//		if (second == -1)
//			System.out.print("There is no second largest"
//							+ " element\n");
//		else
//			System.out.print("The second largest element"
//							+ " is " + second);
//	}
//
//	/* Driver program to test above function */
//	public static void main(String[] args)
//	{
//		int arr[] = { 12, 12, 12, 12, 12, 12 };
//		int n = arr.length;
//		print2largest(arr, n);
//	}
//}
//


def second_largest(arr):
    # Check if array has at least 2 elements
    if len(arr) < 2:
        return None  # No second largest element

    # Initialize first and second max
    f_max = sec_max = float('-inf')  # Handles negative numbers too

    for num in arr:
        if num > f_max:
            sec_max = f_max
            f_max = num
        elif num > sec_max and num != f_max:
            sec_max = num

    # If sec_max is still -inf, there is no second largest
    if sec_max == float('-inf'):
        return None
    return sec_max

# Test arrays
test_arrays = [
    [5, 20, 12, 20, 0],
    [0, 20, 20, 20, 20],
    [10, 10, 10, 10],
    [1],
    [-5, -1, -3, -1, -2],
    [7, 7, 5, 6]
]

for arr in test_arrays:
    result = second_largest(arr)
    if result is None:
        print(f"Array: {arr} → No second largest element")
    else:
        print(f"Array: {arr} → Second largest element: {result}")

