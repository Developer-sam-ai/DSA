
import java.util.Arrays;
public class O5_rotate_array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int n=arr.length;
        int k=2;
        k=k%n;
        int arb[]=new int[arr.length];
        // int index=1;
        // int temp=arr[0];
        for(int i=0;i<=arr.length-1;i++){
            // & it will give us after rotating where will our new element land
            int h=(i-k+n)%n;
            arb[h]=arr[i];
            System.out.println(h);
        }
        // arr[arr.length-1]=temp;
        
        // System.out.println(h);
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=arb[i];
        }
        System.out.println(Arrays.toString(arb));
    }
}
