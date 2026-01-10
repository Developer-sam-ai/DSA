
import java.util.Stack;

public class O3_Largest_Rectangle {
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        Stack<Integer>st=new Stack<>();
        // we go left to right
        int n=arr.length;
        int max=0;
        // find the next and prev smaller elements in the code
        for(int i=0;i<=n-1;i++){
            int c=arr[i];
            while(!st.isEmpty() && c<arr[st.peek()]){
                // while poping we calculate the area here
                int height=arr[st.pop()];
                int pse= st.isEmpty() ? -1:st.peek();
                //^ int next_smaller=i;
                //* index to be pooped;
                int area=height*(i-pse-1);
                max=Math.max(max,area);
            }
            // its like the element which will be replaced is the next smaller elemnt of the number 
            //! prev smaller tar kadhtoch aahet pan jar current peek peksha motha aahe tar pop and thats the next smaller
            st.push(i);
        }
        System.out.println(max);
    }
}
