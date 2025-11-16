public class recursion_1 {
	public static int sum=1;
	public static void main(String...args) {
		
		NnumbersSum(5);
		System.out.println(sum);
	}
	public static int NnumbersSum(int N) {
        if(N>1){
        sumofn(N);
        }
        return 0;
    }
    public static int sumofn(int N){
    	if(N>1) {
        sum+=N;
        return sumofn(N-1);
        }
    	else {
    		return 0;
    	}
    }
}
