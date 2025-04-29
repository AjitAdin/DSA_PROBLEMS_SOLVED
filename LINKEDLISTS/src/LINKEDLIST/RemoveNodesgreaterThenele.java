package LINKEDLIST;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    // Add element to the end of the list
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public void remove() {
        // Handle head nodes that need to be removed
        while (head != null && head.data > 25) {
            head = head.next;
        }

        Node currNode = head;
        Node prev = null;

        while (currNode != null) {
            if (currNode.data > 25) {
                // Remove current node
                prev.next = currNode.next;
            } else {
                // Move prev only if current is not deleted
                prev = currNode;
            }
            currNode = currNode.next;
        }
    }



    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println();
    }
}
//main class
public class RemoveNodesgreaterThenele {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add elements
        int[] elements = {545,54,12,50,0,25,6,42,35,177};
        for (int elem : elements) {
            list.add(elem);
        }
        list.printList();

        list.remove();
        list.printList();

    }
}

