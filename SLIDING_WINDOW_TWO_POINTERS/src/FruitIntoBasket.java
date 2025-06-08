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

//optimal but wrong for some cases check it
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


//more optimal and correct
//import java.util.HashMap;
//
//class Solution {
//    public int totalFruit(int[] fruits) {
//        int n = fruits.length;
//        int l = 0, maxlength = 0;
//
//        // map to count frequencies of fruit types in the window
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for (int r = 0; r < n; r++) {
//            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);
//
//            // shrink the window until we have only two types
//            while (map.size() > 2) {
//                map.put(fruits[l], map.get(fruits[l]) - 1);
//                if (map.get(fruits[l]) == 0) {
//                    map.remove(fruits[l]);
//                }
//                l++;
//            }
//
//            maxlength = Math.max(maxlength, r - l + 1);
//        }
//
//        return maxlength;
//    }
//}
