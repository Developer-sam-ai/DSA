
import java.util.HashMap;
import java.util.Stack;

public class O1_Next_greater_element {
    public static void main(String[] args) {
        int[] num1={4,1,2};
        int[] num2={1,3,4,2};
        int[] res=new int[num1.length];
    //! we do hashmap for stoarge 
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> st=new Stack<>();

            for (int i=num2.length-1;i>=0;i--){
                int current = num2[i];
                while (!st.isEmpty() && st.peek() <= current) {
                    st.pop();
                    }
                if(st.isEmpty()){ 
                    map.put(num2[i], -1);
                }
                else{
                        map.put(num2[i],st.peek());
                    
                }
                st.push(current);
            }
        System.out.println(map.values());
    }
}



// for(int j=0;j<=num2.length-1;j++){
//                 st.push(j);
//             }
// for(int j=0;j<=num2.length-1;j++){
//                 if(num1[i]==num2[j]){
//                     if(num2[j+1]>num2[j]){
//                         System.out.println(num2[j]);
//                         res[i]=num2[j];
//                     }
//                     else{
//                         System.out.println("-1");
//                         res[i]=-1;
//                     }
//                 }
//             }