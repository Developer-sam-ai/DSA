
import java.util.Arrays;

public class O1_insert_position {
    public static void main(String[] args) {
        int arr[]={1,3,5,6};
        // int target=7;
        int target=3;

        int low=0;
        int high=arr.length-1;
        
        while(high>=low){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                return ;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            System.out.println(Arrays.toString(arr));
            // System.out.println(mid);
        }
        System.out.println(low);
        //~ we just return where should it fit lets just dry run all and make things in our hand
        //! we are getting some more 
        
    }
}
