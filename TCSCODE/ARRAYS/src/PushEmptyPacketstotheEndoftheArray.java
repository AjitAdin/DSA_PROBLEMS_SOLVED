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