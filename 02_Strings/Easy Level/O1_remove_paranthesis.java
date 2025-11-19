
public class O1_remove_paranthesis{
    public static void main(String[] args) {
        String st="(()())(())(()(()))";
        int count=0;
        String end="";
        for(int i=0;i<=st.length()-1;i++){
            if(st.charAt(i)=='('){
                if(count>0){
                    //~ its not the mid one
                    end=end+"(";
                }
                count++;
            }
            
            if(st.charAt(i)==')'){
                count--;
                if(count>0){
                    end=end+")";
                }
            }
        }
        System.out.println(end);
    }
}