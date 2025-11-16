package Sorting;

import java.util.Arrays;

public class recursive_bubble {
//	public static void main(String...args) {
//		int arr[]= {2,45,1,24,256,744,98};
//		bubble(arr,arr.length);
//		System.out.println(Arrays.toString(arr));
//	}
//	public static  void bubble(int[] arr,int high) {
////		bubble(arr,low);
//		if(high==1) {
//			return;
//		}
//		for(int i=0;i<high-1;i++) { 
//		  if(arr[i]>arr[i+1]) {
//			int temp=arr[i+1];
//			arr[i+1]=arr[i];
//			arr[i]=temp;
////			high++;	
//		}
//		  
//		}
//		bubble(arr,high-1);
//		
//	}
	
	
	// lets try it 2nd time by own 
	// we got this but the thing we did wrong was lwtting start by the low index and 
	// instead we must do it on high index ok sam always remeber
	
	
	public static void main(String...args) {
		int arr[]= {34,1,24,43,46,33,233,2,234};
		bubble(arr,arr.length);
		System.out.println(Arrays.toString(arr));
	}
	public static void bubble(int[] arr,int high) {
		if(high==1) return ;
		
		for(int i=0;i<high-1;i++) {
			if(arr[i]>arr[i+1]) {
				int temp=arr[i+1];
				arr[i+1]=arr[i];
				arr[i]=temp;
			}
			}
		bubble(arr,high-1);
		}
	}
	
	
	
	
	
	

