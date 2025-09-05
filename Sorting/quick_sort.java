
import java.util.Arrays;

// import java.util.Arrays;
// public class quick_sort {
//     public static void main(String[] args) {
//         int arr[]={2,45,23,76,89,587,4,1,0};
//         quick_sort(arr,0,arr.length-1);
//         System.out.println(Arrays.toString(arr));
//     }
//     public static void quick_sort(int[]arr,int left,int right){
        

//         if(left <right){
//             int pivot=partition(arr,left,right);
//             quick_sort(arr, left, pivot-1);
//             quick_sort(arr, pivot+1, right);
//         }
        
//     }

//     public static int partition(int[] arr,int left,int right){
//         int pivot=arr[left];
//         int low=left+1;
//         //! lets just analyse thinsg and try it one more time
//         while(true){
            
//             while(low<=right && arr[low]<=pivot){
//                 low++;
//             }
//             while(low<=right && arr[right]>pivot){
//                 right--;
//             }
//             if(low<=right){
                
            
//             // swap left to right
//                 int temp=arr[low];
//                 arr[low]=arr[right];
//                 arr[right]=temp;
//             }
//             else{
//                 break;
//             }
//         }
//         // finally swap left to pivot 
//             int temp=arr[left];
//             arr[left]=arr[right];
//             arr[right]=temp;
        
//             return right;

//     }
// }
                


//! sam to try it by own ok

//?   quick sort it is
public class quick_sort{
    public static void main(String[] args) {
        int arr[]={3,45,21,78,233,8,0,1,2};
        quick_sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quick_sort(int []arr,int low,int high){
        if(high>low){
            int pivot=partition(arr,low,high);
            quick_sort(arr, low, pivot-1);
            quick_sort(arr, pivot+1, high);
        }
    }
    public static int partition(int arr[],int left,int right){
        int pivot=arr[left];
        int low=left+1;

        while(true){

            while(low<=right && arr[low]<pivot){
                low++;
            }
            while(low<=right && arr[right]>=pivot){
                right--;
            }
            if(low<=right){   //*  and bro here the logic of the right left is not enough as it is the swap of the normal one ook
                // swap the smaller and grt at places
                int temp=arr[right];
                arr[right]=arr[low];
                arr[low]=temp;
            }
            else{
                break;
            }
        }
            // swap the pivot with the mid
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            return right;
    }

    //!  got it in try 2
}
