package OperationsOnArray;
//Given an array a[] of N integers, the task is to find the length of the longest 
//Alternating Even Odd subarray present in the array.
public class LongestEvenOddSubArray {

	 static void meth(int arr[],int n){
	        int pre=0;
	        int count;
	        
	        
//	         for (int i = 0; i < n - 1; i++) {
//            count = 1; // Start count at 1 for the first element in the subarray
//            for (int j = i; j < n - 1; j++) {
//                if ((arr[j] % 2 == 0 && arr[j + 1] % 2 != 0) || (arr[j] % 2 != 0 && arr[j + 1] % 2 == 0)) {
//                    count++;
//                } else {
//                    break;
//                }
//            }
//            if (pre < count) {
//                pre = count;
//            }
//        }
	        
	        
	        for(int i=0;i<(n-1);i++){
	            count=1;
	            for(int j=i;j<(n-1);j++){
	                if((arr[j]%2)==0){
	                    if((arr[j+1]%2)!=0){
	                        count++;
	                    }
	                    else{
	                        break;
	                    }
	                }
	                else{
	                  if((arr[j]%2)!=0){
	                    if((arr[j+1]%2)==0){
	                        count++;
	                    }
	                    else{
	                        break;
	                    }
	                }   
	                    
	                }
	                
	                
	               
	            }
	            if(pre<count){
	                pre=count;
	            }
	        }
	        System.out.println(pre);
	    }
	    
	    public static void main(String args[]){
	        //int arr[]={10,12,12,14,7,8,6,14,7,8,9};
	        int arr[]={1,2,3,4,5,6,8,9};
	        int n=arr.length;
	        meth(arr,n);
	    }
}


//EFFICIENT ALGORITHM
//class Main{
//    
//    
//    static void meth(int arr[],int n){
//        int pre=0;
//        int count;
//       
//            count = 1;
//            for (int j = 0; j < n - 1; j++) {
//                if ((arr[j] % 2 == 0 && arr[j + 1] % 2 != 0) || (arr[j] % 2 != 0 && arr[j + 1] % 2 == 0)) {
//                    count++;
//                } else {
//                    count=1;
//                }
//                if (pre < count) {
//                pre = count;
//            }
//            }
//            
//        
//        System.out.println(pre);
//    }
//    
//    public static void main(String args[]){
//       // int arr[]={10,12,12,14,7,8,6,14,7,8,9};
//       // int arr[]={1,2,3,4,5,6,8,9};
//       int arr[]={10,12,8,4};
//       int n=arr.length;
//        meth(arr,n);
//    }
//}