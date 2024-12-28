package sortingProblems;

public class MergeSort {

    // Function to merge two subarrays of arr[]
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        System.out.println(n1);
        int n2 = r - m;

        // Crehate temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
        }

        // Merge the temp arrays

        // Initial indices of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using merge()
    static void sort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    // A utility function to print array of size n
    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Driver method
    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;

        System.out.println("Given Array");
        printArray(arr, n);

        sort(arr, 0, n - 1);

        System.out.println("\nSorted array");
        printArray(arr, n);
    }
}


//
//Sure, let's go through each iteration of the merge sort algorithm step by step, including the state of the array at each stage.
//
//### Initial Array
//`arr = [12, 11, 13, 5, 6, 7]`
//
//### 1. Splitting Phase
//1. **First Call**: `sort(arr, 0, 5)`
//   - Middle: `m = (0 + 5) / 2 = 2`
//   - Split into `sort(arr, 0, 2)` and `sort(arr, 3, 5)`
//
//2. **Second Call**: `sort(arr, 0, 2)`
//   - Middle: `m = (0 + 2) / 2 = 1`
//   - Split into `sort(arr, 0, 1)` and `sort(arr, 2, 2)`
//
//3. **Third Call**: `sort(arr, 0, 1)`
//   - Middle: `m = (0 + 1) / 2 = 0`
//   - Split into `sort(arr, 0, 0)` and `sort(arr, 1, 1)`
//
//4. **Base Cases**:
//   - `sort(arr, 0, 0)` and `sort(arr, 1, 1)` both return immediately because a single element is already sorted.
//   
//5. **Fourth Call**: `sort(arr, 2, 2)` (right half of left half)
//   - Single element `[13]`, returns immediately.
//
//6. **Fifth Call**: `sort(arr, 3, 5)`
//   - Middle: `m = (3 + 5) / 2 = 4`
//   - Split into `sort(arr, 3, 4)` and `sort(arr, 5, 5)`
//
//7. **Sixth Call**: `sort(arr, 3, 4)`
//   - Middle: `m = (3 + 4) / 2 = 3`
//   - Split into `sort(arr, 3, 3)` and `sort(arr, 4, 4)`
//
//8. **Base Cases**:
//   - `sort(arr, 3, 3)` and `sort(arr, 4, 4)` both return immediately because each is a single element.
//   
//9. **Seventh Call**: `sort(arr, 5, 5)`
//   - Single element `[7]`, returns immediately.
//
//### 2. Merging Phase
//1. **First Merge**: `merge(arr, 0, 0, 1)`
//   - Merges `[12]` and `[11]` into `[11, 12]`
//   - State of `arr` after merge: `[11, 12, 13, 5, 6, 7]`
//
//2. **Second Merge**: `merge(arr, 0, 1, 2)`
//   - Merges `[11, 12]` and `[13]` into `[11, 12, 13]`
//   - State of `arr` after merge: `[11, 12, 13, 5, 6, 7]`
//
//3. **Third Merge**: `merge(arr, 3, 3, 4)`
//   - Merges `[5]` and `[6]` into `[5, 6]`
//   - State of `arr` after merge: `[11, 12, 13, 5, 6, 7]`
//
//4. **Fourth Merge**: `merge(arr, 3, 4, 5)`
//   - Merges `[5, 6]` and `[7]` into `[5, 6, 7]`
//   - State of `arr` after merge: `[11, 12, 13, 5, 6, 7]`
//
//5. **Final Merge**: `merge(arr, 0, 2, 5)`
//   - Merges `[11, 12, 13]` and `[5, 6, 7]` into `[5, 6, 7, 11, 12, 13]`
//   - State of `arr` after merge: `[5, 6, 7, 11, 12, 13]`
//
//### Detailed Iterations
//
//1. **Initial Call and Splitting**:
//   - `sort(arr, 0, 5)` splits to `sort(arr, 0, 2)` and `sort(arr, 3, 5)`.
//   - Array: `[12, 11, 13, 5, 6, 7]`
//
//2. **Left Subarray Splitting**:
//   - `sort(arr, 0, 2)` splits to `sort(arr, 0, 1)` and `sort(arr, 2, 2)`.
//   - Array: `[12, 11, 13, 5, 6, 7]`
//
//3. **Further Left Subarray Splitting**:
//   - `sort(arr, 0, 1)` splits to `sort(arr, 0, 0)` and `sort(arr, 1, 1)`.
//   - Array: `[12, 11, 13, 5, 6, 7]`
//
//4. **Base Cases for Further Left Subarray**:
//   - `sort(arr, 0, 0)` and `sort(arr, 1, 1)` both return immediately.
//   - Array: `[12, 11, 13, 5, 6, 7]`
//
//5. **Merge [12] and [11]**:
//   - `merge(arr, 0, 0, 1)`
//   - Array: `[11, 12, 13, 5, 6, 7]`
//
//6. **Merge [11, 12] and [13]**:
//   - `merge(arr, 0, 1, 2)`
//   - Array: `[11, 12, 13, 5, 6, 7]`
//
//7. **Right Subarray Splitting**:
//   - `sort(arr, 3, 5)` splits to `sort(arr, 3, 4)` and `sort(arr, 5, 5)`.
//   - Array: `[11, 12, 13, 5, 6, 7]`
//
//8. **Further Right Subarray Splitting**:
//   - `sort(arr, 3, 4)` splits to `sort(arr, 3, 3)` and `sort(arr, 4, 4)`.
//   - Array: `[11, 12, 13, 5, 6, 7]`
//
//9. **Base Cases for Further Right Subarray**:
//   - `sort(arr, 3, 3)` and `sort(arr, 4, 4)` both return immediately.
//   - Array: `[11, 12, 13, 5, 6, 7]`
//
//10. **Merge [5] and [6]**:
//    - `merge(arr, 3, 3, 4)`
//    - Array: `[11, 12, 13, 5, 6, 7]`
//
//11. **Merge [5, 6] and [7]**:
//    - `merge(arr, 3, 4, 5)`
//    - Array: `[11, 12, 13, 5, 6, 7]`
//
//12. **Final Merge**:
//    - `merge(arr, 0, 2, 5)`
//    - Array: `[5, 6, 7, 11, 12, 13]`
//
//### Summary
//1. **Initial Array**: `[12, 11, 13, 5, 6, 7]`
//2. **Splits**:
//   - `[12, 11, 13]` and `[5, 6, 7]`
//   - `[12, 11]` and `[13]`
//   - `[12]` and `[11]`
//   - `[5, 6]` and `[7]`
//   - `[5]` and `[6]`
//3. **Merges**:
//   - `[12]` and `[11]` to `[11, 12]` → `[11, 12, 13, 5, 6, 7]`
//   - `[11, 12]` and `[13]` to `[11, 12, 13]` → `[11, 12, 13, 5, 6, 7]`
//   - `[5]` and `[6]` to `[5, 6]` → `[11, 12, 13, 5, 6, 7]`
//   - `[5, 6]` and `[7]` to `[5, 6, 7]` → `[11, 12, 13, 5, 6, 7]`
//   - `[11, 12, 13]` and `[5, 6, 7]` to `[5, 6, 7, 11, 12, 13]` → `[5, 6, 7, 11, 12, 13]`
//
//The final sorted array is `[5, 6, 7, 11, 12, 13]`.