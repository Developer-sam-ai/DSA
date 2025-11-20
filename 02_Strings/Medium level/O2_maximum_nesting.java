public class O2_maximum_nesting {
    public static void main(String[] args) {
        String s="(1+(2*3)+((8)/4))+1";
        int max=0;
        int count=0;
        for(int i=0;i<=s.length()-1;i++){
            char a=s.charAt(i); 
            
            if(a=='('){
                count++;
                if(count>max){
                    max=count;
                }
            }
            if(a==')'){
                count--;
            }
        }
        System.out.println(max);
    }
}
