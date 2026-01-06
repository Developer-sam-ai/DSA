
import java.util.Stack;

public class O3_prefix_to_postfix {
    public static void main(String[] args) {
        String stri="+ab-cd";
        Stack<String> st=new Stack<>();
        for(int i=stri.length()-1;i>=0;i--){
            char current=stri.charAt(i);
            if(Character.isAlphabetic(current)){
                st.push(current+"");
            }
            else{
                    String result=st.pop()+st.pop()+current;
                    st.push(result);
            }
        }
        String result="";
        while(!st.isEmpty()){
            result+=st.pop();
        }
        System.out.println(result);
    }
}
