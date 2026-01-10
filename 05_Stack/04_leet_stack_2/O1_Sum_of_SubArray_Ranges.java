
import java.util.Stack;

public class O1_Sum_of_SubArray_Ranges {
    // stack approach 
    public static void main(String[] args) {
        long MOD = 1_000_000_007;
        int []arr={1,2,3};
    Stack<Integer> st=new Stack<>();
    int n=arr.length;
    long totalsum=0;

    for(int i=0;i<=n;i++){

        int current = (i == n) ? Integer.MIN_VALUE : arr[i];
        
        while(!st.isEmpty() && arr[st.peek()]>current){
            // jab tak bada elemetn milta jata hai aage badte jao
            int midindex=st.pop();
            int midvalue=arr[midindex];
            int rightbou=i;
            int leftbou = st.isEmpty() ? -1 : st.peek();

            long leftdis=midindex-leftbou;
            long rightdis=rightbou-midindex;
            
            totalsum-=(leftdis*rightdis*midvalue);
        }
    st.push(i);
    }
    st.clear();
    for(int i=0;i<=n;i++){
        int current = (i == n) ? Integer.MAX_VALUE : arr[i];
        while(!st.isEmpty() && arr[st.peek()]<current){
            int midindex=st.pop();
            int midvalue=arr[midindex];
            int leftwall=st.isEmpty() ?-1:st.peek();
            int rightwall=i;

            long leftdist=midindex-leftwall;
            long rightdist=rightwall-midindex;

            totalsum+=(leftdist*rightdist*midvalue);

        }
        st.push(i);
    }

    System.out.println(totalsum);
    }





    // O(N^2)
    // Approach
    
    // public static void main(String[] args) {
    //     int arr[]={4,-2,-3,4,1};
    //     int result=0;
    //     for(int i=0;i<=arr.length-1;i++){
    //         int max=arr[i];
    //         int min=arr[i];
    //         for(int j=i;j<=arr.length-1;j++){
    //             if(arr[j]>max){
    //                 max=arr[j];
    //             }
    //             if(arr[j]<min){
    //                 min=arr[j];
    //             }
    //             int range=max-min;
    //             result+=range;
    //         }
    //     }
    //     System.out.println(result);
    // }
}

//  my code failed as i asseumed that 
//  i assumes the first person you met (current or arr[i]) will always be the shortest person in the group
// which is not always true