
import java.util.Arrays;
import java.util.Stack;
public class O2_Next_greater_element2 {
    public static void main(String[] args) {
        int arr[]={1,2,1};
        int res[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        for(int i=2*n-1;i>=0;i--){
            int current=arr[n%i];
            while(!st.isEmpty()){
                if(current>=st.peek()){
                    st.pop();
                    res[i%n]=current;
                }
                else{
                    res[i%n]=-1;
                }
            }
            st.push(current);
        }
        System.out.println(Arrays.toString(res));
    }
}
