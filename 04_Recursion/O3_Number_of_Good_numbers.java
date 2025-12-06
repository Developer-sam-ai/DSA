public class O3_Number_of_Good_numbers {
    public static void main(String[] args) {
        Solution s=new Solution();
        int ans=s.countGoodNumbers(4);
        System.out.println(ans);
    }
}

class Solution{
    public final long MOD=1_000_000_007L;
    public int countGoodNumbers(long n){
        long evencount=(n+1)/2;
        long oddcount=(n)/2;

        long part1=modPOw(5,evencount);
        long part2=modPOw(4,oddcount);

        return (int)((part1*part2)%MOD);
    }
    public long modPOw(int base,long expo){
        if(expo==0) return 1;
        long value=modPOw(base, expo/2);
        long result=(value*value)%MOD;
        if(expo%2==1){
            result=(result*base)%MOD;
        }
        return result;
    }
}