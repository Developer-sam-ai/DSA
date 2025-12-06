
import java.util.Stack;

public class O1_Sort_stack_byrecursion {
    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<>();
        stk.push(2);
        stk.push(3);
        stk.push(1);
        stk.push(4);

        Solution s=new Solution();
        s.sortStack(stk);

    }
}
class Solution {
    public void sortStack(Stack<Integer> st) {
        if(st.isEmpty())return;
        int top=st.pop();
        sortStack(st);

    }
    public void insertsorted(Stack<Integer> st,int value){
        if(st.isEmpty()|| st.peek()<value){
            st.push(value);
            return;
        }
        int top=st.pop();
        insertsorted(st, value);
        st.push(top);
    }
}