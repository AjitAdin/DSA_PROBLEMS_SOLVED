import java.util.*;

public class ReverseKElementsInQueue {
    public static void main(String[] args) {
        // Initialize the queue and populate it with elements
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);

        int k = 2; // Number of elements to reverse

        System.out.println("Original Queue: " + queue);

        // Call the function to reverse the first k elements
        reverseFirstKElements(queue, k);

        System.out.println("Modified Queue: " + queue);
    }

    /**
     * Reverses the first k elements of the given queue.
     *
     * @param queue The queue to be modified
     * @param k The number of elements to reverse
     */
    public static void reverseFirstKElements(Queue<Integer> queue, int k) {
        if (queue == null || k <= 0 || k > queue.size()) {
            return; // Invalid input
        }

        Stack<Integer> stack = new Stack<>();

        // Step 1: Remove the first k elements and push them onto the stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }

        // Step 2: Add the elements from the stack back to the queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        // Step 3: Move the remaining elements to the back of the queue
        int remainingSize = queue.size() - k;
        for (int i = 0; i < remainingSize; i++) {
            queue.add(queue.remove());
        }
    }
}
