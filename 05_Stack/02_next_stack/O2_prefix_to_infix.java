
import java.util.Stack;

public class O2_prefix_to_infix {
    
    public static int whatsit(char c){
        if(Character.isAlphabetic(c)) return 1;
        else return 2;
    }
    
    public static void main(String[] args) {
        // create a stack
        Stack<String> st=new Stack<>();
        String result="";
        String problem="*+ab-cd";

        for(int i=problem.length()-1;i>=0;i--){
            char c=problem.charAt(i);
            if(whatsit(c)==1){
                st.push(c+"");
            }
            else if(whatsit(c)==2){
                result='('+st.pop()+c+st.pop()+')';
                st.push(result);
            }
        }
        System.out.println(result);
    }
    // here the main problem was to convert the char to string that is done by +"" and we push our 
    // result back to stack so we can redo the things and just equal the result;
    
}












//          if(whatsit(c)==2 && whatsit(cp)==1 ){
            //     result+='('+cp;
            //     st.push(c);
            // }
            // else if(whatsit(c)==2 && whatsit(cp)==2){
            //     result+='(';
            //     st.push(cp);
            // }
            // else if(whatsit(c)==1 && whatsit(cp)==2){
                
            // }