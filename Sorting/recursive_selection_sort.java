import java.util.Arrays;
public class recursive_selection_sort {
	// public static void main(String...args) {
	// int[] arr= {3,43,56,24,1,11,233};
	// int strt=0;
    // select(arr,strt);
    // System.out.println(Arrays.toString(arr));
	// }
	
	// public static void select(int[] arr,int strt) {
		
	// 	if(strt==arr.length-1) {
	// 		return;
	// 	}
	// 	int min=strt;
	// 	for(int i=strt+1;i<arr.length;i++) {
	// 		if(arr[i]<arr[min]) {
	// 			min=i;
	// 		}
	// 	}
	// 	int temp = arr[strt];
	// 	arr[strt] = arr[min];
	//     arr[min] = temp;
	    
	//     // here we learnt things like
	// 	// ! 1.just we have to find the min element 
	// 	// ? 2. and pass the strt+1 in the recursion rather than doing ++ anymore
	// 	// 
	//     select(arr,strt+1);
	// 	// * lets try it by own
	// }

	public static void main(String[] args) {
		int arr[]={34,2,456,4,78,45,43};
		int start=0;
		selection_here(arr,start);
		System.out.println(Arrays.toString(arr));
	}
	public static void selection_here(int[] arr,int start){

		if(start==arr.length-1) return;
		int min=start;
		for(int i=start+1;i<=arr.length-1;i++){
			if(arr[i]<arr[min]){
				min=i;
			}
		}
		int temp = arr[start];
		arr[start] = arr[min];
	    arr[min] = temp;

		selection_here(arr, start+1);
	}

}
