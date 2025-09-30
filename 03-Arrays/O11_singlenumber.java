import java.util.HashMap;
import java.util.Map;

public class O11_singlenumber {
    public static void main(String[] args) {
        int nums[]={1,2,2,4,4,5,5,6};
        Map<Integer,Integer> map =new HashMap<>();
        int  times=0;
        for(int num:nums){
            // hash[nums[i]]+=1;
            map.put(num,map.getOrDefault(num,0)+1);
        }
        // System.out.println(Arrays.toString(hash));
        for (int key: map.keySet()){
            if(map.get(key)==1){
                // times+=i+",";
                // return key;
                times=key;
            }
        }
        // System.out.println(times);
        // return times;
    }
}
