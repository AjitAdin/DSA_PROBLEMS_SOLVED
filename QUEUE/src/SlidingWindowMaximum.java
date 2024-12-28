
//using the array nad the time complexity of this code is O(n*k)
class SlidingWindowMaximum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3; // Window size

        // Validate input
        if (arr == null || arr.length == 0 || k <= 0 || k > arr.length) {
            System.out.println("Invalid input");
            return;
        }

        // Iterate over all possible windows
        for (int i = 0; i <= arr.length - k; i++) {
            int max = arr[i]; // Assume the first element of the window is the maximum

            // Find the maximum in the current window
            for (int j = i + 1; j < i + k; j++) {
                if (arr[j] > max) {
                    max = arr[j]; // Update maximum if a larger element is found
                }
            }

            // Print the maximum of the current window
            System.out.println("Window [" + i + " - " + (i + k - 1) + "]: Max = " + max);
        }
    }
}


//IMPORTANT

//EFFICIENT SOLUTION USING THE DEQUEUE O(N) IS THE TIME COMPLEXITY
//import java.util.*;
//
//class Main {
//    public static List<Integer> findMaxInSlidingWindow(int[] arr, int k) {
//        List<Integer> result = new ArrayList<>();
//        Deque<Integer> deque = new ArrayDeque<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            // Remove indices that are out of the current window
//            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
//                deque.pollFirst();
//            }
//
//            // Remove indices from the back if the element at those indices is smaller
//            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
//                deque.pollLast();
//            }
//
//            // Add the current index
//            deque.offerLast(i);
//
//            // Add the maximum of the current window to the result (after the first k elements)
//            if (i >= k - 1) {
//                result.add(arr[deque.peekFirst()]);
//            }
//        }
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
//        int k = 3;
//        List<Integer> result = findMaxInSlidingWindow(arr, k);
//        System.out.println(result);
//    }
//}

