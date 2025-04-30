package LINKEDLIST;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class ReverseSublist {

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        // 1. Move prev to the node before 'left'
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // 2. Start reversing from curr
        ListNode curr = prev.next;
        ListNode next;

        // 3. Reverse the sublist between left and right
        for (int i = 0; i < right - left; i++) {
            next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }

        return dummy.next;
    }

    // Helper method to print the list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Helper method to create a list from an array
    public static ListNode createList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        ListNode head = createList(values);

        System.out.println("Original list:");
        printList(head);

        int left = 2;
        int right = 4;
        head = reverseBetween(head, left, right);

        System.out.println("List after reversing from position " + left + " to " + right + ":");
        printList(head);
    }
}
