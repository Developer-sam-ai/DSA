
import java.util.Stack;

public class O2_Remove_K_digit {
    public static void main(String[] args) {
        String num="1432219";
        int target=3;
        Stack<Character> st=new Stack<>();
        StringBuilder res=new StringBuilder();
        int count=0;
        for(int i=0;i<=num.length()-1;i++){
            char c=num.charAt(i);
            while(!st.isEmpty() && c<st.peek() && count<target){
                // remeber kiski condiiton hai ye pop ki condiition hai ki if aane vala element bada hua to mat pop karo agar chota hua to pop kardo
                st.pop();
                count++;
            }
            st.push(c);
        }
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        System.out.println(res.reverse());
    }

    // smaller at first and larger at last 
}
