import java.util.Arrays;
public class O7_reaarange_odd_even {
    public static void main(String[] args) {
        int arr[]={3,1,-2,-5,2,-4};
        int result[]=new int[arr.length];
        int postint=0;
        int negint=1;

        for (int num:arr){
            if(num>0){
                result[postint]=num;
                postint+=2;
            }
            else{
                result[negint]=num;
                negint+=2;
            }
        }
        System.out.println(Arrays.toString(result));
    }
    
}
