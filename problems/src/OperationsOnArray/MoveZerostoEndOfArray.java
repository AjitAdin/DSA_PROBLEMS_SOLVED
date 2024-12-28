package OperationsOnArray;

public class MoveZerostoEndOfArray {
	static void MoveZeroToEndOfArray(int arr[],int n){
		int temp[] =new int[n];
		int index=1;
		for(int i=0;i<n;i++) {
		if(arr[i]==0) {
			temp[n-index]=arr[i];
			index++;
			
		}
		else {
			temp[index]=arr[i];
		}
		
	}
		
		for(int i=0;i<n;i++) {
			arr[i]=temp[i];
		}
	}
	
	static void display(int arr[],int n) {
		System.out.println("After moving the zeros:");

		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
	
	
   public static void main(String args[]) {
	   int arr[] = {8,5,0,2,05,5,9,0,7,8,0,23,0,10,0,20};
	   int n=arr.length;
	   
	   System.out.println("Before moving the zeros:");
	   for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	   MoveZeroToEndOfArray(arr,n);
	   display(arr,n);
   }
}
