
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
public class O7_Return_length_LL {
    public static void main(String[] args) {

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);

        // Link them
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b;   // Creating a loop (d → b)

        Solution s = new Solution();
        int length = s.find_length_of_loop(a);

        System.out.println("Length of loop: " + length);

    }
}

class Solution{
    public int find_length_of_loop(ListNode head){
        ListNode first=head;
        ListNode second=head;

        while(second!=null && second.next!=null){
            first=first.next;
            second=second.next.next;

            if(second==first){
                break;
            }
        }
        first=head;
        while(first!=second){
            first=first.next;
            second=second.next;
        }
        second=second.next;
        int count=1;
        while(second!=first){
            second=second.next;
            count++;
        }

        System.out.println(count);
        return count;
    }
}
