
import java.util.Arrays;

public class O8_permutation {
    public static void main(String[] args) {
        int arr[]={3,2,1};
        boolean found=false;
        for(int i=arr.length-1;i>0;i--){     
            if(arr[i]>arr[i-1]){
                int index=i-1;
                for(int j=arr.length-1;j>index;j--){
                    if(arr[index]<arr[j]){
                        //swap kardo i and j ko
                        int temp=arr[index];
                        arr[index]=arr[j];
                        arr[j]=temp;
                        break;
                    }
                }
                Arrays.sort(arr,i,arr.length);
                found=true;
                break;
                
            }
        }
            if(!found){
                for (int left=0,right=arr.length-1;right>left;left++,right--){
                    int temp=arr[left];
                    arr[left]=arr[right];
                    arr[right]=temp;
                }
            }
        
        System.out.println(Arrays.toString(arr));
    }
}

