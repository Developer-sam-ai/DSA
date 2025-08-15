package concepts;

import java.util.Arrays;

//import java.util.HashMap;

public class hashing {
	
	// if we declare the array globally it can go upto 10^7
	public static void main(String...args) {
//		int s[]= {1,1,2,4,5,6,8,8,4,2,3};
////		HashMap<Integer,Integer> hagu=new HashMap<>(13);
//		int Hash[]=new int[130];
//		for(int i=0;i<=s.length-1;i++) {
//			Hash[s[i]] +=1;
//		}
//		System.out.println(Arrays.toString(Hash));
//		System.out.print(Hash[2]);
	// here it is imp as to do 
//		hash[arr[i]]+=1;  most imp logic of it
	
	// if we declare the array locally we can go upto 10^6
		
		
	// going with the character to add things up or count 
		
		char c[]= {'e','r','a','f','d','s','w','e','r','d','s','f','g','s','a','d'};
		int hash[]=new int[256];
		
		// we must be perfect in ascii value representation 
		
		for(int i=0;i<=c.length-1;i++){
			hash[c[i]]++;
			
		}
		System.out.println(Arrays.toString(hash));
		
		
	}
}