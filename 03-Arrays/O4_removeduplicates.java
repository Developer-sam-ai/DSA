import java.util.Arrays;
public class O4_removeduplicates {
    public static void main(String[] args) {
        //! we need to remove duplicates 
        int arr[]={1,1,2};
        //ascending
        Arrays.sort(arr);
        int countdup=0;
        // int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                // countdup++;
                // int index=i+1;
                arr[countdup++]=arr[i];
                
            }
        }
        arr[countdup++]=arr[arr.length-1];
        System.  out.println(countdup);
        System.out.println(Arrays.toString(arr));
    }
}
