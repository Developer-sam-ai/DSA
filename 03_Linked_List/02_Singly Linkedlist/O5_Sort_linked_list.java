
class ListNode {
    int val;
    ListNode next;

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}

public class O5_Sort_linked_list {
    public static void main (String...args){
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(0);
        ListNode c=new ListNode(2);
        ListNode d=new ListNode(3);
        ListNode e=new ListNode(5);
        ListNode f=new ListNode(1);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        Solution s=new Solution();
        ListNode ans=s.Mergesort_sorting(a);
        ListNode temp=ans;
        while(temp!=null){
            System.out.println(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("()");
    
    }
}

class Solution {
    public ListNode sortList(ListNode head) {

        //*The main thing is that we must take min as a Node as if we do Outer.next then we know the min value
        //* */ but we dont know the node which contains it so always declare min a node  */

        //&   Selection Sort Approach
        ListNode outer=head;
        while(outer!=null){
        ListNode first=outer.next;
        ListNode min=outer;
        while(first!=null){
            if(first.val<min.val){
                min=first;
            }
            first=first.next;
        }
        //^ we have to consider that if we write first.next linked list is broken no next for the prev so we must 
        //~ .next.next
        //swaping min and first;
        int temp=min.val;
        min.val=outer.val;
        outer.val=temp;
        outer=outer.next;
    // dont move nodes just swap the values;
    }
    return head;
    }



    public ListNode Mergesort_sorting(ListNode head){

        if (head == null || head.next == null) return head;
        ListNode temp=head;
        ListNode mid=find_mid(temp);
        ListNode right=mid.next;
        mid.next=null;

        ListNode l1=Mergesort_sorting(head);
        ListNode l2=Mergesort_sorting(right);

        ListNode ans=merging(l1,l2);

        return ans;
    }
    public ListNode find_mid(ListNode head){
        ListNode first=head;
        ListNode second=head.next;

        while(second!=null&& second.next!=null){
            first=first.next;
            second=second.next.next;
        }
        return first;
    }
    public ListNode merging(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;

        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                temp.next=l1;
                l1=l1.next;
            }
            else{
                temp.next=l2;
                l2=l2.next;
            }
            temp=temp.next;
        }
        if(l1!=null)temp.next=l1;
        if(l2!=null)temp.next=l2;
        return dummy.next;
    }
}
