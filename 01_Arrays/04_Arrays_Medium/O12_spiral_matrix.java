
import java.util.Arrays;
public class O12_spiral_matrix {
    public static void main(String[] args) {
        int [][] mat={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int []arr=new int[mat.length*mat[0].length];
        System.out.println(Arrays.toString(arr));

        int left=0;
        int right=mat[0].length-1;
        int top=0;
        int bottom=mat.length-1;
        int p=0;

        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                arr[p]=mat[top][i];
                p++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                arr[p]=mat[i][right];
                p++;
            }
            right--;

            for(int i=right;i>=left;i--){
                arr[p]=mat[bottom][i];
                p++;
            }
            bottom--;
                for(int i=bottom;i>=top;i--){
                arr[p]=mat[i][left];
                p++;
            
            left++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
