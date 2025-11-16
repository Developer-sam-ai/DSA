
import java.util.HashMap;


public class O13_subarraysum {
    // public static void main(String[] args) {
    //     int []aru={6, -1, -3, 4, -2, 2, 4, 6, -12, -7};
    //     int []hash=new int[10];
    //     List<Integer> l1=new ArrayList<>();
        
    //     // for(int i=0;i<=aru.length-1;i++){
    //     //     hash[aru[i]]+=1;
    //     // }
    //     int sum=0;
    //     int target=6;
    //     int count=0;
    //     for(int i=0;i<=aru.length-1;i++){
    //         sum+=aru[i];
    //         if(sum-target==0 || aru[i]==target){
    //             System.err.println("Found ");
    //             count++;
    //             sum=0;
    //         }
    //         // we have to check if sum-target is in subarray or not
            
    //     }
    //     System.out.println(count);
        


    // }


    public static void main(String[] args) {
        int []arr={1,2,3};
        int target =3;
        HashMap<Integer,Integer>map=new HashMap<>();

        int sum=0,count=0;

        map.put(0,1);
        for (int i=0;i<=arr.length-1;i++){
            sum+=arr[i];
            if(map.containsKey(sum-target)){
                count+=map.get(sum-target);
            }
            map.put(sum,map.getOrDefault(sum, 0)+1);
        }
        System.out.println(count);
    }
}
