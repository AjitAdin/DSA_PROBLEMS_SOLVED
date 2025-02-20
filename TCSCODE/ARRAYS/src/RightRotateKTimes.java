import java.util.*;
class RightRotateKTimes {
////WORST METHOD//SEE ALL RIGHT AND LEFT  METHODS
    public static void reverse(int[] arr,int start,int end){
        int n=arr.length;
        for (int i = start; i < end; i++) {
            int temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
            end--;

            // Break the loop when `i` meets or crosses `end`
            if (i >= end) break;
        }


    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int k = 50;
        k = k % arr.length;



         reverse(arr,0,arr.length-1);
         reverse(arr,0,k-1);
         reverse(arr,k,arr.length-1);
        System.out.println(Arrays.toString(arr));


    }
}

////2 BEST METHODS
//import java.util.*;
//
//class RightRotateKTimes {
//
//    // Function to reverse a portion of the array from index 'start' to 'end'
//    public static void reverse(int[] arr, int start, int end) {
//        while (start < end) { // Ensures correct swapping
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//    }
//
//    // Function to rotate an array 'k' times to the right
//    public static void rightRotate(int[] arr, int k) {
//        int n = arr.length;
//        k = k % n; // If k > n, take modulo to optimize rotations
//
//        // Step 1: Reverse the whole array
//        reverse(arr, 0, n - 1);
//
//        // Step 2: Reverse the first k elements
//        reverse(arr, 0, k - 1);
//
//        // Step 3: Reverse the remaining n-k elements
//        reverse(arr, k, n - 1);
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {3, 8, 9, 7, 6};
//        int k = 50; // Number of times to rotate
//
//        System.out.println("Original Array: " + Arrays.toString(arr));
//
//        rightRotate(arr, k); // Perform rotation
//
//        System.out.println("Rotated Array: " + Arrays.toString(arr));
//    }
//}


//brute force

//BUT IT IS LEFT ROTATE SEE ALL RIGHT AND LEFT

//Left rotate the array by D means d times;
//import java.util.*;
//public class LeftRotateArrayByD {
//    static void Rotate(int arr[],int n) {
//        int temp=arr[0];
//        for(int i=0;i<(n-1);i++) {
//            arr[i]=arr[i+1];
//
//        }
//        arr[n-1]=temp;
//    }
//
//
//    static void RotateByD(int arr[],int D,int n) {
//        for(int i=0;i<D;i++) {
//            Rotate(arr,n);
//        }
//    }
//
//
//    public static void main(String args[]) {
//        int arr[]= {1,2,3,4,5,};
//        int n=arr.length;
//        System.out.println("Array before the rotate:");
//        System.out.println(Arrays.toString(arr));
//        System.out.println("Enter the D or number elements to be rotated:");
//        Scanner inp=new Scanner(System.in);
//        int D=inp.nextInt();
//        RotateByD(arr,D,n);
//        System.out.println(Arrays.toString(arr));
//    }
//}
