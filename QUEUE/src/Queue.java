// Queue implementation using array
public class Queue {
    private int[] arr;      // Array to store queue elements
    private int front;      // Points to front element
    private int rear;       // Points to last element
    private int capacity;   // Maximum capacity of the queue
    private int count;      // Current size of the queue

    // Constructor to initialize queue
    public Queue(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    // Add element to queue (Enqueue)
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot insert " + item);
            return;
        }
        rear = (rear + 1) % capacity; // Circular increment
        arr[rear] = item;
        count++;
        System.out.println("Inserted " + item);
    }

    // Remove element from queue (Dequeue)
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! No element to remove");
            return;
        }
        System.out.println("Removed " + arr[front]);
        front = (front + 1) % capacity; // Circular increment
        count--;
    }

    // Get front element
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty!");
        }
        return arr[front];
    }

    // Return size of queue
    public int size() {
        return count;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return (count == 0);
    }

    // Check if queue is full
    public boolean isFull() {
        return (count == capacity);
    }

    // Display queue elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    // Main method to test the queue
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        q.display();

        q.dequeue();
        q.display();

        System.out.println("Front element: " + q.peek());
        System.out.println("Queue size: " + q.size());

        q.enqueue(50);
        q.enqueue(60);
        q.display();

        q.enqueue(70); // Should show overflow
    }
}



//see this also

// Queue implementation in Java

//public class Queue {
//    int SIZE = 5;
//    int items[] = new int[SIZE];
//    int front, rear;
//
//    Queue() {
//        front = -1;
//        rear = -1;
//    }
//
//    boolean isFull() {
//        if (rear == SIZE - 1) {
//            return true;
//        }
//        return false;
//    }
//
//    boolean isEmpty() {
//        if (front == -1)
//            return true;
//        else
//            return false;
//    }
//
//    void enQueue(int element) {
//        if (isFull()) {
//            System.out.println("Queue is full");
//        } else {
//            if (front == -1)
//                front = 0;
//            rear++;
//            items[rear] = element;
//            System.out.println("Inserted " + element);
//        }
//    }
//
//    int deQueue() {
//        int element;
//        if (isEmpty()) {
//            System.out.println("Queue is empty");
//            return (-1);
//        } else {
//            element = items[front];
//            if (front >= rear) {
//                front = -1;
//                rear = -1;
//            } /* Q has only one element, so we reset the queue after deleting it. */
//            else {
//                front++;
//            }
//            System.out.println("Deleted -> " + element);
//            return (element);
//        }
//    }
//
//    void display() {
//        /* Function to display elements of Queue */
//        int i;
//        if (isEmpty()) {
//            System.out.println("Empty Queue");
//        } else {
//            System.out.println("\nFront index-> " + front);
//            System.out.println("Items -> ");
//            for (i = front; i <= rear; i++)
//                System.out.print(items[i] + "  ");
//
//            System.out.println("\nRear index-> " + rear);
//        }
//    }
//
//    public static void main(String[] args) {
//        Queue q = new Queue();
//
//        // deQueue is not possible on empty queue
//        q.deQueue();
//
//        // enQueue 5 elements
//        q.enQueue(1);
//        q.enQueue(2);
//        q.enQueue(3);
//        q.enQueue(4);
//        q.enQueue(5);
//
//        // 6th element can't be added to because the queue is full
//        q.enQueue(6);
//
//        q.display();
//
//        // deQueue removes element entered first i.e. 1
//        q.deQueue();
//
//        // Now we have just 4 elements
//        q.display();
//
//    }
//}