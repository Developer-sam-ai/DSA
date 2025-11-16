public class O5_buy_sell_stocks {
    // public static void main(String[] args) {
    //~ we will buy when the number is min and sell when its max
    // int min=arr[0];
    // int max=0;
    // for(int i=0;i<=arr.length-1;i++){
        // if(arr[i]>max){
        //     max=arr[i];
        //     // you sell at this point
        // }
        // if(arr[i]<min){
        //     min=arr[i];
        //     //you buy at this point
        // }
        // int profit=max-min;
        // System.out.println(min+" "+max);
        // ~ the catch here is buy ke bad hi sell hoga na
    // }
    //     int index=0;
    // for (int i=0;i<=arr.length-1;i++){
    //     if(arr[i]<min){
    //         min=arr[i];
    //         index=i;
    //     }
    // }
    // for(int i=index;i<=arr.length-1;i++){
    //         if(arr[i]>max){
    //             max=arr[i];
    //         }
    // }
    // int profit=max-min;
    // System.out.println(profit);
        
// }



public static void main(String[] args) {
    int arr[]={2,4,1};
    int maxprofit=0;
    int min=arr[0];
    for (int i=0;i<=arr.length-1;i++){
        if(min>arr[i]){
            min=arr[i];
        }
        else{
            int profit=arr[i]-min;
            if(profit>maxprofit){
                maxprofit=profit;
            }
        }
    }
    System.out.println(maxprofit);
}
}
