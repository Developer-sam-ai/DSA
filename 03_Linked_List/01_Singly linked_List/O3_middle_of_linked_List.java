public class middle_of_linked_List {
    //! what i submitted in leetcode
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int mid=count/2;
        int co=0;
        ListNode tempi=head;
        while(mid>co){
            tempi=tempi.next;
            co++;
        }
        return tempi;
    }
    //? just want to have the logic as our mistake would be that we dont initialize temp
    
}
