package OperationsOnArray;

public class searchElement {
           static boolean Search(int arr[],int n,int x) {
        	   for(int i=0;i<n;i++) {
        		   if(arr[i]==x) {
        			   return true;
        		   }
        	   }
        	   return false;
           }
           
           
           public static void main(String args[]) {
        	   int arr[]= {5,3,8,6,7,2,9,41,8,2},x=70;
//        	   arrays arr.length starts the index from 1 and arrays index starts from 0;
        	   if(Search(arr,arr.length,x)) {
        		   System.out.println(x+" is present");
        	   }
        	   else {
        		   System.out.println(x+" is not present");
        	   }
           }
}
