package Sorting;

import java.util.Arrays;
public class selection_sort {
	public static void main(String...args) {
		
		// the main thing what we do is select a array find the min and put it on the first place again shrink it find min and place it on front and so on pile it up until the end
		
		
//		int []arr= {13,4,5,3,23,55,12};
////		int min=Integer.MAX_VALUE;
//		for(int i=0;i<=arr.length-1;i++){
//			int min=arr[i];
//			int j=i+1;
//			int index=i;
//			while(j<arr.length){
//				if(arr[j]<min){
//					min=arr[j];
//					index=j;
//				}
//				j++;
//			}
//			int temp=arr[i];
//			arr[i]=arr[index];
//			arr[index]=temp;
//		}
//
//		System.out.println(Arrays.toString(arr));
		
		
		// 2nd try sam 
		
		
		int arr[]= {1,23,34,11,4,2,345,65};
		
		for(int i=0;i<=arr.length-1;i++) {
			int min=arr[i];
			int index=i;
			for(int j=i+1;j<=arr.length-1;j++) {
				if(min>arr[j]) {
					min=arr[j];
					index=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
		}
		System.out.println(Arrays.toString(arr));
		
		
		// focus step by step and rember the thing like when we set the min to the first element adn to select the whole thing we want to make a loop
		// and to always calculate the min just assign the index to i or any thing and change it when min is found then we can swap it 
		
		// we were confused between things like swapping where and main thing was our method to find min it was wrong 
		
		
//		int arr[]= {1,21,22,1,12,2,12,23,21,24};
//		for(int i=0;i<=arr.length-1;i++) {
//			int index=i;
//			int min=arr[i];
//			for(int j=i+1;j<arr.length;j++) {
//				if(min>arr[j]) {
//					min=arr[j];
//					index=j;
//				}
//			}
//			 int temp=arr[i];
//			 arr[i]=arr[index];
//			 arr[index]=temp;
//		}
//		System.out.println(Arrays.toString(arr));
	}
}
