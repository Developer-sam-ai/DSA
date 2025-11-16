import java.util.Arrays;
public class O9_find_missing_number {
    // public static void main(String[] args) {
    //     int arr[]={1,2,3,4,6,8};
    //     //? we have to find teh missing number
    //         int sample=arr[0];
    //     for(int i=0;i<arr.length-1;i++){
    //         // System.out.println(sample);
    //         sample=sample+1;
    //         if(arr[i+1]!=sample){
    //             System.out.println(sample);
                
    //         }
    //         //& many limitations are there in this as we cant add much values 
    //     }
    // }

    // public static void main(String[] args) {
    //     // we must work for things like rotating and more
    //     int arr[]={3,0,2};
    //     // so here the ans must be 1
    //     int min=arr[0];
    //     // hash map for it 
    //     int hash[]=new int[9];
    //     for(int i=0;i<=arr.length-1;i++){
    //         if(arr[i]<min){
    //             min=arr[i];
    //         }
    //     }
    //     for(int i=0;i<=arr.length-1;i++){
    //         hash[arr[i]]+=1;
    //     }

        // System.out.println(min);
        // for(int i=0;i<arr.length;i++){
            
        // }


    // }

    public static void main(String[] args) {
        int arr[]={9,6,4,2,3,5,7,0,1};
        int hash[]=new int[arr.length+1];
        for(int j=0;j<=arr.length-1;j++){
            hash[arr[j]]+=1;
        }
        System.out.println(Arrays.toString(hash));

        for(int i=0;i<=hash.length-1;i++){
            if(hash[i]==0){
                System.out.println(i);
            }
        }
    }

    //! finally got it right its only about the problem of the size of the array 
    //~ its good to have a 
}
