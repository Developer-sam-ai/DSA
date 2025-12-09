
import java.util.LinkedList;
import java.util.Queue;

public class O2_Implement_Stack_using_Queue {

                        //   USING LINKED LIST
    public static void main(String[] args) {
        MyStack st=new MyStack();
        st.push(3);
        st.push(5);
        for(int val:st.q){
            System.out.println(val+" ");
        }
        st.top();
    }
}

class MyStack {
    Queue<Integer> q;
    public MyStack() {
        q=new LinkedList<>();
    }
    
    // we add and then reverse like 3,4 lagech reverse
    public void push(int x) {
        if(q.isEmpty()){
            q.add(x);
        }
        else{
            int prevsize=q.size();
            q.add(x);
            for(int i=0;i<prevsize;i++){
                int len=q.remove();
                q.add(len);
            }
        }
    }
    
    public int pop() {
        int value=q.remove();
        System.out.println(value);
        return value;
    }
    
    public int top() {
        int top=q.peek();
        System.out.println(top);
        return top;
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}
