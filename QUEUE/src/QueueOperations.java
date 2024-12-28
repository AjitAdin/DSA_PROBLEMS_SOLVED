public class QueueOperations{

    int[] Queue=new int[5];
    int front=-1,rear=-1;

    public void enqueue(int item){
        if(front==-1){
            front=0;
        }
        if(rear==Queue.length-1){

            System.out.println("Full");
            return;
        }
        else{
            Queue[++rear]=item;
            System.out.println("Added->"+item);
        }
    }
    public void dequeue(){
        if(front==-1||front>rear){

            System.out.println("Queue is empty");
            return;
        }
        else{
            System.out.println("Deleted ->"+Queue[front]);
            front++;
        }
    }
    public void display(){
        if(front==-1||front>rear){
            System.out.println("Queue is empty");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.print(Queue[i]+"->");
        }
        System.out.println();
    }


    public static void main(String args[]){
        QueueOperations obj=new QueueOperations();
        obj.display();
        obj.enqueue(5);
        obj.enqueue(3);
        obj.enqueue(7);
        obj.display();
        obj.dequeue();
        obj.display();
        obj.enqueue(9);
        obj.enqueue(6);
        obj.enqueue(1);
        obj.display();
        obj.dequeue();
        obj.display();

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