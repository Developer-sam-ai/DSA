public class O3_sorted_or_not{
    public static void main(String[] args) {
        //? we have to think of rotation as well if we can rotate the array and make it sorted then its fine
        int a[]={3,4,5,1,2};
        // int b[]=Arrays.copyOf(a, a.length);
        //! it actually sorted eith rotation 1 
        int count=0;
        // Arrays.sort(b);
        // ^ lets now only focus on how we can tell is the array is sorted or not that roation part is juat a condiiton ok

        for(int i=0;i<a.length-1;i++){
        if(a[i]>a[i+1]){
                System.out.println("unsorted");
                count++;
        }
    }
        if(a[a.length-1]>a[0]){
                count++;
            }
        
        System.out.println(count);
    }
}