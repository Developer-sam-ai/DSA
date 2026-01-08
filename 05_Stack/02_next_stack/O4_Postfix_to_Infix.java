
import java.util.Stack;

public class O4_Postfix_to_Infix {
    public static void main(String[] args) {
        String str="abc*+";
        String result="";
        Stack<String> st=new Stack<>();
        for(int i=0;i<=str.length()-1;i++){
            char c=str.charAt(i);
            if(Character.isAlphabetic(c)){
                st.push(c+"");
            }
            else{
                String strt=st.pop();
                result='('+st.pop()+c+strt+')';
                st.push(result);
            }
        }
        System.out.println(result);
    }
}
