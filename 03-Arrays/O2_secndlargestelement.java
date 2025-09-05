public class O2_secndlargestelement{
    public static void main(String[] args) {
        int arr[]={34,4,45,2,12,1,23,8,65};
        int secndamx=Integer.MIN_VALUE;
        int max=Integer.MIN_VALUE;
        // int index=0;

        for(int i=0;i<arr.length;i++){
        // ^ current can be i
            if(arr[i]>max /*secndamx<arr[i]*/){  //!0 it is the unused condition
                secndamx=max;
                max=arr[i];
                
            }
            if( arr[i]<max && arr[i]>secndamx){
                secndamx=arr[i];
            }
        
    }
    System.out.println(secndamx);
}
}
