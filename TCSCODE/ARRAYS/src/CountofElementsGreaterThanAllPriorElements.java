class CountofElementsGreaterThanAllPriorElements {
    public static void main(String[] args) {
        int arr[] = {7, 4, 8, 2, 9};  // Example input

        int count = 1;  // First element is always counted
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {  // If a new max is found
                max = arr[i];
                count++;  // Increase count
            }
        }

        System.out.println(count);  // Print result
    }
}


//BEST METHOD 2
//public class CountGreaterElements {
//    public static int countGreaterElements(int[] arr) {
//        if (arr.length == 0) {
//            return 0; // Handle empty array case
//        }
//
//        int maxSoFar = Integer.MIN_VALUE; // Initialize with the smallest possible value
//        int count = 0; // Counter for elements greater than all previous ones
//
//        for (int num : arr) {
//            if (num > maxSoFar) {
//                count++;
//                maxSoFar = num; // Update max encountered so far
//            }
//        }
//
//        return count;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {10, 4, 6, 3, 5, 8, 12};
//        System.out.println(countGreaterElements(arr)); // Output: 4
//    }
//}
