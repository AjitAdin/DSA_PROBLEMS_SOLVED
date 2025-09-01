//package OperationsOnArray;
////Maximum Circular Sum Subarray
//public class MaximumCircularSumSubarray {
//	
//	static void MaximumSum(int arr[],int n) {
//		int res=arr[0];
//		for(int i=0;i<n;i++) {
//			
//			int curMax=arr[i];
//			int curSum=arr[i];
//			
//			for(int j=1;j<n;j++) {
//				int index=(i+j)%n;
//				curSum+=arr[index];
//				curMax=Math.max(curMax, curSum);
//				
//			}
//			res=Math.max(curMax, res);
//		}
//		System.out.println("The maximum sum is :"+res);
//	}
//	
//	
//	
//public static void main(String args[]) {
//	//int arr[]= {10,-3,-4,7,6,5,-4,-1};//23
//	int arr[] = {8, -8, 9, -9, 10, -11, 12};//22
//	int n=arr.length;
//    MaximumSum(arr,n);
//	
//}
//}


//  LEETCODE 918

package OperationsOnArray;
//Maximum Circular Sum Subarray
public class MaximumCircularSumSubarray {
	
	static void MaximumSum(int arr[],int n) {
		
		int sum1=0;
		for(int i=0;i<n;i++) {
			sum1+=arr[i];
		}
		
		int pre=arr[0];
		int sum=arr[0];
		for(int i=0;i<n;i++) {
			int cur=arr[i];
			pre=Math.min(cur,(pre+cur));
			sum=Math.min(pre, sum);
		}
		System.out.println("The maximum sum is :"+(sum1-sum));
	}
	
	
	
public static void main(String args[]) {
	//int arr[]= {10,-3,-4,7,6,5,-4,-1};//23
	int arr[] = {8, -8, 9, -9, 10, -11, 12};//22
	int n=arr.length;
    MaximumSum(arr,n);
	
}
}


arr = [10, -3, -4, 7, 6, 5, -4, -1]

res = arr[0]
for i in range(len(arr)):
    currsum = arr[i]
    currmax = arr[i]
    for j in range(1, len(arr)):
        currsum += arr[(i + j) % len(arr)]
        currmax = max(currmax, currsum)
    res = max(currmax, res)

print(res)







