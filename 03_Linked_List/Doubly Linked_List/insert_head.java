
class Node{
    int value;
    Node next;
    Node back;

    Node(int val){
        this.value=val;
        this.next=null;
        this.back=null;
    }
}

class DoublyLinkedList{
    Node head;
    public void add_head(int value){
        Node newnode=new Node(value);
        if(head==null){
            head=newnode;
            return;
            // System.out.println(newnode);
        }
        newnode.next=head;
        head.back=newnode;

        // System.out.println(newnode);
        head=newnode;
    }

    public void println(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }

}

public class insert_head {
    public static void main(String[] args) {
        DoublyLinkedList d1=new DoublyLinkedList();
        d1.add_head(45);
        d1.add_head(67);
        d1.add_head(34);
        d1.add_head(23);
        d1.println();
        
    }
}
