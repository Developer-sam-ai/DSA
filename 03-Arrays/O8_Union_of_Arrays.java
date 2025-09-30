
// import static java.lang.System.out;
// import java.util.Arrays;
// public class O8_Union_of_Arrays {
    // public static void main(String...args){
    //     int A[]={1,2,3,4,5,6,7,8};
    //     int B[]={1,2,4,5,6,67};
    //     // int max=Math.max(A.length,B.length);
    //     int hash[]=new int[10];
        
    //     //! union refers to the unique in both arrays just will try to make it O(n)
    //     // int S=Math.min(A.length,B.length);
    //     // System.out.println(S);
    //     // for(int i=0;i<=S-1;i++){
            
    //     // }
    //     for(int i=0;i<=A.length-1;i++){
    //         hash[A[i]%10]=+1;
    //         // System.out.println(Arrays.toString(hash));
    //     }
    //     for(int j=0;j<=B.length-1;j++){
    //         hash[B[j]%10]+=1;
    //     }
    //     System.out.println(Arrays.toString(hash));
    //     for(int k=0;k<=hash.length-1;k++){
    //         if(hash[k]==1){
    //             System.out.println("unique elements are "+k);
    //         }
    //     }
    // }
    //! we can try a approach like as when we have the different number then push in the other list and if it exist it in the list dont push 

//     public static void main(String[] args) {
//     int A[]={1,3,4,6,7,8,3,4,5};
//     int B[]={34,2,13,5,45,6,3,1};

//     int hash[]= new int[20];
    
//     for(int i=0;i<=A.length-1;i++){
//         hash[i]=A[i];
//     }
//     for(int j=0;j<=B.length-1;j++){
//         for(int k=0;k<=hash.length-1;k++){
//             if(hash[k]==B[j]){
//                 hash[k]=0;
//             }
//         }
//     }
//         out.println(Arrays.toString(hash));
//     }
// }                                         //* waste try */




