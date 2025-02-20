import java.util.Arrays;

class MeanMedianOfArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 8, 3, 5, 4, 8, 6, 7};
        int n = arr.length;

        // Sorting the array
        Arrays.sort(arr);

        // Mean calculation (Using double to avoid integer division)
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println("Mean: " + (sum / n));

        // Median calculation
        if (n % 2 == 0) {
            int m = n / 2;
            double median = (arr[m] + arr[m - 1]) / 2.0; // Use floating-point division
            System.out.println("Median: " + median);
        } else {
            System.out.println("Median: " + arr[n / 2]);
        }
    }
}
