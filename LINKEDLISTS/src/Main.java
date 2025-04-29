public class Main {

    Node head;

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    public void addFirst(String data){
        Node newNode=new Node(data);

        if(head==null){
            
        }
    }

    public static void main(String args[]){
        Main list=new Main();
        list.addFirst("ajit");

    }
}