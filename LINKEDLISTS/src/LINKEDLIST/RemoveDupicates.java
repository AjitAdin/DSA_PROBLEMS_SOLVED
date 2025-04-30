package LINKEDLIST;


import java.util.*;
class RemoveDuplicates {
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






    public void removeduplicate(){

        Node currNode=head;

        while(currNode!=null && currNode.next!=null){
            if(currNode.data==currNode.next.data){
                currNode.next=currNode.next.next;
            }else{
                currNode=currNode.next;
            }
        }
    }
    public static void main(String args[]) {
        int[] arr = {7,7,6,5,4,3,3,2,1,1,0};

        RemoveDuplicates list = new RemoveDuplicates();
        for (int i : arr) {
            list.add(i);
        }
        list.print();
        list.removeduplicate();
        list.print();


    }
}




//import java.util.*;
//
//class Main {
//    Node head;
//
//    class Node {
//        Node next;
//        int data;
//
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    public void add(int data) {
//        Node newNode = new Node(data);
//        if (head == null) {
//            head = newNode;
//            return;
//        }
//        newNode.next = head;
//        head = newNode;
//    }
//
//    public void print() {
//        Node c = head;
//        while (c != null) {
//            System.out.print(c.data + "->");
//            c = c.next;
//        }
//        System.out.println("null");
//    }
//
//    public void removeduplicate() {
//        if (head == null) return;
//
//        // Step 1: Get the length
//        int length = 0;
//        Node temp = head;
//        while (temp != null) {
//            length++;
//            temp = temp.next;
//        }
//
//        // Step 2: Copy data into array
//        int[] arr = new int[length];
//        temp = head;
//        int idx = 0;
//        while (temp != null) {
//            arr[idx++] = temp.data;
//            temp = temp.next;
//        }
//
//        // Step 3: Remove duplicates (consecutive only)
//        int newIndex = 1;
//        for (int i = 1; i < length; i++) {
//            if (arr[i] != arr[i - 1]) {
//                arr[newIndex++] = arr[i];
//            }
//        }
//
//        // Step 4: Overwrite values in the linked list
//        Node current = head;
//        for (int i = 0; i < newIndex; i++) {
//            current.data = arr[i];
//            if (i < newIndex - 1) {
//                current = current.next;
//            }
//        }
//
//        // Step 5: Cut off extra nodes
//        current.next = null;
//    }
//
//    public static void main(String args[]) {
//        int[] arr = {7, 7, 6, 5, 4, 3, 3, 2, 1, 1};
//        Main list = new Main();
//        for (int i : arr) {
//            list.add(i);
//        }
//        list.print();
//        list.removeduplicate();
//        list.print();
//    }
//}
