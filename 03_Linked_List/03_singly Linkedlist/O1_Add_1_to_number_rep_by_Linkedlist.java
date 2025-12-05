
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

public class O1_Add_1_to_number_rep_by_Linkedlist {
        public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(9);
        ListNode c=new ListNode(9);
        ListNode d=new ListNode(9);

        a.next=b;
        b.next=c;
        c.next=d;

        Solution s=new Solution();
        ListNode ans=s.addOne(a);
        ListNode temp=ans;
        while(temp!=null){
            System.out.println(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("()");
        }
}

class Solution {
    public ListNode addOne(ListNode head) {
        // ! i think there are 3 cases in here to deal with 
        // 1. Normal
        // 2. any on2 9 
        // 3. all 9

        // first we reverse the LL
        ListNode temp=head;
        ListNode reversedLL=reverseLinkedlist(temp);
        reversedLL.val+=1;
        int carry=reversedLL.val/10;
        reversedLL.val=reversedLL.val%10;

        ListNode tempe=reversedLL.next;
        while(tempe!=null && carry>0){
            tempe.val+=carry;
                carry=tempe.val/10;
                tempe.val=tempe.val%10;

            tempe=tempe.next;
        }
        if (carry > 0) {
            ListNode newNode = new ListNode(0);
            // go to last node of reversed list
            ListNode last = reversedLL;
            while (last.next != null) last = last.next;
            last.next = newNode;
        }
        return reverseLinkedlist(reversedLL);
    }
    public ListNode reverseLinkedlist(ListNode head){
        ListNode temp=head;
        ListNode prev=null;

        while(temp!=null){
            ListNode curr=temp.next;
            temp.next=prev;
            prev=temp;
            temp=curr;
        }
        return prev;
    }
}

// ~carry=temp.val/10;
// ~tempe.val=temp.val%10;

// these are the two main steps of this problem 

// we revese it then add 1 and sav the carry like vl/10 and inside the val the reminader (i.e=0) 
// but just in critical cases our code not fail we do it 
