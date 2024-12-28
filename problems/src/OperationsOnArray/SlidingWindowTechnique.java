package OperationsOnArray;
//Sliding Window Technique 
//In a realm where numbers hold secrets, a captivating challenge awaits, which is, Sliding Window Technique!!!

//k' conOur Task: Given an array of integers of size 'n'. Our aim is to calculate the maximum sum of 'secutive
//elements in the array.
//public class SlidingWindowTechnique {
//	
//	static void MaximumSumOfKelements(int arr[],int n,int k) {
//		
//		int max=Integer.MIN_VALUE;
//		for(int i=0;i<=(n-k);i++) {
//			int sum=0;
//			for(int j=i;j<=(i+(k-1));j++) {
//				sum+=arr[j];
//				if(max<sum) {
//					max=sum;
//				}
//			}
//		}
//		System.out.println(max);
//	}
//	
//  public static void main(String args[]) {
//	 // int arr[]= {1,4,2,10,23,3,1,0,20};k=4;and ans=39
//	  int arr[] = {100, 200, 300, 400};//k=2 and ans=700
//	  int n=arr.length; 
//	  int k=2;
//	  MaximumSumOfKelements(arr,n,k);
//  }
//}

//efficeint algorithm ;//see GOG

public class SlidingWindowTechnique {
	
	
		static void MaximumSumOfKelements(int arr[],int n,int k) {
			int sum=0;
			for(int i=0;i<k;i++) {
				sum+=arr[i];
				
			}
	
			int window_max=sum;
			for(int i=1;i<n;i++) {
				if(i==((n-k)+1)) {
					break;
				}
				sum=(sum+arr[i+(k-1)])-arr[i-1];
				//window_max=Math.max(sum, window_max)
				if(sum>window_max) {
					window_max=sum;
				}
			}
			System.out.println(window_max);
		}
	
	
  public static void main(String args[]) {
	 // int arr[]= {1,4,2,10,23,3,1,0,20};k=4;and ans=39
	  int arr[] = {100, 200, 300, 400};//k=2 and ans=700
	  int n=arr.length; 
	  int k=2;
	  MaximumSumOfKelements(arr,n,k);
  }
}