package LINKEDLIST;

public class LLOperations {
    Node head; // Declare the head of the list in the LLOperations class

    private int size=0;
    LLOperations(){
        this.size=size;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }



    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    public void printList(){
        if(head==null){
            System.out.println("EMPTY");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }

    public void deleteFirst(){

        if(head==null){
            System.out.println("empty");
            return;
        }
        size--;
        head=head.next;

    }
    public void deleteLast(){
        Node currNode=head;
        Node prevNode=head;

        while(currNode.next!=null){
            prevNode=currNode;
            currNode=currNode.next;
        }
        size--;
        prevNode.next=null;
        return;

    }
    public int getsize(){
        return size;
    }

    public static void main(String[] args) {
        LLOperations list = new LLOperations();
        // list.printList();
        list.addFirst("ajit");
        list.addFirst("manju");
        list.printList();
        list.addFirst("chiru");
        list.printList();
        list.addLast("Lohit");
        list.addLast("Alyster");
        list.addLast("Vijay");
        list.printList();
        System.out.println(list.getsize());
        list.deleteFirst();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.deleteLast();
        list.printList();
        System.out.println(list.getsize());


    }
}

