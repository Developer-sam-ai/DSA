
import java.util.Stack;

public class O3_impement_Queue_using_stack {
    public static void main(String[] args) {
        MyQueue Q=new MyQueue();
        Q.push(3);
        Q.push(5);
        
    }
}

class MyQueue {
    Stack<Integer> st1;
    Stack<Integer> st2;
    public MyQueue() {
        st1=new Stack<>();
        st2=new Stack<>();
    }
    
    public void push(int x) {
        if(st1.isEmpty()){
            st1.add(x);}
        else{
            while(st1.size()>0){
                st2.add(st1.pop());
            }
            st1.add(x);
            while(st2.size()>0){
                st1.add(st2.pop());
            }
        }
    }
    
    public int pop() {
        int pop=st1.pop();
        return pop;
    }
    
    public int peek() {
        int peek=st1.peek();
        return peek;
    }
    
    public boolean empty() {
        return st1.isEmpty();
    }
}

