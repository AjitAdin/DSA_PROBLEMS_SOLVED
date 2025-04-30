package LINKEDLIST;

public class SortLL{
    Node head;
    public void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void print(){

        Node c=head;
        while(c!=null){
            System.out.print(c.data+"->");
            c=c.next;

        }
    }


    public void sort(){


        int length=0;
        Node currNode=head;
        while(currNode!=null){
            currNode=currNode.next;
            length++;
        }
        Node dummy=new Node(0);
        dummy.next=head;
        for(int i=0;i<length-1;i++){
            System.out.println("Pass " + (i + 1));

            Node curr=dummy.next;
            Node Next=curr.next;
            Node prev=dummy;

            while(curr!=null && curr.next!=null){
                System.out.print("Comparing " + curr.data + " and " + Next.data + " -> ");
                if(curr.data<Next.data){
                    System.out.println("No swap");
                    prev=curr;
                    curr=curr.next;
                    Next=Next.next;
                }
                else{
                    System.out.println("Swapping");
                    curr.next=Next.next;
                    Next.next=curr;
                    prev.next=Next;
                    prev=Next;

                    Next=curr.next;
                    print();
                }

            }
        }
        head=dummy.next;
    }


    public static void main(String args[]){
        int[] arr={5,1,3,9,0,2,-565,0,87};

        SortLL list=new SortLL();
        // list.print();
        for(int i:arr){
            list.add(i);
        }
        list.print();
        list.sort();
        System.out.println("");
        list.print();

    }
}

//
//public ListNode sortList(ListNode head) {
//    ArrayList<Integer> al = new ArrayList<>();
//    ListNode ptr = head;
//
//    // Step 1: Extract values to an array
//    while (ptr != null) {
//        al.add(ptr.val);
//        ptr = ptr.next;
//    }
//
//    // Step 2: Sort array
//    Collections.sort(al);
//
//    // Step 3: Rewrite values back into the list
//    ptr = head;
//    for (int i = 0; i < al.size(); i++) {
//        ptr.val = al.get(i);
//        ptr = ptr.next;
//    }
//
//    return head;
//}


class Main {
    Node head;

    class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

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

    public void sort() {
        if (head == null || head.next == null) return;

        int length = 0;
        Node currNode = head;
        while (currNode != null) {
            currNode = currNode.next;
            length++;
        }

        Node dummy = new Node(0);
        dummy.next = head;

        for (int i = 0; i < length - 1; i++) {
            Node prev = dummy;
            Node curr = dummy.next;

            while (curr != null && curr.next != null) {
                Node next = curr.next;

                if (curr.data > next.data) {
                    // Swap nodes
                    curr.next = next.next;
                    next.next = curr;
                    prev.next = next;

                    // Move prev to next (which is now before curr)
                    prev = next;
                } else {
                    // No swap, move pointers forward
                    prev = curr;
                    curr = curr.next;
                }
            }
        }

        head = dummy.next;
    }

    public static void main(String args[]) {
        int[] arr = {5, 1, 3, 9, 0, 2};

        Main list = new Main();
        for (int i : arr) {
            list.add(i);
        }

        System.out.print("Before sorting: ");
        list.print();

        list.sort();

        System.out.print("After sorting: ");
        list.print();
    }
}
