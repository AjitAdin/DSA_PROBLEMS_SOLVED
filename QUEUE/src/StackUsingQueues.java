import java.util.Queue;
import java.util.LinkedList;

public class StackUsingQueues  {

    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    public void push(int item) {
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        q1.add(item);
        while (!q2.isEmpty()) {
            q1.add(q2.remove());
        }
    }

    public void pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty! Cannot pop.");
            return;
        }
        q1.remove();
    }

    public static void main(String[] args) {
        StackUsingQueues  obj = new StackUsingQueues ();
        obj.push(10);
        obj.push(5);
        System.out.println(obj.q1); // Directly print q1 to see stack contents
        obj.push(15);
        System.out.println(obj.q1);
        obj.pop();
        System.out.println(obj.q1);
    }
}



//
//import java.util.LinkedList;
//import java.util.Queue;
//
//class Main {
//    private Queue<Integer> queue;
//
//    // Constructor to initialize the queue
//    public Main() {
//        queue = new LinkedList<>();
//    }
//
//    // Push operation
//    public void push(int x) {
//        int size = queue.size(); // Current size of the queue
//
//        // Enqueue the new element
//        queue.add(x);
////dont take the size here but i want the size before adding the eleme
//        // Rotate the previous elements behind the new one
//        for (int i = 0; i < size; i++) {
//            queue.add(queue.remove());
//        }
//    }
//
//    // Pop operation
//    public int pop() {
//        if (queue.isEmpty()) {
//            throw new IllegalStateException("Stack is empty");
//        }
//        return queue.remove(); // Remove the front element
//    }
//
//    // Peek operation
//    public int peek() {
//        if (queue.isEmpty()) {
//            throw new IllegalStateException("Stack is empty");
//        }
//        return queue.peek(); // Return the front element
//    }
//
//    // Check if the stack is empty
//    public boolean isEmpty() {
//        return queue.isEmpty();
//    }
//
//    public static void main(String[] args) {
//        Main stack = new Main();
//
//        // Push elements into the stack
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        System.out.println(stack.queue);
//
//        // Peek at the top element
//        System.out.println("Top element: " + stack.peek()); // Output: 30
//
//        // Pop elements
//        System.out.println("Popped: " + stack.pop()); // Output: 30
//        System.out.println("Popped: " + stack.pop()); // Output: 20
//        System.out.println(stack.queue);
//        // Check if the stack is empty
//        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false
//    }
//}
