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
