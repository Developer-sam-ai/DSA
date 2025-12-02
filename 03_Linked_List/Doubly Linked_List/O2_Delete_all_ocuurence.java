class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode() {
        val = 0;
        next = null;
        prev = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        prev = null;
    }

    ListNode(int data1, ListNode next1, ListNode prev1) {
        val = data1;
        next = next1;
        prev = prev1;
    }
}

public class O2_Delete_all_ocuurence{
    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);
        ListNode d=new ListNode(4);

        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;

        Solution s=new Solution();
        s.deleteAllOccurrences(a,1);
    }
}

class Solution {
    public ListNode deleteAllOccurrences(ListNode head, int target) {
        ListNode temp=head;
        if(head.val==target){
            head.next=null;
            head=head.next;
        }
        while(temp.next.next.val!=target ){
            temp=temp.next.next;
            
        }
    }
}