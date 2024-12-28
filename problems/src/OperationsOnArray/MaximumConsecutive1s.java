package OperationsOnArray;
//Maximum consecutive ones (number of continues 1's)
//public class MaximumConsecutive1s {
//	 static void Maximumones(int arr[],int n) {
//		 int pre=0;
//		 for(int i=0;i<n;i++) {
//			 int cur=0;
//			 for(int j=i;j<n;j++) {
//				 if(arr[j]==1) {
//					 cur++;
//				 }
//				 else {
//					 break;
//				 }
//			 }
//			 pre=Math.max(cur,pre);
//		 }
//		 System.out.println(pre);
//	 }
//	
//   public static void main(String args[]) {
//	   int arr[]= {0,1,1,0,1,1,1,0};
//	   int n=arr.length;
//	   Maximumones(arr,n);
//   }
//}
//efficient
public class MaximumConsecutive1s {
	
	static void Maximumones(int arr[],int n) {
		 int sum=0;
		  int pre=0;
		  
		
				  
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				sum=0;
			}
			else {
				sum++;
			}
			pre=Math.max(sum,pre);
		}
		 System.out.println(pre);
	}
	 
	
  public static void main(String args[]) {
	   int arr[]= {0,1,1,0,1,1,1,0,1,1,1,1,1};//5
	   int n=arr.length;
	   Maximumones(arr,n);
  }
}
