package OperationsOnArray;
//Find Subarray with given sum | Set 1 (Non-negative Numbers)
//slidinf window technique//leetcode
public class Subarraywithgivensum {
     static void maximumSubArraySumexit(int arr[],int n,int s) {
    	 for(int i=0;i<n;i++) {
    		 int sum=0;
    		 
    		 for(int j=i;j<n;j++) {
    			 sum+=arr[j];
    			 if(sum==s) {
    				 System.out.println("yes");
    				return;
    			 }
    			 
    			

    		 }
    	 }
    	 System.out.println("No");
    	 
	
	
	}
	
public static void main(String args[]) {
	//int arr[]= {2,3,-8,7,-1,2,3};
//	int arr[]= {5,8,3};
	//int arr[]= {-3,8,-2,4,-5,6};
	//int arr[]= {1,4,20,3,10,5};//33 yes
	//int arr[]= {1,4,0,0,3,10,5};//yes sum=7
	int arr[]= {2,4};//no ans 3
	int n=arr.length;
	int s=3;
	maximumSubArraySumexit(arr,n,s);
}
}
