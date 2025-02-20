import java.util.Arrays;

class FrequencyOfArrayElements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(arr); // Sorting the array

        int n = arr.length;
        int count = 1; // Start counting from 1

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                count++; // Increase count for duplicates
            } else {
                System.out.println(arr[i - 1] + " : " + count); // Print frequency
                count = 1; // Reset count for new number
            }

            // Handle the last element separately to avoid missing its count
            if (i == n - 1) {
                System.out.println(arr[i] + " : " + count);
            }
        }
    }
}
