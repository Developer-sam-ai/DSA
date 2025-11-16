public class O3_majority_element {
    // public static void main(String[] args) {
    //     int nums[]={3,2,3};
    //     int hash[]=new int[9];
    //     for (int i=0;i<=nums.length-1;i++){
    //         hash[nums[i]]+=1;
    //     }
    //     int max=0;
    //     for (int i=0;i<hash.length-1;i++){
    //         if(hash[i]>=max){
    //             max=i;
    //         }
    //     }
    //     System.out.println(max);
    //     System.out.println(Arrays.toString(hash));
    // }

    public static void main(String[] args) {
        int arr[]={1,2,3,1,1,1};
        int count=0;
        int index=arr[0];

        for (int num:arr){
            if(count==0){
                index=num;
                
            }
            if(index==num){
                count++;
            }
            else{
                count--;
            }
        }
        System.out.println(index);
    }
}
