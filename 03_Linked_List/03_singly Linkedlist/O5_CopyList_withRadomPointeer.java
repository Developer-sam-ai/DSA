
import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}



public class O5_CopyList_withRadomPointeer {
    public static void main(String[] args) {
        Node a = new Node(7);
        Node b = new Node(13);
        Node c = new Node(11);
        Node d = new Node(10);
        Node e = new Node(1);

        // next pointers
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // random pointers
        a.random = null;
        b.random = a;
        c.random = e;
        d.random = c;
        e.random = a;

        Solution s = new Solution();
        Node copy = s.copyRandomList(a);

        System.out.println("Original:");
        print(a);

        System.out.println("\nCopied:");
        print(copy);
    }
static void print(Node head) {
    Node temp = head;

    while (temp != null) {
        System.out.print(
            "[val: " + temp.val +
            " | random: " + (temp.random == null ? "null" : temp.random.val) +
            "] -> "
        );
        temp = temp.next;
    }

    System.out.println("END");
}

    
}


class Solution {
    public Node copyRandomList(Node head) {
        Node dummy=new Node(0);
        Node newhead=dummy;
        HashMap<Node,Node> map=new HashMap<>();
        Node temp=head;
        while(temp!=null ){
            newhead.next=new Node(temp.val);
            map.put(temp, newhead.next);

            newhead=newhead.next;
            temp=temp.next;
        }
        temp=head;
        newhead=dummy.next;
        while(temp!=null){
            if(temp.random!=null){
                newhead.random=map.get(temp.random);
            }
            temp=temp.next;
            newhead=newhead.next;
        }
        return dummy.next;
        //the main problem we are facing is that we are not able to create continious 5-6 nodes and link them 
        
    }
}