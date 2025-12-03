class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
    val = x;
    next = null;
        }
}

public  class O6_Intersection_Linked_list{
    public static void main(String...args){
        ListNode a1 = new ListNode(3);
        ListNode a2 = new ListNode(7);
        ListNode a3 = new ListNode(8);   // intersection start
        ListNode a4 = new ListNode(10);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;

        // ------ List B ------
        ListNode b1 = new ListNode(99);
        ListNode b2 = new ListNode(1);

        b1.next = b2;
        b2.next = a3;   // connecting intersection

        Solution sol = new Solution();
        sol.getIntersectionNode(a1, b1);
    }

}

class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
    }
}