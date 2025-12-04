public class O2_Add_two_numbers_diff_LL {
    public static void main(String[] args) {
        // ListNode node5 = new ListNode(30);
        // ListNode node4 = new ListNode(30,node5);
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(4, node3);
        ListNode node1 = new ListNode(2, node2);


        ListNode nod3 = new ListNode(4);
        ListNode nod2 = new ListNode(6,nod3);
        ListNode nod1 = new ListNode(5,nod2);

        Solution s=new Solution();
        ListNode ans=s.addTwoNumbers(node1, nod1);
        printList(ans);
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //~ we use carry and move ahead the carry

        ListNode list1=l1;
        ListNode list2=l2;
        int carry=0;

        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        while(list1!=null || list2!=null){
            int x=(list1!=null)?list1.val:0;
            int y=(list2!=null)?list2.val:0;

            int sum=x+y+carry;
            carry=sum/10;
            int digit=sum %10;
            // we have to just add the digit inside the LL
            curr.next=new ListNode(digit);
            curr=curr.next;
            if(list1!=null) list1=list1.next;
            if(list2!=null) list2=list2.next;
        }
        if(carry>0){
            ListNode carried=new ListNode(carry);
            curr.next=carried;
        }

        return dummy.next;
    }
}

// some imp points 
// 1. we create a dummy and then link current pointer to it
// 2. always add the sum at last to the node to avoid confusion
// 3. alwasy check null pointer exception(!=null) 
// if no value take 0 is handeled like
                     //  if(l1!=null)?l1.val:0;
                      // this is how we should handle it
// carry must me added first and at last if carry>0 then create new node and then add the node at last
