
import java.util.HashMap;

public class O1_Twosum {
    public static void main(String[] args) {
        int target=9;
        int []arr={2,7,11,15};
        HashMap<Integer,Integer> hash= new HashMap<>();
        // int sum=0;
        for(int i=0;i<=arr.length-1;i++){
            // int change=arr[0];
            // sum=sum+arr[i];
            // System.out.println(sum);
            // if(sum>target || target==sum+1){
            //     sum=arr[i];
            //     // System.out.println("the index is "+i);
            // }
            // if(sum==target){
            //     System.out.println(change+"to "+i);
            // }
            // if(hash.containsKey(target)){
            //     int prev=hash.get(sum-target);
            //     int len=i-prev;
            //     System.out.println(hash);
            // }
            
            // // System.out.println(hash);

            int taru=target-arr[i];
            if(hash.containsKey(taru)){
                System.out.println("["+hash.get(taru)+","+i+"]");
            }
            hash.put(arr[i],i);
        }
        // System.out.println(hash);
    }
}
