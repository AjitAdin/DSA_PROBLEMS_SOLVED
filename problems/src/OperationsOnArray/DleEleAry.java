package OperationsOnArray;
import java.util.Scanner;
//Delete the element in Array of the unsorted dynamic Array;
public class DleEleAry {
	static int Delete(int arr[],int n,int ele) {
		int index=-1;//see without the initialization of index ;
		for(int i=0;i<n;i++) {
			if(ele==arr[i]) {
				index=i;
				break;
			}
		}
		if(index==-1) {
			System.out.println("The element to be is not found:");
			return n;
		}
		
		for(int i=index;i<n-1;i++) {
			arr[i]=arr[i+1];
		}
		
		
		return n-1;
	}
	
    public static void main(String args[]) {
    	 Scanner input=new Scanner(System.in);
         System.out.println("Enter the Number of elements in the ARRAY:");
         int n=input.nextInt();
         int arr[] =new int[n];
         System.out.println("Enter the Element of the Array:");
         for(int i=0;i<n;i++) {
        	 arr[i]=input.nextInt();
         }
         System.out.println("Enter the Element to be Deleted:");
         int ele=input.nextInt();
         n=Delete(arr,n,ele);
         System.out.println("Array after the element is deleted:");
         for(int i=0;i<n;i++) {
        	 System.out.print(arr[i] + " ");
         }
         
    }

	
}






///// JAVA Code for Find Second largest see gfg practice
//// element in an array
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
//		first = second = Integer.MIN_VALUE;
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
//		if (second == Integer.MIN_VALUE)
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
//		int arr[] = { 12, 35, 1, 10, 34, 1 };
//		int n = arr.length;
//		print2largest(arr, n);
//	}
//}
