package sortingProblems;

public class mergeSortedArrays {

    static void sort(int a[], int b[], int n1, int n2, int n) {
        int newarr[] = new int[n];
        int i, j, k;

        // Copy all elements of array 'a' to 'newarr'
        for (i = 0; i < n1; i++) {
            newarr[i] = a[i];
        }

        // Insert elements of array 'b' into 'newarr' at the correct position
        for (i = 0; i < n2; i++) {
            int temp = b[i];
            for (j = n1 - 1; (j >= 0 && newarr[j] > temp); j--) {
                newarr[j + 1] = newarr[j];
            }
            System.out.println(j);//test j=-1 or 0
            newarr[j + 1] = temp;
            n1++;  // Increase the count of elements in 'newarr'
        }

        // Print the merged sorted array
        for (i = 0; i < n; i++) {
            System.out.print(newarr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int a[] = {10, 15, 20};
        int b[] = {5, 6, 6, 15};
        int n1 = a.length;
        int n2 = b.length;
        int n = n1 + n2;
        sort(a, b, n1, n2, n);
    }
}




//class mergeSortedArrays {
//    
//    static void sort(int a[], int b[], int n1, int n2, int n) {
//        int newarr[] = new int[n];
//        int i = 0, j = 0, k = 0;
//        
//        // Merge the arrays
//        while (i < n1 && j < n2) {
//            if (a[i] <= b[j]) {
//                newarr[k++] = a[i++];
//            } else {
//                newarr[k++] = b[j++];
//            }
//        }
//        System.out.print("ss::"+j+"\n");
//        // Copy remaining elements of a[], if any
//        while (i < n1) {
//            newarr[k++] = a[i++];
//        }
//        
//        // Copy remaining elements of b[], if any
//        while (j < n2) {
//            newarr[k++] = b[j++];
//        }
//        
//        // Print the merged sorted array
//        for (int x = 0; x < n; x++) {
//            System.out.print(newarr[x] + " ");
//        }
//    }
//    
//    public static void main(String args[]) {
//        int a[] = {10, 15, 20};
//        int b[] = {5, 6, 6,16, 15,25};
//        int n1 = a.length;
//        int n2 = b.length;
//        int n = n1 + n2;
//        sort(a, b, n1, n2, n);
//    }
//}

