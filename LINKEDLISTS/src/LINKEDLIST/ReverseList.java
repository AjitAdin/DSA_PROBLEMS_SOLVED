package LINKEDLIST;


class ReverseList {
    Node head; // Head of the list

    // Node class
    class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add a node at the beginning
    public void addFirst(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }

    // Print the linked list
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Reverse the linked list
    public void reverse() {
        Node curr = head;
        Node prev = null;

        while (curr != null) {
            Node next = curr.next; // Save next
            curr.next = prev;      // Reverse link
            prev = curr;           // Move prev forward
            curr = next;           // Move curr forward
        }

        head = prev; // Reset head to new front
    }

    // Main method
    public static void main(String[] args) {
        ReverseList list = new ReverseList();
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(5);
        list.addFirst(274);
        list.addFirst(8);

        System.out.println("Original List:");
        list.print();

        list.reverse();

        System.out.println("Reversed List:");
        list.print();
    }
}
