package sortingProblems;

public class insertionsort {

    static void sort(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
            
            // Shift elements to right until the correct position is found
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            // Place temp at its correct position
            arr[j + 1] = temp;
        }
        
        // Print sorted array
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]) {
        int arr[] = {23, 1, 10, 5, 2};
        int n = arr.length;
        sort(arr, n);
    }
}
