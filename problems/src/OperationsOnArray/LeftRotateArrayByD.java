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


//efficient approach;
//import java.util.*;
//import java.io.*;
//import java.lang.*;
//class GFG 
//{ 
//    
//
//    static void leftRotate(int arr[], int d, int n)
//    {
//    	int temp[] = new int[d];
//
//    	for(int i = 0; i  < d; i++)
//    	{
//    		temp[i] = arr[i];
//    	}
//
//    	for(int i = d; i  < n; i++)
//    	{
//    		arr[i - d] = arr[i];
//    	}
//
//    	for(int i = 0; i  < d; i++)
//    	{
//    		arr[n - d + i] = temp[i];
//    	}	
//    }
//
//    public static void main(String args[]) 
//    { 
//       int arr[] = {1, 2, 3, 4, 5}, n = 5, d = 2;
//
//       System.out.println("Before Rotation");
//
//       for(int i = 0; i < n; i++)
//       {
//       		System.out.print(arr[i]+" ");
//       }
//
//       System.out.println();
//
//       leftRotate(arr, d, n);
//
//       System.out.println("After Rotation");
//
//       for(int i = 0; i < n; i++)
//       {
//       		System.out.print(arr[i]+" ");
//       }
//
//    } 
//
//}



//reversal approach;
