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
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(9);
        ListNode a3 = new ListNode(1);   
        ListNode a4 = new ListNode(2);
        ListNode a5 = new ListNode(4);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;

        ListNode b1 = new ListNode(3);

        b1.next = a4;


        Solution sol = new Solution();
        ListNode ans=sol.getIntersectionNode(a1, b1);
        ListNode temp=ans;
        while(temp!=null){
            System.out.println(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("()");

    }

}

class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null && headB==null) return null;

        ListNode temp1=headA;
        ListNode temp2=headB;

        //*here the linked list are uneven in length so we move from one end of the linkedllist to the another and cover the whole linked list for both pointers */
        while(temp1!=temp2){
            if(temp1==null){
                temp1=headB;
            }
            else{
                temp1=temp1.next;
            }
            if(temp2==null)
                {temp2=headA;}
            else{
                temp2=temp2.next;
            }
            
        }

        return temp1;
    }
}