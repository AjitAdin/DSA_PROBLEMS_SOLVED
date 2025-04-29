package LINKEDLIST;

public class LLOperations {
    Node head; // Head of the linked list
    private int size = 0;

    LLOperations() {
        this.size = 0; // Properly initialize size
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++; // Increase size when a new node is created
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

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("EMPTY");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        head = head.next;
        size--;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.next == null) {
            // Only one element
            head = null;
            size--;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            secondLast = secondLast.next;
            lastNode = lastNode.next;
        }
        secondLast.next = null;
        size--;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        LLOperations list = new LLOperations();

        list.addFirst("ajit");
        list.addFirst("manju");
        list.printList();

        list.addFirst("chiru");
        list.printList();

        list.addLast("Lohit");
        list.addLast("Alyster");
        list.addLast("Vijay");
        list.printList();

        System.out.println("Size: " + list.getSize());

        list.deleteFirst();
        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.deleteLast();
        list.printList();

        System.out.println("Size: " + list.getSize());
    }
}

