class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class O4_Rotate_LL {
    public static void main(String[] args) {
        ListNode e=new ListNode(5);
        ListNode d=new ListNode(4,e);
        ListNode c=new ListNode(3,d);
        ListNode b=new ListNode(2,c);
        ListNode a=new ListNode(1,b);
        Solution s=new Solution();
        int k=2;
        ListNode ans=s.rotateRight(a, k);
        ListNode temp=ans;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("()");
    }
}

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        // first we will find number of rotations to happen by length
        int count=1;
        while(temp!=null &&temp.next!=null){
            count++;
            temp=temp.next;
            if(temp.next==null)break;
        }
        // temp.next=head;
        int length=count;
        k=k%length;
        if(k==0)return head;
        temp.next=head;
        ListNode curr=head;
        for(int i=0;i<length-k-1;i++){
            // tail tal.next=head
            curr=curr.next;
        }
        ListNode newhead=curr.next;
        curr.next=null;
        return newhead;
    }
}
