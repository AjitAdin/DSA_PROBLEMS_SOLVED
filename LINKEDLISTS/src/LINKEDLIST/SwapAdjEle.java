package LINKEDLIST;

class LinkedLists {
    // Inner Node class scoped only to LinkedLists
    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Add node at end
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

    // Swap every two adjacent nodes
    public void swapPairs() {
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;

        while (prev.next != null && prev.next.next != null) {
            Node first = prev.next;
            Node second = first.next;

            // Swapping
            first.next = second.next;
            second.next = first;
            prev.next = second;

            // Move to the next pair
            prev = first;
        }

        head = dummy.next;
    }

    // Print the list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class SwapAdjEle {
    public static void main(String[] args) {
        LinkedLists list = new LinkedLists();

        int[] elements = {1, 2, 3, 4, 5};
        for (int elem : elements) {
            list.add(elem);
        }

        System.out.print("Original list: ");
        list.printList();

        list.swapPairs();

        System.out.print("After swapping pairs: ");
        list.printList();
    }
}
