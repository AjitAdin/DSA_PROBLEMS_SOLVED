package OperationsOnArray;

public class Prefixsum {
	static void PrefixsumOfArray(int arr[],int n) {
		int prefix[]=new int [n];
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
			prefix[i]=sum;
		}
		System.out.println("the new array");
		for(int j=0;j<n;j++) {
			System.out.println(prefix[j]);
		}
		
	}
	
	
	
	
  public static void main(String args[]) {
	  int arr[]= {10,20,10,5,15};
	  int n=arr.length;
	  PrefixsumOfArray(arr,n);
  }
	
}
