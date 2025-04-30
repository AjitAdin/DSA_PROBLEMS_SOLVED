package LINKEDLIST;



public class RemoveEleFromNth {

    Node head;

    // Method to add nodes to the end of the list
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Method to print the linked list
    public void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public Node removeNthNode(int n) {
        if (head == null || n <= 0) return head;

        if (n == 1) {
            head = head.next;
            return head;
        }

        int index = 1;
        Node prev = null;
        Node currNode = head;
        while (currNode != null && index < n) {
            prev = currNode;
            currNode = currNode.next;
            index++;
        }
        if (currNode == null) return head;
        prev.next = currNode.next;

        return head;
    }

    public static void main(String[] args) {
        RemoveEleFromNth list = new RemoveEleFromNth();
        int[] arr = {1, 2, 3, 56, 4, 5};

        // Add nodes to the list
        for (int num : arr) {
            list.add(num);
        }

        // Print the original linked list
        System.out.println("Linked list:");
        list.printList();

        // Remove the 4th node
        int nth = 4;
        list.head = list.removeNthNode(nth);

        // Print the updated linked list
        System.out.println("Linked list after removing " + nth + "th node:");
        list.printList();
    }
}
