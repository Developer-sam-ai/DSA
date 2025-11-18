
import java.util.HashMap;
import java.util.HashSet;

public class O5_isomorphic_string {
    public static void main(String[] args) {
        String s="paper";
        String t="foler";
        // we will try it by hashmap 
        HashMap<Character,Character>map=new HashMap<>();
        HashSet<Character>used=new HashSet<>();
        if(s.length()!=t.length()){
            System.out.println("false");
            return;
        }
        for(int i=0;i<s.length()-1;i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
            if(map.containsKey(a)){
                System.out.println("true");
            }
            if(used.contains(b)){
            System.out.println("false");
            }
        }

    }
}
