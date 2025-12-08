public class O3_Count_square_Sum {
    public static void main(String[] args) {
        int n=12;
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                int sr=(i*i)+(j*j);
                int sqrt=(int)Math.sqrt(sr);
                    if(sqrt*sqrt==sr && sqrt<n){
                        count+=2;
                    }
                
            }
        }
        System.out.println(count);
    }
}
