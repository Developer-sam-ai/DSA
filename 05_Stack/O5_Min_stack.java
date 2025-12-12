import java.util.Stack;

public class O5_Min_stack {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    minStack.getMin();
    minStack.pop();
    minStack.top();
    }
}

class MinStack {
    Stack<Integer> st;
    public MinStack() {
    st=new Stack<>();
    }
    
    public void push(int val) {
        
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        int top=st.peek();
        System.out.println(top);
        return top;
    }
    
    public int getMin() {
        int min=st.peek();
        System.out.println(min);
        return min;
    }
}