

public class O4_common_prefix {
    public static void main(String[] args) {
        String []nums={
            "flower",
            "flow",
            "fly"
        };
        for (int i=0;i<=nums.length-1;i++){
            String prefix=nums[0];
            while(!nums[i].startsWith(prefix)){
                //^ “As long as the current string does NOT start with the prefix, keep shrinking the prefix.
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()) return;
                System.out.println(prefix);
            }
            
        }
}
}
