

//^              insert at end as well 
//!              delete the things from 
class Node{
    int data;
    Node next;
    Node(int val){
        this.data=val;
        this.next=null;
    }

}
class LinkedList{
    Node head;
    public void addvalueatend(int value){
        Node newnode=new Node(value);
        
        if(head==null){
            head=newnode;
            // System.out.println("null");
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }

    public void printlb(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        // System.out.println("null");
    }
    public void delete_end(){
        if(head==null){
            System.out.println("empty");
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public void delete_value(int value){
        if(head==null){
            System.out.println("empty list");
        }
        if(head.data==value){
            head=head.next;
            return;
        }
        Node temp=head;
        while(temp.next!=null &&temp.next.data!=value ){
            temp=temp.next;
        }

        if(temp.next==null){
            System.out.println("not found");
        }
        temp.next=temp.next.next;
    }
}

public class O2_delete_from_linkedList {
    public static void main(String[] args) {
        LinkedList lofer=new LinkedList();
        lofer.addvalueatend(45);
        lofer.addvalueatend(46);
        lofer.addvalueatend(89);
        lofer.addvalueatend(90);
        lofer.addvalueatend(123);
        lofer.delete_end();
        lofer.delete_value(45);
        lofer.printlb();
    }
}
