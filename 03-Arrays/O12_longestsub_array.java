
import java.util.HashMap;

public class O12_longestsub_array {
    // public static void main(String[] args) {
    //     int arr[]={10, 5, 2, 7, 1, 9};
    //     int k=15;
    //     int count=0;
    //     int bigcount=0;
    //     for(int i=0;i<arr.length;i++){
    //         int sum=0;
    //         for(int j=i;j<arr.length-1;j++){
                
    //             sum=sum+arr[j];
    //             count++;
    //             if(sum==k){
    //                 int length=j-i+1;
    //                 bigcount=Math.max(bigcount, count);
    //             }
    //         bigcount=Math.max(bigcount, count);
    //             System.out.println(bigcount);
    //         }
    //     }
    // }
                    //~   sam try best try brute force but and some errors of compatibility 
    // !public static void main(String...args){
    //     int arr[]={-3, 2, 10};
    //  !   int key=9;
    //     int maxu=0;
    //     for (int i=0;i<=arr.length-1;i++){
    //         int sum=arr[i];
    //         int count=1;
    //         for(int j=i+1;j<=arr.length-1;j++){
    //             sum=sum+arr[j];
    //             count++;
    //             // System.out.println(sum);
    //             if(sum==key){
    //                 // System.out.println(count);
    //                 maxu=Math.max(count,maxu);
    //                 break;
    //             }
    //             if(sum>key){
    //                 // System.out.println("ho gaya mera");
    //                 continue;
    //             }
    //         }
    //     }
    //     System.out.println(maxu);
    //!}

    //? by hashmap we can do it i O(n)
    public static void main(String...args){
        int arr[]={-3,2,10};
        int key=9;
    }
    HashMap<Integer, Integer> seen=new HashMap<>();
    

}
// 