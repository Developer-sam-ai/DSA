public class O5_longest_palindrome {
    public static void main(String[] args) {
        String s="babad";
        String max="";
        
        // StringBuilder ma=new StringBuilder();
        for(int i=0;i<=s.length()-1;i++){
            StringBuilder res1=new StringBuilder();
            for(int j=i;j<=s.length()-1;j++){
                res1.append(s.charAt(j));
                if(ispallindrome(res1.toString())){
                    if(res1.length()>max.length()){
                        max=res1.toString();
                    }
                }
            }
        }
        System.out.println(max);

        
    }
    public static boolean  ispallindrome(String res1){
        int start=0;
        int end=res1.length()-1;
        while(end>=start){
            if(res1.charAt(start)!=res1.charAt(end)){
                return false;
            }
            end--;
            start++;
        }
        return true;
        
    }
}














// char a=s.charAt(i);
            // res1.append(a);
            // int start=0;
            // int end=res1.length()-1;
            // while(end>=start){
            //     if(res1.charAt(start)==res1.charAt(end)){
            //         start++;
            //         end--;
            //     }
            // }