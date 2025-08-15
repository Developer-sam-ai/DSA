package concepts;
import java.util.HashMap;
public class solve_10_seven_problem {
	public static void main(String...args) {
	char arr[]= {'s','f','f','y','u','g','s','c'};
	HashMap<Character,Integer> h1=new HashMap<>();
//	for(int i=0;i<=arr.length-1;i++) {
//		h1[arr[i]]++;
//	}
	
//	for(char heel:arr) {
//		h1.put(heel, h1.getOrDefault(heel,0)+1);
		
//		h1.put(heel, h1.getOrDefault(0,0)+1);
		//out-put
//		{s=1, c=1, u=1, f=1, g=1, y=1}
//		if we add 0 to 0 then it will just add to zero as a default value
//	}
	
	// other m to try on
	for(char r:arr) {
		if(h1.containsKey(r)) {
			h1.put(r,h1.get(r)+1);
		}
		else {
			h1.put(r, 1);
		}
	}
	
    // other method 
//	for(char s:arr) {
//		h1.compute(s,(key,val)->(val==null)? 1:val+1);
//	}
	System.out.println(h1);
	}
}
