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
        ListNode ans=s.deleteAllOccurrences(a,1);
        ListNode temp = ans;
    while (temp != null) {
    System.out.print(temp.val);
    if (temp.next != null) {
        System.out.print(" <-> ");
    }
    temp = temp.next;
}
System.out.println();
    }
}


//^ learnt many things in here like in doubly linked list we have two pointers so use them wisely if we got the number set a pointer next and one before 
//! use all things and then connect them
class Solution {
    public ListNode deleteAllOccurrences(ListNode head, int target) {
        if(head!=null && head.val==target ){
            head=head.next;
            if(head!=null)head.prev=null;
        }
        if(head==null) return null;
        ListNode temp=head;
        while(temp!=null ){
            if(temp.val==target){
                ListNode back=temp.prev;
                ListNode front=temp.next;
                if (back != null) back.next = front;
                if (front != null) front.prev = back;
        }
        temp=temp.next;
    }
        return head;
    }
}
