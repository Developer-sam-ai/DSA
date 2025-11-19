
import java.util.HashMap;



public class O7_Anagram {
    public static void main(String...args){
        String s="123@@###abc";
        String t="#@#@321cba#";

        HashMap<Character,Integer> map=new HashMap<>();
        
        if(s.length()!=t.length()){
            System.out.println("false");
        }
        for(int i=0;i<=s.length()-1;i++){
        // int count=1;
            char a=s.charAt(i);
            // if(map.containsKey(a)){
            //     count++;
            // }
            // map.put(a, count);

            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }
            else{
                map.put(a,1);
            }
            
        }
        for(int p=0;p<=t.length()-1;p++){
            char a=t.charAt(p);
            int count= map.get(a);
            if(!map.containsKey(a)){
                System.out.println("false");
                return;
            }
            
            map.put(a,map.get(a)-1);
            if(map.get(a)<0){
                System.out.println("false");
            }
            
        }
        // we are having final check
        // to check if the anagram is empty or not its for final check 
        for(int values:map.values()){
            if(values!=0){
                System.out.println("false");
            }
        }
        System.out.println("true");
    }
}
