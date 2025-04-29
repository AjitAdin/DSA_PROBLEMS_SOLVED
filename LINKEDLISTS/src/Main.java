class Main{

    Node head;

    class Node{
        Node next;

        int data;
        Node(int data){
            this.data=data;
            this.next=next;

        }

    }

    public void addFirst(int data){
        Node temp=new Node(data);
        if(head==null){
            head=temp;
            return;
        }
        temp.next=head;
        head=temp;
    }

    public void print(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }

    public int Search(int ele){
        Node currNode=head;
        int index=-0;
        while(currNode!=null){
            if(currNode.data==ele){
                return index;
            }
            currNode=currNode.next;
            index++;

        }
        return -1;
    }

    public static void main(String args[]){
        int[] arr={1,5,7,3,8,2,3};
        Main list=new Main();
        for(int i=0;i<arr.length;i++){
            list.addFirst(arr[i]);
        }
        list.print();

        int search=7;

        int index=list.Search(search);
        System.out.println("Inedx of "+search+" is "+index);


    }
}