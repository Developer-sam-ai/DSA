
import java.util.Arrays;
public class O6_Alternate_pos_neg {
    public static void main(String[] args) {
        int arr[]={3,1,-2,-5,2,-4};
        int first=0;
        int second=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[0]>0){
                first++;
            }
            else{
            while(arr[second]<0){
                second++;
            // swap first and 2nd 
            int temp = arr[first];
            arr[first]=arr[second];
            arr[second]=temp;
            }
        }
        }
        System.out.println(Arrays.toString(arr));
    }
}
