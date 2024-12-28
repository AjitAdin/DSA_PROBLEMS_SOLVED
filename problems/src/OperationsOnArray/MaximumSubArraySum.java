package OperationsOnArray;
//MaximumSubArray Sum
//public class MaximumSubArraySum {
//	static void maximumSubArraySum(int arr[],int n) {
//		int max=Integer.MIN_VALUE;
//		for(int i=0;i<n;i++) {
//			int sum=0;
//			for(int j=i;j<n;j++) {
//				sum+=arr[j];
//				if(sum>max) {//orMath.max(sum,max);
//					max=sum;
//					
//				
//				}
//			}
//			
//		}
//		System.out.println(max);
//	}
//	
//public static void main(String args[]) {
//	//int arr[]= {2,3,-8,7,-1,2,3};
////	int arr[]= {5,8,3};
//	int arr[]= {-6,-1,-8};
//	int n=arr.length;
//	maximumSubArraySum(arr,n);
//}
//}


//Kadane’s Algorithm efficient approach
public class MaximumSubArraySum {
	static void maximumSubArraySum(int arr[],int n) {
		int pre=arr[0];
		int sum=arr[0];
		for(int i=1;i<n;i++) {
		
			int cur=arr[i];
			pre=Math.max(cur, (pre+cur));
			sum=Math.max(sum, pre);
			
			
		}
		System.out.println(sum);
	}
	
public static void main(String args[]) {
	//int arr[]= {2,3,-8,7,-1,2,3};
//	int arr[]= {5,8,3};
	int arr[]= {-3,8,-2,4,-5,6};
	int n=arr.length;
	maximumSubArraySum(arr,n);
}
}
