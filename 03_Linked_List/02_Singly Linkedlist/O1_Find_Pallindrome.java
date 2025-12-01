class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class O1_Find_Pallindrome {
    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(2);
        ListNode d=new ListNode(1);

        a.next=b;
        b.next=c;
        c.next=d; 
        Solution s=new Solution();
        boolean value=s.isPalindrome(a);
        if(value)System.out.println("it is pallindrome");
        else System.out.println("no its not a pallindrome");
    }
}

class Solution {
    public boolean isPalindrome(ListNode head) {
        // while(true){
        //     ListNode first=head;
        //     ListNode second=head;
        //     ListNode lastone=null;
        //     while(second!=null){
        //         second=second.next;
        //     }
        //     lastone=second;
        //     if(first.val!=second.val){
        //         System.out.println("not a pallindrome");
        //         return false;
                
        //     }
        //     first=first.next;
        //     second=first.next;
        //     while(second!=lastone){
        //         second=second.next;
        //     }
        //     lastone=second;
            
        // }

        //! so we are implementing the single side traversing check for pallindrome just we do a lot of things 
        
    // ^   1. the main problem is that we cant go backwards right 
    // ^   2. so we divide the list in half and reverse the half part and check it with the remaining half

        ListNode first=head;
        ListNode second=head;
        while(second!=null && second.next!=null){
            first=first.next;
            second=second.next.next;
        }
        // the first will be our mid value
        ListNode normal=head;
        ListNode  reversed=reverse(first);
        
        while(reversed!=null){
            if(normal.val!=reversed.val) return false;
            reversed=reversed.next;
            normal=normal.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode ahead=curr.next;
            curr.next=prev;
            prev=curr;
            curr=ahead;
        }
        return prev;
    }
}