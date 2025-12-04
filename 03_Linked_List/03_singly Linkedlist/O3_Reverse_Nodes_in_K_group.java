class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}



public class O3_Reverse_Nodes_in_K_group {
    public static void main(String[] args) {
        ListNode e=new ListNode(5);
        ListNode d=new ListNode(4,e);
        ListNode c=new ListNode(3,d);
        ListNode b=new ListNode(2,c);
        ListNode a=new ListNode(1,b);


        Solution s=new Solution();
        int k=3;
        ListNode ans=s.reverseKGroup(a, k);
        ListNode temp=ans;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("()");
        }
}

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode length=head;
        int len=0;
        while(length!=null){
            len+=1;
            length=length.next;
        }
        if(len<k) return head;

        ListNode temp=head;
        ListNode prev=null;
        // ListNode test=head;
        int count=0;

        // reverse till the count ok 
        while(temp!=null && count<k ){
            ListNode curr=temp.next;
            temp.next=prev;
            prev=temp;
            temp=curr;
            count++;

        }
        head.next=reverseKGroup(temp, k);

//imp points 
    // 1.we reverse the k groups like if k=2 then 2-2 groups get reversed so we use the recursion of reversedgroup(temp,k)
    //2 logic is correct but we laggedd in where to guide the next thing so as the node 1 comes to the tail but every node is distorted 
    // except head that becomes our new tail which we failed to discover  
    
    return prev;
    }
}