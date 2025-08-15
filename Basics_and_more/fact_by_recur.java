package Basics_and_more;

public class fact_by_recur {
	public static int multi=1;
    public static void main(String...args){
    	int n=5;
    	if(n>1) rec(n);
    	System.out.println(multi);
    }
	public static int rec(int n){
    if(n>1) {
	multi=multi*n;
	 rec(n-1);}
	 return 0;
	}
}
