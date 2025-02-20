import java.util.Arrays;

class MoveZeroesToEnd {
    public static void main(String[] args) {
        int arr[]={0,1,0,3,2};
        int n=arr.length;
        int temp[]=new int[n];
        int index=0;

        for(int i=0;i<n;i++){
            if(arr[i]==0){
                continue;
            }
            temp[index++]=arr[i];
        }


        System.out.println(Arrays.toString(temp));
    }

}

//best method
//import java.util.Arrays;
//
//class Main {
//    public static void main(String[] args) {
//        int arr[] = {0, 1, 0, 3, 2};
//        int n = arr.length;
//        int index = 0; // Position to place non-zero elements
//
//        // Move non-zero elements forward
//        for (int i = 0; i < n; i++) {
//            if (arr[i] != 0) {
//                arr[index++] = arr[i];
//            }
//        }
//
//        // Fill the remaining positions with 0
//        while (index < n) {
//            arr[index++] = 0;
//        }
//
//        System.out.println(Arrays.toString(arr));
//    }
//}
//

