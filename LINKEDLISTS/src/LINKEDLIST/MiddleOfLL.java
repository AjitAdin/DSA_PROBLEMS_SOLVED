package LINKEDLIST;

class MiddleOfLL {
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


    public void middle(){


        int length=1;
        Node temp=head;

        while(temp.next!=null){
            temp=temp.next;
            length++;
        }
        int middle=1;
        if(length%2==0){
            middle=(length/2)+1;
        }
        else{
            middle=(length/2)+1;
        }

        Node midNode=head;
        int index=1;
        while(index<middle){
            midNode=midNode.next;
            index++;
        }

        System.out.println(midNode.data);

    }



    public static void main(String args[]) {
        int[] arr = {5, 1, 3, 9, 0, 2};

        MiddleOfLL list = new MiddleOfLL();
        for (int i : arr) {
            list.add(i);
        }
        list.print();
        list.middle();



    }
}

//fast and slow pointer technique
//public class Solution {
//    public ListNode middleNode(ListNode head) {
//        ListNode slow = head;
//        ListNode fast = head;
//
//        // Move fast two steps and slow one step
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//
//        // When fast reaches the end, slow is at the middle
//        return slow;
//    }
//}
