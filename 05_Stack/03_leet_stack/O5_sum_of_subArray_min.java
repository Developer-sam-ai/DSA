
import java.util.Stack;

public class O5_sum_of_subArray_min {
        
    public long sumSubarrayMins(int[] arr) {
        long MOD = 1_000_000_007;
        Stack<Integer> st=new Stack<>();
        int [] left=new int[arr.length];
        int [] right=new int[arr.length];

        for(int i=0;i<=arr.length-1;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            left[i]=st.isEmpty()?i+1:i-st.peek();
            st.push(i);
        }
        st.clear();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            right[i]=st.isEmpty()?arr.length-1:st.peek()-i;
            st.push(i);
        }

        long totalSum=0;
        for(int i=0;i<arr.length;i++){
            long count=(long) left[i]*right[i];
            long contribution = (count * arr[i]) % MOD;
            totalSum = (totalSum + contribution) % MOD;
        }
        return totalSum;
    }
    public static void main(String[] args) {
        sumSubarrayMins solution = new sumSubarrayMins();
        int[] arr = {3, 1, 2, 4};
        System.out.println(solution.sumSubarrayMins(arr)); // Output: 17
    }
}
