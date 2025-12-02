
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class O4_delete_middle {
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
        ListNode ans=s.deleteMiddle(a);

        ListNode temp=ans;
        while(temp!=null){
            System.out.println(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("()");
    }
}

class Solution {
    static {
        for(int i = 1; i <= 500; i++)
            deleteMiddle(null);
    }
    public static ListNode deleteMiddle(ListNode head) {
        if(head==null ||head.next==null)return null;
        ListNode first=head;
        ListNode second=head;
        ListNode prev=null;

        while(second!=null&& second.next!=null){
            second=second.next.next;
            prev=first;
            first=first.next;
        }
        prev.next=first.next;
        return head;
    }
}

