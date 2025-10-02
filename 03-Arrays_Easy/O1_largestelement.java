public class O1_largestelement {
    public static void main(String[] args) {
        // ! to find the largest ele in array

        int arr[]={3,5,56,3,234,5,23,1};
        int max=0;
        int i=0;
        while(i<=arr.length-1){
            if(max<arr[i]){
                max=arr[i];
            }
            i++;
        }
        System.out.println("the largest element is "+max);
    }
}
