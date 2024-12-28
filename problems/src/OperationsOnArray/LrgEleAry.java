package OperationsOnArray;

public class LrgEleAry {
   static  int Largest(int arr[]) {
	      int n=arr.length;
	      for (int i=0;i<n;i++) {
	    	  boolean flag=true;
	    	  for(int j=0;j<n;j++) {
	    		  if(arr[j]>arr[i]) {
	    			 flag=false;
	    			 break;//break only inner loop;
	    		  }
	    	  }
	    	  if(flag==true) {
	    		  return arr[i];
	    	  }
	      }
	      return -1;
    	 
     }
     public static void main(String args[]) {
    	 int arr[] =new int[4];
    	 arr[0]=10; arr[1]=5; arr[2]=20; arr[3]=8;
    	 System.out.println("Largest element is:"+Largest(arr));
     }
}

//efficent algorithm; Time complexity is =
//public static void main(String args[]){
//    int res=0;
//    for(int i=1;i<n;i++){
//        if(arr[i]>arr[res]){
//            res=i;
//        }
//    }
//    return arr[res];
//}
