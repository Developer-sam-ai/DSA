public class O4_search_in_rotatedsoted {
    // public static void main(String...args){
//         int arr[]={4,5,6,7,1,2,3};
    //~ if we want to make things we just search them left and right
//         int target=9;
//         boolean first=binary1_left(arr, target);
//         boolean second=second_left(arr, target);
//         boolean finale=false;
//         if(first==true || second==true){
//             finale=true;
//         }
//         System.out.println(finale);
//     }

//     public static boolean  binary1_left(int[]arr,int target){
//         int low=0;
//         int high=arr.length-1;
//         boolean got=false;
//         while(high>=low){
//             int mid=(high+low)/2;
//             if(arr[mid]==target){
//                 got=true;
//                 high=mid-1;
//             }
//             else if(arr[high]>=target){
//                 low=mid+1;
//             }
//             else{
//                 high=mid-1;
//             }
//         }
//         return got;
//     }

//     public static boolean second_left(int arr[],int target) {
//         int low=0;
//         int high=arr.length-1;
//         boolean got=false;
//         while(high>=low){
//             int mid=(high+low)/2;
//             if(arr[mid]==target){
//                 got=true;
//                 low=mid+1;
//             }
//             else if(arr[high]>=target){
//                 low=mid+1;
//             }
//             else{
//                 high=mid-1;
//             }
//         }
//         return got;
//     }






public static void main(String[] args) {
    int arr[]={2,3,4,5,1};
    int target=1;
    int low=0;
    int high=arr.length-1;
    boolean valu=false;

    while(high>=low){
        int mid=(high+low)/2;
        if(arr[mid]>arr[low]){
            valu=true;
            high=mid-1;
        }
        else if(arr[mid]<arr[high]){
            valu=true;
            low=mid+1;
        }
        else{
            high--;
            low++;
        }
        if(arr[mid]==target){
            valu=true;
        }
    }
    System.out.println(valu);
}
}


