package OperationsOnArray;
//Remove the Duplicate from the Sorted(IMP) Array:
public class removeduplifromSortedArray {
	
	static void Duplicate(int arr[],int n) {
		int res=1;
		int temp[]=new int[n];
		temp[0]=arr[0];
		for(int i=1;i<n;i++) {
			if(temp[res-1]!=arr[i]) {
				temp[res]=arr[i];
				res++;
			}
			
		}
		
		for(int i=0;i<n;i++) {
			arr[i]=temp[i];
		}
		
	}
	
	static void display(int arr[] ,int n) {
		System.out.println("After");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
			
		}
		System.out.println("lenght after duplicating"+arr.length);
	}
   public static void main(String args[]) {
	   int arr[]=   {1,2,2,3,5,5,6,9,9,10};
	   int n=arr.length;
	   System.out.println("Array before the removal of the duplicates :");
	   for(int i=0;i<n;i++) {
		   System.out.println(arr[i]);
	   }
	   
	   Duplicate(arr,n);
	   
	   display(arr,n);
			   }
}


//efficient way;
//import java.util.*;
//import java.io.*;
//import java.lang.*;
//class GFG 
//{ 
//    static int remDups(int arr[], int n)
//    {
//    	int res = 1;
//
//    	for(int i = 1; i < n; i++)
//    	{
//    		if(arr[res - 1] != arr[i])
//    		{
//    			arr[res] = arr[i];
//    			res++;
//    		}
//    	}
//
//    	return res;
//    }
//
//    public static void main(String args[]) 
//    { 
//       int arr[] = {10, 20, 20, 30, 30, 30}, n = 6;
//
//       System.out.println("Before Removal");
//
//       for(int i = 0; i < n; i++)
//       {
//       		System.out.print(arr[i]+" ");
//       }
//
//       System.out.println();
//
//       n = remDups(arr, n);
//
//       System.out.println("After Removal");
//
//       for(int i = 0; i < n; i++)
//       {
//       		System.out.print(arr[i]+" ");
//       }
//
//    } 
//
//}

