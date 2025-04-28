import java.util.Arrays;

public class SortCharctersInString{


    public static void sort(String str){
        char[] charcters=str.toCharArray();
        Arrays.sort(charcters);
        for(char c:charcters){
            System.out.println(c);
        }
        //for printing
        //or
        System.out.println(new String(charcters));// Converts the sorted char array back to a String



    }



    //sorting using the bubble sort
    public static void Bubblesort(String str){
        System.out.println("bubble sort");
        char[] charcters=str.toCharArray();
        System.out.println("Befor sorting:"+Arrays.toString(charcters));
        for(int i=0;i<charcters.length;i++){
            for(int j=0;j<charcters.length;j++){
                if(charcters[i]<charcters[j]){
                    char c;
                    c=charcters[i];
                    charcters[i]=charcters[j];
                    charcters[j]=c;

                }
            }
        }

        System.out.println("After sorting:"+Arrays.toString(charcters));

    }

    public static void main(String args[]){
        String str="badc";
        sort(str);
        Bubblesort(str);
    }
}





//build in methods
// import java.util.*;

// class Main {
//     public static void main(String args[]) {
//         String s = "badc";
//         char[] chararr = s.toCharArray();
//         Arrays.sort(chararr);
//         System.out.println(new String(chararr));  // Just print the sorted string
//     }
// }
