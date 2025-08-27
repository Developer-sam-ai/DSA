package Sorting;
import java.util.Arrays;

public class recursive_selection_sort {
	
	public static void main(String...args) {
	int[] arr= {3,43,56,24,1,11,233};
	int strt=0;
    select(arr,strt);
    System.out.println(Arrays.toString(arr));
	}
	
	public static void select(int[] arr,int strt) {
		
		if(strt==arr.length-1) {
			return;
		}
		int min=strt;
		for(int i=strt+1;i<arr.length;i++) {
			if(arr[i]<arr[min]) {
				min=i;
			}
		}
		int temp = arr[strt];
		arr[strt] = arr[min];
	    arr[min] = temp;
	    
	    
	    select(arr,strt+1);
		
	}
}
