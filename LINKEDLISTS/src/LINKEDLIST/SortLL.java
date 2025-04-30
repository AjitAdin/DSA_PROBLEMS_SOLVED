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