// public class O3_find_first_last{
//     public static void main(String[] args) {
//         int arr[]={5,7,7,8,8,10};
//         int low=0;
//         int high=arr.length-1;
//         int target=8;
//         int first=-1;
//         int second=-1;
//         while(high>=low){
//             int mid=(low+high)/2;
//             if(arr[mid]==target){
//                 first=mid;
//                 high=mid-1;
//             }
//             if(arr[mid]==target){
//                 second=mid;
//                 low=mid+1;
//             }
//             else if(arr[mid]>target){
//                 high=mid-1;
//                 if(arr[mid]==target){
//                     first=mid;
//                 }
//             }
//             else{
//                 low=mid+1;
//                 if(arr[mid]==target){
//                     second=mid;
//                 }
//             }
//         }
//         System.out.println("["+first+","+second+"]");
//     }
// }



//~ it was just make two groups and then make it happen for binary search

