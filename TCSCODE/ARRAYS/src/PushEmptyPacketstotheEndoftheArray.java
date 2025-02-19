import java.util.*;
class PushEmptyPacketstotheEndoftheArray {
    public static void main(String[] args) {
        int arr[]={2,0,3,0,5};

        int temp[]=new int[arr.length];
        int index=0;
        System.out.println(Arrays.toString(arr));

        for(int i=0;i<arr.length;i++){

            if(arr[i]==0){
                continue;
            }
            else{
                temp[index++]=arr[i];
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}


//Method 2
//import java.util.*;
//class Main {
//    public static void main(String[] args) {
//        int arr[] = {2, 0, 3, 0, 5};
//        int temp[] = new int[arr.length];
//        int index = 0;
//
//        System.out.println("Original array: " + Arrays.toString(arr));
//
//        // Copy non-zero elements to temp array
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 0) {
//                temp[index++] = arr[i];
//            }
//        }
//
//        // Optional: Fill remaining positions in temp with zeros (this step is not strictly necessary as the array is already initialized with zeros)
//        for (int i = index; i < arr.length; i++) {
//            temp[i] = 0;
//        }
//
//        System.out.println("Array after removing zeros: " + Arrays.toString(temp));
//    }
//}


//IMP METHOD
//import java.util.*;
//class Main {
//    public static void main(String[] args) {
//        int arr[]={2,0,3,0,5};
//        int j=0;
//        for(int i=0;i<arr.length;i++){
//
//
//            if(arr[i]!=0){
//                int t=arr[i];
//                arr[i]=arr[j];
//                arr[j]=t;
//                j++;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//}