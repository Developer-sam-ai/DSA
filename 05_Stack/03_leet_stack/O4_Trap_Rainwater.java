
import java.util.Stack;

public class O4_Trap_Rainwater {
    public static void main(String[] args) {
        int arr[]={4,2,0,3,2,5};
        Stack<Integer> st=new Stack<>();
        int result=0;

        for(int i=0;i<=arr.length-1;i++){
            // if any item greater comes pop it from stack
            int leftwall=0;
            int rightwall=0;
            int in=arr[i];
            int mid=0;

            while(!st.isEmpty() && in>arr[st.peek()] ){
                mid=arr[st.pop()];
                if (st.isEmpty()) {
                    break;
                }
                rightwall=in;
                leftwall=arr[st.peek()];

            int height=Math.min(rightwall,leftwall)-mid;
            int width=i-st.peek()-1;

            int water=height*width;
            result+=water;
            
        }
        st.push(i);
    }
    System.out.println(result);
}
}
