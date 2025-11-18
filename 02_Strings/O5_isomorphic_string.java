
import java.util.HashMap;
import java.util.HashSet;

public class O5_isomorphic_string {
    public static void main(String[] args) {
        String s="paper";
        String t="title";
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
            if(map.get(a)!=b){
                    System.out.println("false");
                    return;
                }
            else{
            if(used.contains(b)){
            System.out.println("false");
            return ;
            }
        }
            map.put(a,b);
            used.add(b);
    }
        }
        System.out.println("true");
    }
}

// ! just something new in this questions where we map every charachter and we make hashmap of charcter itself not string 
//? we are checking and keeping reocrd of the used ones in the used 
