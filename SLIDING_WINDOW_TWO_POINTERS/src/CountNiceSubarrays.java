public class CountNiceSubarrays {
 public static void main(String args[]){
     int arr[]={1,1,2,1,1};
     int k=3;
     int n=arr.length;
     int maxcount=0;
    int s=0;

     for(int i=0 ;i<n ; i++){
         int e=0;
         int odd=0;
         for(int j=i;j<n;j++){
             if(arr[j]%2 !=0){


                 odd++;
             }
             if(odd==k){
                 e=j;
                 maxcount++;
                 


             }
         }
         for(int t=i;t<=e;t++){
             System.out.print(arr[t]+" ");
         }
         System.out.println();

     }
     System.out.println(maxcount);
 }

}