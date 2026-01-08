
import java.util.Stack;

public class O5_sum_of_subArray_min {
        
    public long sumSubarrayMins(int[] arr) {
        long MOD = 1_000_000_007;
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        long totalSum = 0;
        
        for(int i=0;i<=n-1;i++){
            int currentVal = (i == arr.length) ? Integer.MIN_VALUE : arr[i];
            int current=arr[i];
            while(!st.isEmpty() && arr[st.peek()]>current){
                int midindex=st.pop();
                int midvalue=arr[midindex];

                int rightboundary=i;
                int leftboundary=st.peek();

                //  math
                long leftdis=midindex-leftboundary;
                long rightdis=rightboundary-midindex;

                long count=leftdis*rightdis;
                long contribution=(count*midvalue)%MOD;
                totalSum = (totalSum + contribution) % MOD;
            }
            st.push(i);
        }
        return totalSum;
        
    }
    public static void main(String[] args) {
        O5_sum_of_subArray_min solution = new O5_sum_of_subArray_min();
        int[] arr = {3, 1, 2, 4};
        System.out.println(solution.sumSubarrayMins(arr)); // Output: 17
    }
}














//same other logic 
// for(int i=0;i<=arr.length-1;i++){
//             while(!st.isEmpty() && arr[st.peek()]>arr[i]){
//                 st.pop();
//             }
//             left[i]=st.isEmpty()?i+1:i-st.peek();
//             st.push(i);
//         }
//         st.clear();
//         for(int i=arr.length-1;i>=0;i--){
//             while(!st.isEmpty() && arr[st.peek()]>arr[i]){
//                 st.pop();
//             }
//             right[i]=st.isEmpty()?arr.length-1:st.peek()-i;
//             st.push(i);
//         }

//         long totalSum=0;
//         for(int i=0;i<arr.length;i++){
//             long count=(long) left[i]*right[i];
//             long contribution = (count * arr[i]) % MOD;
//             totalSum = (totalSum + contribution) % MOD;
//         }
//         return totalSum;