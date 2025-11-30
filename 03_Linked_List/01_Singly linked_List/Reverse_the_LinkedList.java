public class Reverse_the_LinkedList {
    public static void main(String...args){
        //~ to reverse the linked list we will do 
    
    //!  Node current=head;
    Node prev=null;
    while(temp!=null){
        Node nexty=current.next;
        current.next=prev;
        prev=current;
        current=nexty;

        //~ return prev;
    }

    }
}
