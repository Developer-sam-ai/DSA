public class O10_Max_consecutive {
    // ^ to find the maximum {Salag} elements 
    // ! we must save the max in other variable

    // public static void main(String[] args) {
    //     int arr[]={1,1,0,1,1,1};
    // int count=0;
    // int maxit=0;
    // for(int i=0;i<=arr.length-1;i++){
    //     if(arr[i]==1){
    //         count=count+1;
    //         // System.out.println(count);
    //     }
    //     else if(arr[i]==0){
    //         // maxit=count;
    //         count=0;
    //     }
    //     else{
    //         count++;
    //     }
    //     maxit=count;
    // }
    // System.out.println(maxit);
    // }

    public static void main(String...args){
        int arr[]={1,1,0,1,1,1};
        int count=0;
        int max=0;
        for (int i=0;i<=arr.length-1;i++){
            if(arr[i]==1){
                count++;
            }
            else{
                max = Math.max(max, count);
                count=0;
                }
            }
            max=count;
            System.out.println(max);
        }
        
    }
