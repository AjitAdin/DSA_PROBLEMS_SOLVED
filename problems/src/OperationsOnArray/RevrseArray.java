package OperationsOnArray;

public class RevrseArray {
	
	static void  Reverse(int arr[],int n) {
		for(int i=0;i<(n/2);i++) {
			int temp=arr[n-(i+1)];
			arr[n-(i+1)]=arr[i];
			arr[i]=temp;
			
		}
		
		System.out.println("The Array After the reversing:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]);
			System.out.print(",");
			
		}
		  
		
		
	}
	
	
	public static void main(String args[]) {
		   int arr[] = {1,2,3,4,5},n=5;
		   System.out.print("The Array before the reversing:");
		   for(int i=0;i<n;i++) {
				System.out.print(arr[i]);
				System.out.print(",");
				
			}
		   Reverse(arr,n);
		   
	}
	   
}
   
