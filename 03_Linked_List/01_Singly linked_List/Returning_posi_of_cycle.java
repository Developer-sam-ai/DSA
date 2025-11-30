public class Returning_posi_of_cycle {
    public static void main(String[] args) {
        ListNode first=head;
        ListNode second=head;
        // here we will set first to head to calculate the number of itterations after the cycle repeats
        //~ we were unaware how to find the cycle but now we got it by two pointter system

        //^ now we have a logic if we have both at same point like first and second so 
        1->2->3   and 3 points 2 then all will be at 3 like first and second ok then if we set fiirst to head 
        then when it will point to 2 so we will move both ahead like first and second will be at 2 so we will return 2 

        first loop will end like second chakkar lagake aajata hai first pe 

        loop goes like
        while(second!=null){
            first=first.next;
            second=second.next.next;
            if(second==first){
                break;
            }
        }
        first=head;
        while(first!=second){
            first=first.next;
            second=second.next;
        }
        return first;
        

    }
}
