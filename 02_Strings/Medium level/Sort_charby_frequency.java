
import java.util.HashMap;
import java.util.Map;


public class Sort_charby_frequency {
    public static void main(String[] args) {
        String s="tree";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<=s.length()-1;i++){
            char a=s.charAt(i);
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }
            else{
                map.put(a,1);
            }
        }

        //? it is the best thing we have learnt up far as
        //! in hashmap we can only access values not the key so to access it 

        //* converting hashmap to map.Entery*/
        while(true){
        int max=0;
        char maxChar='a';
        
        for(Map.Entry<Character,Integer> e: map.entrySet()){
            char c=e.getKey();
            int freq=e.getValue();
            
            if(freq>max ){
                max=freq;
                maxChar=c;
            }
        }
        String finale="";
        if(max==0){
            break;
        }
        for(int i=0;i<=max-1;i++){
            finale+=maxChar;
            
        }
        map.put(maxChar,0); //? set the used frequency to zero 
        System.out.print(finale);
        
    }
        //^ we will get the stringbuilder as well in this question learn all
        
    }
}

// the main thing is the map entries
