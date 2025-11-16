public class O2_floor_ceil {
    public static void main(String[] args) {
        int arr[]={2, 4, 6, 8, 10, 12, 14};
        int target=1;
        int low=0;
        int high=arr.length-1;
        int floor=-1;
        int ceil=-1;
        while(high>=low){
            int mid=(low+high)/2;
            if(target==arr[mid]){
                floor=ceil=arr[mid];
                break;
            }
            else if(target>arr[mid]){
                floor=arr[mid];
                low=mid+1;
            }
            else{
                ceil=arr[mid];
                high=mid-1;
            }
        }
        System.out.println("your ceil is "+ceil+" your floor is "+floor);
    }
}

// we just failed to initialize all with -1 inded al are doing same work of just storing the ceil andf the floor in the 
// just we know and dry run 

