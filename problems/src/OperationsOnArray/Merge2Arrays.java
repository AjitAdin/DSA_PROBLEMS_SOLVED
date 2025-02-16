import java.util.*;

public class Merge2Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        // Create a new array with the combined length
        int[] mergedArray = new int[arr1.length + arr2.length];

        // Copy elements from the first array
        for (int i = 0; i < arr1.length; i++) {
            mergedArray[i] = arr1[i];
        }

        // Copy elements from the second array
        for (int i = 0; i < arr2.length; i++) {
            mergedArray[arr1.length + i] = arr2[i];
        }

        // Print merged array
        System.out.println(Arrays.toString(mergedArray));
    }
}


///METHOD 2
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

//import java.util.*;
//class Main {
//    public static void main(String[] args) {
//        int arr1[]={10,20,30,40,50};
//        int arr2[]={60,70,80,90,100};
//
//        int n=arr1.length+arr2.length;
//
//        int[] arr3=new int[n];
//
//        for(int i=0;i<arr1.length;i++){
//            arr3[i]=arr1[i];
//        }
//
//        for(int i=n-arr1.length,j=0;i<n;i++){
//            arr3[i]=arr2[j++];
//        }
//
//        System.out.println(Arrays.toString(arr3));
//    }
//}