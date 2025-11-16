

import java.util.Arrays;

// it basically does is divides the array in sorted and unsorted selects an element and places it correctly in order by shifting
//or we can say insert it there 
public class Insertion_sort {
	public static void main(String[]args) {
		int arr[]= {12,34,54,21,3,2,56};
		
		for(int i=1;i<arr.length;i++) {
			 int next=arr[i];
			 int j=i-1;
//			 while(next<arr[j] && j>=0) {
//			 the array index out of bound error here  as the array checks things from left the condition will be first checked and distort things so 
			 // keep the zero check first below is the list of things what actually happend and remeber nodes
			 while(j>=0 && next<arr[j]){
//				 int temp=arr[j];
//				 arr[j]=arr[j+1];
//				 arr[j+1]=temp; 
				 arr[j+1]=arr[j];
				 j--;
			}
			
			arr[j+1]=next;
	}
		System.out.println(Arrays.toString(arr));
	}
//	steps 
//	we did are we correctly divideed things up in sorted and unsorted and gave the i to 1 
//	the main thing to consider is we are not swaping i was confused by the things and we thorougly analized things 
//	the main thin happeng is 
//	yes we are repeating the elements but only a single element is repeated and by setting it equal to the next it is the perfect position 
//	and completed by swaping elements its easy 
//	
//	we are placing the element in perfect position by shifting here 
//	in the sorted array from unsorted array ok
}
