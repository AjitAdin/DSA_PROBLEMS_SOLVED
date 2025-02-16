import java.util.Arrays;
import java.util.Scanner;

public class DeletingElement {
    // Function to delete an element from an array
    public static int[] deleteElement(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index! Deletion not possible.");
            return arr;
        }

        // Create a new array with one less size
        int[] newArr = new int[arr.length - 1];

        // Copy elements, skipping the deleted index
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == index) continue; // Skip the element to delete
            newArr[j++] = arr[i];
        }

        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.print("Enter the index to delete: ");
        int index = scanner.nextInt();
        scanner.close();

        arr = deleteElement(arr, index);
        System.out.println("Updated Array: " + Arrays.toString(arr));
    }
}


//method 2
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//import java.util.*;
//class Main {
//    public static void main(String[] args) {
//        int arr[]={10,20,30,40,50};
//        int index=4;
//        int[] temp=new int[arr.length-1];
//        for(int i=0,j=0;i<arr.length;i++){
//            if(i!=index){
//                temp[j++]=arr[i];
//            }
//        }
//
//        System.out.println(Arrays.toString(temp));
//    }
//}


//METHOD 3

//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class DeleteElementArrayList {
//    public static void main(String[] args) {
//        Integer[] arr = {10, 20, 30, 40, 50};
//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
//
//        System.out.println("Original List: " + list);
//        list.remove(2); // Remove element at index 2
//
//        System.out.println("Updated List: " + list);
//    }
//}
