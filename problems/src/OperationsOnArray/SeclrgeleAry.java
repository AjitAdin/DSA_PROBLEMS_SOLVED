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
