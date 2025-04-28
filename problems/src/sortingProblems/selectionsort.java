package sortingProblems;

public class selectionsort {

	  static void sort(int arr[],int n){
	        for(int i=0;i<n-1;i++){
	            int min=arr[i];
	            int index=i;
	            for(int j=i;j<n-1;j++){
	                if(arr[j+1]<min){
	                    min=arr[j+1];
	                    index=j+1;
	                }
	                
	            }
	            int temp=arr[i];
	            arr[i]=min;
	            arr[index]=temp;
	            
	            
	            
	        }
	        
	      for(int i=0;i<n;i++){
	          System.out.println(arr[i]);
	      }
	    }
	    
	    
	    public static void main(String[] args){
	        int arr[]={7,4,10,8,3,1};
	        int n=arr.length;
	        sort(arr,n);
	    }
	
}


//method 3 not correct bc it not swaps it just shifts like sliding wondow

// import java.util.*;
// class Sort{
    
//     public static int Min(int start,int[] arr){
//          int min=arr[start];
//         int index=start;
//         for(int i=start;i<arr.length;i++){
//             if(arr[i]<min){
//                 min=arr[i];
//                 index=i;
//             }
//         }
//         return index;
//     }
    
//     public static void main(String args[]){
//         int[] arr={7,4,10,8,3,1};
        
      
//        for(int i=0;i<arr.length;i++){
//            int index=Min(i,arr);
//            int value=arr[index];
          
//            while(index>i){
//                arr[index]=arr[index-1];
//                index--;
//            }
//            arr[i]=value;
//        }
//         System.out.println(Arrays.toString(arr));
       
       
//     }
// }
