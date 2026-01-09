
import java.util.Arrays;
import java.util.Stack;

public class O6_Asteroid_Collision {

    public static void main(String[] args) {
        int arr[]={5,10,-5};
        Stack<Integer>st=new Stack<>();

        for(int i=0;i<=arr.length-1;i++){
            // push index ok
            int current=arr[i];
            boolean destroid=false;
            // if both elements sign are different then only we do like comaprison
            while(!st.isEmpty() && arr[st.peek()]>0 && current<0){
                //now we find magnitude 
                if(Math.abs(current)>Math.abs(arr[st.peek()])){
                    st.pop();
                }
                else if(Math.abs(current)==Math.abs(arr[st.peek()])){
                    st.pop();
                    destroid=true;
                    }
                    else{
                        destroid=true;
                        break;
                    }
        }
        if(!destroid){
            st.push(i);
        }
    }
        int res[]=new int[st.size()];
        int j=st.size()-1;
        while(!st.isEmpty()){
            res[j]=arr[st.pop()];
            j--;
        }
        
        System.out.println(Arrays.toString(res));
    }
}
