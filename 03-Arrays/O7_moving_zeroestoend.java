import java.util.Arrays;
public class O7_moving_zeroestoend {
    public static void main(String[] args) {
        int arr[]={3,4,0,4,0,56,0,67};
        int n=arr.length;
        int j=0;  // here ulta aahe thoda rather than seperating zeros seperate nonzeroes and make them go ahead
        for(int i=0;i<=n-1;i++){
                
                if(arr[i]!=0){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    j++;
                }
                // else{
                //     --j;
                //     int temp=arr[j];
                //     arr[j]=arr[i];
                //     arr[i]=temp;
                // }
            }
            System.out.println(Arrays.toString(arr));
        }
        
    }











// n^2 timecomplexity
    // public static void main(String...args){
    //     int arr[]={1,23,0,0,4,54};
    //     //! movinf all zeroes to the end
    //     int n=arr.length;
    //     for(int i=0;i<n;i++){
    //         if(arr[i]==0 ){
    //             for(int j=i;j<n-1;j++){
    //                 int temp=arr[j+1];
    //                 arr[j+1]=arr[j];
    //                 arr[j]=temp;
    //             }
    //         i--;
    //         }
    //     }
    //     System.out.println(Arrays.toString(arr));
    // }

