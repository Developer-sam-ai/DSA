
import java.util.HashSet;



public class O9_longest_sequence {
    // public static void main(String[] args) {
    //     int arr[]={5, -1, 5, 3, -1, 5, 3, 3};
    //     HashMap<Integer,Integer> h1=new HashMap<>();
    //     for (int i=0;i<=arr.length-1;i++){
    //         h1.put(i,arr[i]);
    //     }
    //     int count=1;
    //     int max_count=0;
    //     for(int i=0;i<=arr.length-1;i++){
    //         if(h1.containsValue(arr[i]-1)){
    //             count++;
    //         }
    //         // lets get the max count in it 
    //     }
    //     if(count>max_count){
    //         max_count=count;
    //     }
    //     System.out.println(max_count);
    // }
//! this is the wrong approach of hashmap and we should use hashset for these kind of problems where we need only one 





//using hash set something new
    public static void main(String[] args) {
        int arr[]={100, 4, 200, 1, 3, 2};
        HashSet<Integer>set=new HashSet<>();
        for(int nums:arr){
            set.add(nums);
        }
        int maxcount=0;
        for(int num:set){
            if(!set.contains(num-1)){    //~  ->  here if the num-1 exist in the set then we dont start new the numebr is a part of an squence 
                int first=num;
                int count=1;
                while(set.contains(first+1)){
                    first++;
                    count++;
                }
                maxcount=Math.max(maxcount,count);
            }
        }
        System.out.println(maxcount);
    }
}



