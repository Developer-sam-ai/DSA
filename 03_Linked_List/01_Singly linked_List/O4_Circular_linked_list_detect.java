public class Circular_linked_list_detect {
    public static void main(String[] args) {
        Node first=head;
        Node second=head;
        if(head!=null && head.next!=null) return false;

        while(second!=null && second.next!=null){
            first=first.next;
            second=second.next.next;
            if(first==second){
                return true;
            }
        }
        return false;
    } 
}
