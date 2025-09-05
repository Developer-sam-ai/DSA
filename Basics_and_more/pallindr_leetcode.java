public class pallindr_leetcode {
    public static void main(String...args) {
       String hello="A man, a plan, a canal: Panama";
       hello=hello.replaceAll("[^a-zA-Z0-9]" ,"").toLowerCase();
                     // learnt to replace spaces by the all in onemethod {^a-zA-Z0-9] and many more 
       System.out.println(hello);
//       String out="";
       StringBuilder out=new StringBuilder();
       int n=hello.length();
       
       
                              // improvement as we can use string builder for it 
                              // will take less time 
//       while(n>0) {
//    	   char k=hello.charAt(n-1);
//    	   System.out.println(k);
//    	   out+=k;
//    	   n--;
//       }
       
       while(n>0) {
    	   out.append(hello.charAt(n-1));
    	   n--;
       }
         
                      // learnt to use string builder and we can take output from 
                      // to string method 
       
       if(hello.equals(out.toString())) {
    	   System.out.println("aala re");
       }
       else {
    	   System.out.println("nay re");
       }
//       return hello.equals(out);    // for direct output
       
    }
}
