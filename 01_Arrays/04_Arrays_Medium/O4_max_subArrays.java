

public class O4_max_subArrays {
    public static void main(String[] args) {
        int arr[]={5,4,-1,7,8};
    //~ how to get a subarray 
        int sum=0;
        int maxsum=arr[0];
        for (int i=0;i<=arr.length-1;i++){
            // lets do it by pointers sam
            sum=sum+arr[i];
            maxsum=Math.max(sum,maxsum);
        //~ i was thinking to move our pointer as well sam 
        System.out.println(sum);
            if(sum<0)sum=0;
            
        }
        System.out.println(maxsum);

    }
}
