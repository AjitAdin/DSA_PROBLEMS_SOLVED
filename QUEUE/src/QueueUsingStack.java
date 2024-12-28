import java.util.Stack;
import java.util.ArrayDeque;
public class QueueUsingStack{
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();

    public void enqueue(int item){

        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(item);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }


    }

    public void dequeue(){
        if(s1.isEmpty()){
            System.out.println("Empty");
            return;
        }
        s1.pop();
    }

    public static void main(String args[]){

        QueueUsingStack obj=new QueueUsingStack();
        obj.enqueue(10);
        obj.enqueue(5);
        System.out.println(obj.s1);
        obj.enqueue(15);
        System.out.println(obj.s1);
        obj.dequeue();
        System.out.println(obj.s1);

    }
}