package Searching;

public class Peak_ele_Mountain {

    // Method to find the index of the peak element in a bitonic array
    public static int findPeak(int[] arr) {
        int l = 0;
        int r = arr.length - 1;

        while (l < r) {
            int mid = (l + r) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // We are on the descending slope, so the peak is at mid or to the left
                r = mid;
            } else {
                // We are on the ascending slope, so the peak is to the right
                l = mid + 1;
            }
        }

        // l == r is the peak index
        return l;
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 4, 5, 8, 10, 9, 7, 5, 3, 1};  // Bitonic array

        int peakIndex = findPeak(arr);
        int peakValue = arr[peakIndex];

        System.out.println("Peak index: " + peakIndex);
        System.out.println("Peak value: " + peakValue);
    }
}
