
import java.util.Stack;

public class O1_infix_to_postfix {

    static int prec(char c){
        if(c=='^') return 3;
        if(c=='/' || c=='*') return 2;
        if(c == '+'|| c=='-') return 1;
        return -1;
    }
    public static void main(String[] args) {
        String result="";
        String ques="a+b+c";
        // HashSet<Character> hash=new HashSet<>();
        // hash.add('+');
        // hash.add('-');
        // hash.add('*');
        // hash.add('/');
        // hash.add('(');
        Stack<Character> st=new Stack<>();
        for(int i=0;i<=ques.length()-1;i++){
            char c=ques.charAt(i);
            if(Character.isAlphabetic(c)){
                // it is an char directly add to result
                result+=c;
            }
            else if(c=='('){
                st.push(c);
            }
            else if(c==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    result+=st.pop();
                }
                st.pop();
            }
            else{
                while(!st.isEmpty() && prec(c)<=prec(st.peek())){
                    result+=st.pop();
                }
                st.push(c);
            }
            // we dont make it like a map but we do like ranking 
        }
        while(!st.isEmpty()){
            result+=st.pop();
        }
        System.out.println(result);
    }
}
