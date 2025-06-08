//import java.util.*;
//public class FruitIntoBasket {
//
//
//    public static void main(String args[]){
////        int arr[]={1,2,3,2,2}; //4
////        int arr[]={0,1,2,2};//3
//        int arr[]={3}; //
//        int n=arr.length;
//
//        int maxlength=0;
//
//        for(int i=0;i<n;i++){
//            HashSet<Integer> hs=new HashSet<>();
//            int count=0;
//            for(int j=i;j<n;j++){
//                if(hs.size()==2 && !(hs.contains(arr[j]))){
//                    break;
//                }
//                hs.add(arr[j]);
//                count++;
//            }
//            maxlength=Math.max(maxlength,count);
//        }
//        System.out.println(maxlength);
//
//    }
//}


import java.util.*;
public class FruitIntoBasket {


    public static void main(String args[]){
//        int arr[]={1,2,3,2,2}; //4
//        int arr[]={0,1,2,2};//3
//        int arr[]={3}; //
        int arr[]={3,3,3,1,2,1,1,2,3,3,4};
        int n=arr.length;

        int maxlength=0;
        int l=0;
        HashSet<Integer> hs=new HashSet<>();
         for(int r=0;r<n;r++){

             if(hs.size()==2 && !(hs.contains(arr[r]))){
                 hs.remove(arr[l]);
                 l=r-1;
             }
             hs.add(arr[r]);
             int len=r-l+1;
             maxlength=Math.max(maxlength,len);

         }


        System.out.println(maxlength);

    }
}
