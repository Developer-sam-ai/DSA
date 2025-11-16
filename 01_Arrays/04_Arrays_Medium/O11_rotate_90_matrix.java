import java.util.Arrays;
public class O11_rotate_90_matrix {
//     public static void main(String[] args) {
//         int [][]mat={
//             {1,2,3},
//             {4,5,6},
//             {7,8,9}
//         };
//         rotate(mat);
//     }

//     public static void  rotate(int [][] mat){
//         int row=mat.length;
//         int column=mat[0].length;
//         int p=0;
//         int []stock=new int[row*column];
//         for(int i=0;i<=row-1;i++){
//             for(int j=0;j<=column-1 ;j++){
//                 stock[p]=mat[i][j];
//                 p++;

//             }
//         }
//         System.out.println(Arrays.toString(stock));
//         int newwe[]=new int[row*column];
//         int select=stock.length-row;
//         for(int i=0;i<=newwe.length-1;i++){
//             newwe[i]=stock[select];
            
//         }
        
//         System.out.println(Arrays.toString(newwe));
//     }



public static void main(String[] args) {
    int [][]mat={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int n=mat.length;
        for(int i=0;i<=n-1;i++){
            for(int j=i;j<=n-1;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }

        for(int i=0;i<=n-1;i++){
            int left=0,right=n-1;
            while(left<right){
                int temp=mat[i][left];
                mat[i][left]=mat[i][right];
                mat[i][right]=temp;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.deepToString(mat));
}



}
