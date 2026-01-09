
import java.util.Stack;



public class O5_infix_to_prefix {

    public static int power_Det(char in){
        return switch (in) {
            case '^' -> 3;
            case '/', '*' -> 2;
            case '+', '-' -> 1;
            default -> -1;
        };
    }
    public static void main(String[] args) {
    String str="(a+b)*c";
    Stack<Character> st=new Stack<>();
    StringBuilder res = new StringBuilder();

    for(int i=str.length()-1;i>=0;i--){
        char current=str.charAt(i);

        if(Character.isAlphabetic(current)){
            res.append(current);
        }
        else if(current==')'){
            st.push(current);
        }
        else if( current== '('){
            while(!st.isEmpty() && st.peek()!=')'){// jab tak equal nahi ho jata
                res.append(st.pop());
            }
            st.pop(); // the ) symbol
        }
        else{
        while(!st.isEmpty() && power_Det(current)<power_Det(st.peek()) ){
            res.append(st.pop());
            
        }
        st.push(current);
    }
}

    while(!st.isEmpty()){
        res.append(st.pop());
    }
    System.out.println(res.reverse().toString());
    }
}
