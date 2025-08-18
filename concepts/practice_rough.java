package concepts;

import java.util.Arrays;

public class practice_rough {
	public static void main(String...args) {
		int nums[]= {1,2,3,4,2,1,1};
		int count=0;
		int hash[]=new int[nums.length];
	    for(int i=0;i<=nums.length-1;i++){
	        hash[nums[i]]++;
	                }
	    System.out.print("[");
	    for(int i=0;i<=nums.length-1;i++) {
	    System.out.print("["+nums[i]+","+hash[i]+"]");
	    if(hash[i]>count) {
	    	count=hash[i];
	    }
	    }
	    System.out.println("]");
	    System.out.println("the highest frequency is "+count+" of element");
	}
	//output 
//	[[1,0][2,3][3,2][4,1][2,1][1,0][1,0]]
	
//	finding the highest element in them
	
}
