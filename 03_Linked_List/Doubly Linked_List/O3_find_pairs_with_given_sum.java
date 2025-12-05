
import java.util.ArrayList;
import java.util.List;


class ListNode {
    int val;
    ListNode next;
    ListNode prev;
    
    ListNode(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}


public class O3_find_pairs_with_given_sum {
    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);
        ListNode d=new ListNode(4);
        ListNode e=new ListNode(5);
        ListNode f=new ListNode(6);
        ListNode g=new ListNode(7);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;

        Solution s=new Solution();
        int target=7;
        List<List<Integer>> finallist=s.findPairsWithGivenSum(a, target);
        System.out.println(finallist);

    }
}


class Solution {
    // public List<List<Integer>> findPairsWithGivenSum(ListNode head, int target) {
    //             // ^  Brute force aprroach broo LL is sorted  take advantage of it 
    //     List<List<Integer>> outerList=new ArrayList<>();
    //     ListNode first=head;
    //     while(first!=null){
    //         ListNode second=first.next;
    //         while(second!=null &&second.next!=null){
    //             int sum=first.val+second.val;
    //             if(sum==target){
    //                 List<Integer> midList=new ArrayList<>();
    //                 midList.add(first.val);
    //                 midList.add(second.val);
    //                 outerList.add(midList);
    //             }
    //             else if(sum>target){
    //                 break;
    //             }
    //             second=second.next;
    //         }
    //         first=first.next;
    //     }
    //     return outerList;
    // }

    //~  optimised code ->

    //->



    
}