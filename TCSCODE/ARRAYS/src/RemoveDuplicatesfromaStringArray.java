import java.util.*;
class RemoveDuplicatesfromaStringArray {
    public static void main(String[] args) {
        String arr[]={"chiru","ajit","manju","ajit","akash","punith","manju"};
        String temp[]=new String[arr.length];
        System.out.println(Arrays.toString(arr));

        int index=0;
        for(int i=0;i<arr.length;i++){
            int flag=0;

            for(int j=0;j<index;j++){

                if(arr[i].equals(temp[j])){
                    flag=1;
                    break;
                }

            }
            if(flag==0){
                temp[index++]=arr[i];
            }

        }
        System.out.println(Arrays.toString(Arrays.copyOf(temp,index)));

    }
}