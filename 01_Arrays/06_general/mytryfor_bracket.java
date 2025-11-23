public class mytryfor_bracket {
    public static void main(String[] args) {
        int square=0;
        int curly=0;
        int round=0;
        for (int i=0;i<=s.length()-1;i++){
            for(int j=i;j<s.length()-1;j++){
            char a=s.charAt(j);
            
            if(a=='('){
                round=1;
            }
            else if(a=='{'){
                curly=1;
            }
            else if(a=='['){
                square=1;
            }
            if(a==')'){
                if(round==0){
                    return;
                }
                else if(curly==1 ||square==1){
                    return ;
                }
                else{
                    round=0;
                }
            }
            if(a=='}'){
                if(curly==0){
                    return ;
                }
                else if(round==1 ||square==1){
                    return ;
                }
                else{
                    curly=0;
                }
            }
            if(a==']'){
                if(square==0){
                    return ;
                }
                else if(round==1 || curly==1){
                    return ;
                }
                else{
                    square=0;
                }
            }
            if(round==0 && square==0 && curly==0){
                return;
            }
        }}
        return ;
    }
}
