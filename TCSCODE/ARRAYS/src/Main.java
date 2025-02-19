// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
class Main {
    public static void main(String[] args) {
        String arr[]={"chiru","ajit","manju","ajit","akash","punith","manju"};
        String temp[]=new String[arr.length];
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(temp));

        for(int i=0;i<arr.length;i++){

            for(int j=0;j<i;j++){
                if(arr[i].equals(temp[j])){

                    continue;
                }

            }
            temp[i]=arr[i];
        }
        System.out.println(Arrays.toString(temp));

    }
}
