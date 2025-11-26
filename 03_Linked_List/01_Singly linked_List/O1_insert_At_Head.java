
// import java.lang.classfile.components.ClassPrinter;


//     class Node{
//         int data;
//         Node next;
    
//         Node(int data) {
//             this.data=data;
//             this.next=null;
//         }
//     }
//     class LinkedList{
//         Node head;

//         public void InsertHead(int value){
//             Node newnode=new Node(value);
//             newnode.next=head;
//             head=newnode;
//         }
    
//     public void printlist(){
//         Node temp=head;
//         while(temp!=null){
//             System.out.print(temp.data+"->");
//             temp=temp.next;
//         }
//         System.out.println("null");
//     }
// }


// public class O1_insert_At_Head {
//     public static void main(String[] args) {
//         LinkedList list=new LinkedList();

//         list.InsertHead(10);
//         list.InsertHead(20);
//         list.InsertHead(30);

//         list.printlist();
//     }
// }







class Node{
    int value;
    Node next;
    Node(int valu){
        this.value=valu;
        this.next=null;
    }

}
class LinkedList{
    Node head;
        public void insertNode(int value){
            Node newnode=new Node(value);
            newnode.next=head;
            head=newnode;
        }
        public void printList(){
                Node temp=head;
                while(temp!=null){
                    System.out.print(temp.value+"->");
                    temp=temp.next;
                }

        }
}
public class O1_insert_At_Head{
    public static void main(String[] args) {
        LinkedList newlist=new LinkedList();
        newlist.insertNode(45);
        newlist.insertNode(34);
        newlist.insertNode(67);
        newlist.insertNode(89);

        newlist.printList();
    }
}