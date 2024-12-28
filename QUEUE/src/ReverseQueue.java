import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
public class ReverseQueue {
    public static void main(String args[]){
      Queue<Integer> q1=new LinkedList<>();
      Stack<Integer> s2=new Stack<>();
      q1.add(10);
      q1.add(5);
      q1.add(15);



        System.out.println(q1);
    while(!q1.isEmpty()){
        s2.push(q1.remove());
    }
    while(!s2.isEmpty()){
        q1.add(s2.pop());
    }

System.out.println(q1);
    }
}
//
//import java.util.Queue;
//import java.util.LinkedList;
//
//public class ReverseQueue {
//    public static void main(String[] args) {
//        Queue<Integer> q1 = new LinkedList<>();
//        q1.add(10);
//        q1.add(5);
//        q1.add(15);
//
//        System.out.println("Original Queue: " + q1);
//        reverseQueue(q1);
//        System.out.println("Reversed Queue: " + q1);
//    }
//
//    // Function to reverse the queue recursively
//    public static void reverseQueue(Queue<Integer> q) {
//        if (q.isEmpty()) {
//            return;
//        }
//
//        // Remove the front element
//        int data = q.remove();
//
//        // Recursive call to reverse the remaining queue
//        reverseQueue(q);
//
//        // Add the removed element back to the queue
//        q.add(data);
//    }
//}
