
import java.util.Arrays;

public class hard_problem {
	public static void main(String...args) {
		int arr[]= {1,2,4};
		int k=5;
		int hash[]=new int[arr.length];
		Arrays.sort(arr);
		int left=0;
		int right=arr.length-1;
		
		for(int i=left;i<=arr.length;i++) {
			for(int j=right;j>0;j--) {
				
			}
		}
		
//		for(int i=0;i<=arr.length-1;i++) {
//		for(int j=1;j<=k;j++) {
//			if(arr[i]!=max) {
//			arr[i]=arr[i]+1;
//			}
//		}
//		}
		System.out.println(Arrays.toString(arr));
	}
}
