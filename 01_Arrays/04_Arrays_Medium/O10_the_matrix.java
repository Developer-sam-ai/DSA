import java.util.Arrays; 

public class O10_the_matrix {
    // public static void main(String...args){
    //     int hello[][]={{1,1,1},{1,0,1},{1,1,1}};
    //     System.out.println(Arrays.deepToString(hello));
    //     int target=1;
    //     // int row=0;
    //     // int columb=0;

    //     for(int i=0;i<=hello.length-1;i++){
    //         for (int j=0;j<=hello[1].length-1;j++){
    //             if(i==target || j==target){
    //                 hello[i][j]=0;
    //             }
    //         }
    //     }
    //     System.out.println(Arrays.deepToString(hello));
    // }
    //~ here we have seelcted  a target but in leet its not giving me any target so  its a bad choice to add

    public static void main(String[] args) {
        int [][] mat={
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };
        Setzeroes(mat);
    }

    public static void Setzeroes(int[][] mat){
        int row=mat.length;
        int colmn=mat[0].length;

        boolean[] rowZero=new boolean[row];
        boolean[] colZero=new boolean[colmn];

        // System.out.println(Arrays.deepToString(mat));

        for(int i=0;i<=row-1;i++){
            for(int j=0;j<=colmn-1;j++){
                if(mat[i][j]==0){
                    rowZero[i]=true;
                    colZero[j]=true;
                }
            }
        }
        for (int i=0;i<=row-1;i++){
            for(int j=0;j<=colmn-1;j++){
                if(rowZero[i] || colZero[j]){
                    mat[i][j]=0;
                }
            }
        }
        System.out.println(Arrays.deepToString(mat));
    }





}





