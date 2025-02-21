class ThirdMaxNumber {
    public static void main(String[] args) {

        int arr[] = {10, 20, 20, 30, 30};


        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max3=max2;
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2 && arr[i]<max1){
                max3=max2;
                max2=arr[i];
            }
            else if(arr[i]>max3 &&arr[i]!=max1 && arr[i]!=max2){
                max3=arr[i];
            }

        }



        System.out.println(max3);

    }
}


///best methods
//import java.util.*;
//class Main {
//    public static void main(String[] args) {
//        int[] arr = {2, 2, 3, 1};
//        Arrays.sort(arr);
//        int max=Integer.MAX_VALUE;
//        System.out.println(Arrays.toString(arr));
//
//        int n=arr.length;
//        int count =0;
//
//        for(int i=n-1;i>=0;i--){
//
//            if(arr[i]<max){
//
//                max=arr[i];
//                count++;
//            }
//
//            if(count==3){
//                break;
//            }
//        }
//        System.out.println(max);
//
//    }
//}


//lly method'
