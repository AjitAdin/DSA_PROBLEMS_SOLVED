package LINKEDLIST;

class RemoveDuplicatesAll {
    Node head;



    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void print() {
        Node c = head;
        while (c != null) {
            System.out.print(c.data + "->");
            c = c.next;
        }
        System.out.println("null");
    }

    // Recursive approach to remove all duplicates
    public Node removeAllDuplicate(Node node) {
        if (node == null || node.next == null) return node;

        if (node.data == node.next.data) {
            // Skip all nodes with the same value
            while (node.next != null && node.data == node.next.data) {
                node = node.next;
            }
            return removeAllDuplicate(node.next); // Skip duplicates
        } else {
            node.next = removeAllDuplicate(node.next); // Keep current node
            return node;
        }
    }

    public static void main(String args[]) {
        int[] arr = {7, 7, 6, 5, 4, 3, 3, 2, 1, 1, 0};

        RemoveDuplicatesAll list = new RemoveDuplicatesAll();
        for (int i : arr) {
            list.add(i); // Adds in reverse order
        }

        System.out.println("Before removing duplicates:");
        list.print();

        list.head = list.removeAllDuplicate(list.head); // ✅ FIXED LINE

        System.out.println("After removing duplicates:");
        list.print();
    }
}
