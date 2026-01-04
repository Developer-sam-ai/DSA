
import java.util.HashSet;

public class contains_Duplicate {
    public static void main(String...args){
        int []nums={1,1,1,3,3,4,3,2,4,2};
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<=nums.length-1;i++){
            if(set.contains(nums[i])){
                System.out.println("true");
                return;
            }
            else{
                set.add(nums[i]);
            }
        }
        System.out.println("false");
    }
}
