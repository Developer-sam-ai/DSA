import java.util.Arrays;
public class O6_rotateleft2{
    public static void main(String[] args) {
        //! now we gonna try our method to rotatte the things aroung the index ok
        //^ optimised method to rotate left

        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int k=1;
        k=k%n;
        for(int i=0;i<k;i++){
            for(int j=0;j<n-1;j++){
                int temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
            }
        } 
        System.out.println(Arrays.toString(arr));
    }
}




// * tried things by ahifting but gone wrong as we have tried it by swappin gbut didnt get the logic
// for(int i=0;i<=arr.length-1;i++){
        //     int h=(k+i)%n;
        //     // i just want to swap the current and the left option just will se whats happening
        //     //& swap h and h-1
        //     // while(arr[n-1]<arr[0]){
        //     int first=arr[0];
        //     if(h>0){
        //     for(int j=h;j>i;j--){
        //         arr[j-1]=arr[j];
        //     }
        //     arr[i]=arr[h];
            
        //     System.out.println(h);
        // }
        // }