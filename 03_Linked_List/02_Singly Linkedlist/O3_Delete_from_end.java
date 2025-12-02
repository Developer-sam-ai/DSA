
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class O3_Delete_from_end {
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
        ListNode ans=s.remove_from_end(a,2);

        ListNode temp=ans;
        while(temp!=null){
            System.out.println(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("()");
    }
}

class Solution{
    public ListNode remove_from_end(ListNode head,int k){
            ListNode temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
                
            }
            int length=count;
            int value=length-k;
            int counter=1;
            temp=head;
            while(value>counter){
                counter++;
                temp=temp.next;
            }
            temp.next=temp.next.next;
            return head;
    }
}
