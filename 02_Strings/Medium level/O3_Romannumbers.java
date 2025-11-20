
import java.util.HashMap;



public class O3_Romannumbers {
    public static void main(String[] args) {
        String s="LVIII";                                                                                                                                                            
        
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int samudi=0;
        for(int i=0;i<=s.length()-1;i++){
            int d=map.get(s.charAt(i));
            if( i+1<s.length() &&map.get(s.charAt(i+1))>d ){
                samudi=samudi-d;
            }
            else{
                samudi=samudi+d;
            }
        }
        System.out.println(samudi);
    }
}
