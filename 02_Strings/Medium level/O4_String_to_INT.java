

public class O4_String_to_INT {
    public static void main(String[] args) {
        String s="   -042";
        // HashMap<Character,Integer> map=new HashMap<>();
        // map.put()
        String t=s.trim();
        StringBuilder result= new StringBuilder();

        if(t.length()==0){
                System.out.println("0");
                return;
        }
        for(int i=0;i<=t.length()-1;i++){
            char a=t.charAt(i);
            if((a=='-'|| a=='+')){
                result.append(a);
            }
            else if(a<'0'|| a>'9'){
                break;
            }
            else{
                result.append(a);
            }
            // we want to remove 
        }
        int sign=1;
        int start=0;

        if(result.length()>0 && (result.charAt(0)=='+'||result.charAt(0)=='-')){
            if(result.charAt(0)=='-') sign= -1;
            start=1;
        }
        StringBuilder hello=new StringBuilder();
        
        if(start==1){
            hello.append(result.charAt(0));
        }
        int i=start;
        while(i<result.length() && result.charAt(i)=='0'){
            i++;
        }
        while(i<result.length()){
            hello.append(result.charAt(i));
            i++;
        }
        // System.out.println(hello.toString());

        int num=0;
        for(int j=start;j<hello.length();j++){
            int digit=hello.charAt(j)-'0';
            if(num > Integer.MAX_VALUE / 10 || 
            (num == Integer.MAX_VALUE / 10 && digit > 7)){
                num=(sign==1? Integer.MAX_VALUE:Integer.MIN_VALUE);
                // System.out.println(num);
                return;
            }
            num=num*10+digit;
        }

        num=num*sign;
        System.out.println(num);
    }
}





//^  The most tragedic try




class Solution {
    public int myAtoi(String s) {
        // checking length firstly we trim
        String t=s.trim();

        if(t.length()==0){
            return 0;
        }
        StringBuilder result =new StringBuilder();
        for(int i=0;i<=t.length()-1;i++){
            char a=t.charAt(i);
            if(i==0 &&(a=='+'||a=='-')){
                result.append(a);
                continue;
            }
            if(a<'0'|| a>'9'){
                break;
            }
            else{
                result.append(a);
            }
        }

        int start=0;
        int sign=1;
        StringBuilder hello=new StringBuilder();

        if(result.length()>0 && (result.charAt(0)=='+' || result.charAt(0)=='-')){
            if(result.charAt(0)=='-') sign=-1;
            start=1;
        }
        if(start==1){
            hello.append(result.charAt(0));
        }
        int i=start;
        while(result.length()>i && result.charAt(i)=='0'){
            i++;
        }
        while(result.length()>i && result.charAt(i)=='0'){
            hello.append(result.charAt(i));
            i++;
        }
        if(hello.length()==1 &&(hello.charAt(0)=='+' || hello.charAt(0)=='-')){
            return 0;
        }

        int num=0;
        for(int j=start;j<hello.length();j++){
            int digit=hello.charAt(j)-'0';
            if(num>Integer.MAX_VALUE/10 || num==Integer.MAX_VALUE/10 && digit>7){
                return  sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            num=num*10+digit;
        }
        return num*sign;
    }
}