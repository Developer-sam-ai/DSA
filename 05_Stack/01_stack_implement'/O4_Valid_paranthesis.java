
import java.util.Stack;

public class O4_Valid_paranthesis {
    public static void main(String...args){
        Stack<Character> stq=new Stack<>();
        String hello="()";
        for(int i=0;i<=hello.length()-1;i++){
            char ch=hello.charAt(i);
            if(ch=='('||ch=='{'|| ch=='['){
                stq.add(ch);
            }
            if(ch=='}'){
                if(stq.peek()=='{'){
                    stq.pop();
                }
            }
            if(ch==']'){
                if(stq.peek()=='['){
                    stq.pop();
                }
                else{
                    return 
                }
            }
            if(ch==')'){
                if(stq.peek()=='('){
                    stq.pop();
                }
            }
            
        }
        System.out.println(stq.isEmpty());
    }
}
