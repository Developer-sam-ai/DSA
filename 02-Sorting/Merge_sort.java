

public class Merge_sort {
//	static int arr[]= {1,2,23,32,4,3,45,5,56};
//    public static void main(String...args) {
//	   int low=0;
//	  int high=arr.length-1;
//	  divide(low,high);
////	  System.out.println(Arrays.toString(arr));
//    }
//       
//    public static void divide(int low,int high) {
//      if(high>low) {
//      int mid=(int)(high+low)/2;
//      divide(low,mid);
//      divide(mid+1,high);
//      merge(arr,low,mid,high);
//      System.out.println(Arrays.toString(arr));
//      
//      }
//    }
//    public static void merge(int[] arr,int low,int mid,int high) {
//    	int right=mid+1;
//    	int left=low;
//    	while(left<=mid && right<=high) {
//    		if(arr[left]<arr[right]) {
//    			left++;
//    		}
//    		else {
////    			arr[mid-1]=arr[mid];
//    			// agar left shift kar rahe ho to usko mat right bhejo left ke elemts right bhejo
//    			
//    			// here we did a major mistake that we didnt loop things 
//    			int j=arr[right];
//    			int index=right;
//    			while(left<index) {
//    				arr[index]=arr[index-1];
//    				index--;
//    			}
//    		
//    		arr[left]=j;
//    	    right++;
//    	    left++;
//    	    mid++;
//    		}
//    		// low will control it kaha tak jayega
//    	}
//    	
//   }
    
      // try 2 lets go
	
	
// 	public static void main(String...args) {
// 		 int arr[]= {4,5,1,2,4};
// 		 //# merge sort it is
//   		 int low=0;
//   		 int high=arr.length-1;	
//   		 divide(arr,low,high);
//   		 System.out.println(Arrays.toString(arr));
// 	}
//     public static void  divide(int[]arr,int low,int high){
//     	if(high>low) {
//     		int mid=(low+high)/2;
//     		divide(arr,low,mid);
//     		divide(arr,mid+1,high);
//     		merge(arr,low,mid,high);
//     		System.out.println(Arrays.toString(arr));
//     	}
//     }
//     public static void merge(int[] arr,int low,int mid,int high) {
//     	int left=low;
//     	int right=mid+1;
    	
//     	while(left<=mid && right<=high) {
//     	if(arr[left]<=arr[right]) {
//     		left++;
//     	}
//     	else {
//     		int j=arr[right];
//     		int index=right;
    		
//     		while(left<index) {
//     			arr[index]=arr[index-1];
//     			index--;
//     		}
//     		arr[left]=j;
    		
//     		mid++;
//     		left++;
//     		right++;
//     	}
//     	}
//     }
 
    
    public static void main(String[] args) {
		int arr[]={34,5,343,67,1,3443,9,56,0};
		// ^ present you merge sort 
		divide(arr,0,arr.length-1);
	}

	public static void divide(int arr[],int low,int high){
		if(high>low){
			int mid=(high+low)/2;
			divide(arr,low, mid);
			divide(arr,mid+1, high);
			merge(arr,low,mid,high);
		}
	}
	public static void merge(int[]arr,int low,int mid,int high){
		int left=low;
		int right=mid+1;
		while(left<mid && right>mid){
			if(arr[left]==arr[right]){
				right++;
			}
			else{
				int i=arr[right];
				int j=right;
				while(left<j){
					
				}
			}
		}
	}
}






