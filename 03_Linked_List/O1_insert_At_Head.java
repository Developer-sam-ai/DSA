
    class Node{
        int data;
        Node next;
    
        Node(int data) {
            this.data=data;
            this.next=null;
        }
    }
    class LinkedList{
        Node head;

        public void InsertHead(int value){
            Node newnode=new Node(value);
            newnode.next=head;
            head=newnode;
        }
    
    public void printlist(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}


public class O1_insert_At_Head {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();

        list.InsertHead(10);
        list.InsertHead(20);
        list.InsertHead(30);

        list.printlist();
    }
}
