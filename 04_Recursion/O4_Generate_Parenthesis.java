

public class O4_Generate_Parenthesis {
    public static void main(String[] args) {
        Solution s=new Solution();
        String ans=s.genrateParenthsis(3);
        System.out.println(ans);
    }

}

class Solution{
    String  store="";
    public String genrateParenthsis(int n){
        if(n==0) return store;
        store=store+"()";
        genrateParenthsis(n-1);
        
        return nextstep(store);
    }
    int open=0;
    int close=0;
    String ste="";
    public String nextstep(String st){
        for(int i=0;i<=st.length()-1;i++){
        if(st.charAt(i)=='('){
            open++;
        }
        else{
            close++;
        }
    }
        if(open>0){
            ste="(";
            open=2;
            close=3;
        }
        
        return st;
    }
}
