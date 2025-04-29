package LINKEDLIST;

public class SearchData {


    Node head;
    int size=0;

    class Node{
        Node next;

        int data;
        Node(int data){
            this.data=data;
            this.next=null;

        }

    }

    public void addFirst(int data){
        Node temp=new Node(data);
        size++;
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
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }



    public int Search(int ele){
        Node currNode=head;
        int index=0;
        while(currNode!=null){
            if(currNode.data==ele){
                return index;
            }
            currNode=currNode.next;
            index++;

        }
        return -1;
    }

    // public int SearchFromLast(int ele){
    //     int lastindex=size-1;
    //     Node currNode=head;
    //     while(currNode!=null){
    //         if(currNode.data==ele){
    //             return lastindex;
    //         }
    //         currNode=currNode.next;
    //         lastindex--;

    //     }
    //     return -1;

    // }
    public int SearchFromLast(int ele) {
        Node currNode = head;
        int index = 0;
        int foundAt = -1;

        while (currNode != null) {
            if (currNode.data == ele) {
                foundAt = index;  // store last-seen index of the element
            }
            currNode = currNode.next;
            index++;
        }

        if (foundAt == -1) return -1; // element not found

        return size - 1 - foundAt;  // convert to index from the last
    }


    public static void main(String args[]){
        int[] arr={1,5,7,3,8,2,3};
        SearchData list=new SearchData();
        for(int i=0;i<arr.length;i++){
            list.addFirst(arr[i]);
        }
        list.print();

        int search=7;

        int index=list.Search(search);
        System.out.println("Inedx of "+search+" is "+index);
        System.out.println("Search from last index: ");
        int fromlastindex=list.SearchFromLast(search);
        System.out.println("Inedx of "+search+" is "+fromlastindex);


    }
}
