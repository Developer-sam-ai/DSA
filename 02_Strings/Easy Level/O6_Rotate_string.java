public class O6_Rotate_string {
    public static void main(String[] args) {
        String s="abcde";
        String goal="cdeab";
        for(int i=1;i<=s.length();i++){
            // int n=s.length()%(s.length()-i);
            // String s1="";
            // s1+=s.charAt(n);
            // System.out.print(s1);
            int n=s.length();
            int k=i%n;
            String rotated=s.substring(k)+s.substring(0,k);
            //~ we use substring method for this 
            
            if(rotated.equals(goal)){
                System.out.println("true");
                break;
            }
        }
        
    }
}
