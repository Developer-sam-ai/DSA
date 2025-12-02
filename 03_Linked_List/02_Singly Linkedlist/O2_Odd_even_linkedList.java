class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class O2_Odd_even_linkedList {
    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);
        ListNode d=new ListNode(4);
        ListNode e=new ListNode(5);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        Solution s=new Solution();
        ListNode ans=s.OddEvenList(a);

        ListNode temp=ans;
        while(temp!=null){
            System.out.println(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("()");
    }
}

// ~ solved our main problem with GPT that how we can connect the odd to even indices next
class Solution{
        public ListNode OddEvenList(ListNode head){
            if(head==null|| head.next==null) return head;
            ListNode odd=head;
            ListNode Even=head.next;
            ListNode evenhead=Even;
            while(Even!=null && Even.next!=null){
                odd.next=Even.next;
                odd=odd.next;

                Even.next=odd.next;
                Even=Even.next;
            }
            odd.next=evenhead;
            
            return head; 
            //
            // why should we return head instead of odd?
            // ->  lets go by the flow
        }
}
