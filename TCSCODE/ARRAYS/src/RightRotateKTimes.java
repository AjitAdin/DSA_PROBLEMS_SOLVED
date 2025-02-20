import java.util.*;
class RightRotateKTimes {
////WORST METHOD
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

        reverse(arr, 0, 5);


        // reverse(arr,0,arr.length-1);
        // reverse(arr,0,k-1);
        // reverse(arr,k,arr.length-1);
        System.out.println(Arrays.toString(arr));


    }
}

//2 BEST METHODS
