package Basics_and_more;

public class fabonacci {
	 public static void main(String...args){
		 int n=3;
	       int a=0;
	        int b=1;
	        int sum=0;
	        while(n>2){
	            sum=a+b;
	            a=b;
	            b=sum;
	            n--;
	        }
	        
	        System.out.println(sum);
	    }
}
