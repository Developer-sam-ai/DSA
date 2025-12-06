public class O2_Pow_finding{
    public static void main(String[] args) {
        Solution s=new Solution();
        double ans=s.myPow(2.00, 10);
        System.out.println(ans);
    }
}

class Solution {
    // not accepted by leetcode 
    // public double myPow(double x, int n) {
    //     if(n==0){
    //         return 1.0;
    //     }
    //     if(n<0){
    //         return 1.0/myPow(x,-n);
    //     }
    //     return  x*myPow(x, n-1);
    // }



    // Step 2: Then recursion starts returning values up the call stack
    // fastPow(2,0) → returns 1
    // fastPow(2,1) → receives half = 1
    // n=1 (odd) → returns half * half * x = 1 * 1 * 2 = 2
    // fastPow(2,2) → receives half = 2
    // n=2 (even) → returns half * half = 2 * 2 = 4
    // fastPow(2,5) → receives half = 4
    // n=5 (odd) → returns half * half * x = 4 * 4 * 2 = 32
    // Everything is calculated on the way back.


    public double myPow(double x,int n){
        if(n==0)return 1;
        long N=n;
        if(n<0){
            x=1/x;
            N=-N;
        }
        return fastPow(x,N);
    }

    public double fastPow(double x,long N){
        if(N==0)return 1.00;

        double ans=fastPow(x, N/2);
        if(N%2==0){
            return ans=ans*ans;
        }
        else{
            return ans=ans*ans*x;
        }
        
    }
}
