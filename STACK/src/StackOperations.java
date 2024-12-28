class Stack {
    private int[] stack;
    private int top;
    private static final int DEFAULT_SIZE = 3;

    // Constructor to initialize the stack
    public Stack() {
        this(DEFAULT_SIZE);
    }

    public Stack(int size) {
        stack = new int[size];
        top = -1;
    }

    // Push an element onto the stack
    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack Overflow: Unable to push " + item);
            return;
        }
        stack[++top] = item;
        System.out.println("Pushed: |" + stack[top] + "|");
    }

    // Pop an element from the stack
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow: Stack is empty");
            return;
        }
        System.out.println("Popped: |" + stack[top] + "|");
        top--;
    }

    // Peek the top element
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");

        }
        return stack[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == stack.length - 1;
    }
}

public class StackOperations {
    public static void main(String[] args) {
        Stack stack = new Stack(3);
        System.out.println("PUSH Operattion");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4); // Test stack overflow
        System.out.println("POP Operattion");
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop(); // Test stack underflow
    }
}
