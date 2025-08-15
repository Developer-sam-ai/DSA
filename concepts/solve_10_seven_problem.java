package concepts;
import java.util.HashMap;
public class solve_10_seven_problem {
	public static void main(String...args) {
	char arr[]= {'s','f','f','y','u','g','s','c'};
	HashMap<Character,Integer> h1=new HashMap<>();
//	for(int i=0;i<=arr.length-1;i++) {
//		h1[arr[i]]++;
//	}
	
	for(char heel:arr) {
		h1.put(heel, h1.getOrDefault(heel,0)+1);
	}
	System.out.println(h1);
	}
}
