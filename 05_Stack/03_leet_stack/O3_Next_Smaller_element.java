
import java.util.Arrays;
import java.util.Stack;

public class O3_Next_Smaller_element {
    public static void main(String[] args) {
        int arr[]={4,8,5,2,25};
        int res[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();

        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            int current=arr[i];
            while(!st.isEmpty() && st.peek()>=current){
                st.pop();

            }
            if(st.isEmpty()){
                res[i]=-1;
            }
            else{
                res[i]=st.peek();
                
            }
            st.push(current);
        }
        System.out.println(Arrays.toString(res));
    }
}
