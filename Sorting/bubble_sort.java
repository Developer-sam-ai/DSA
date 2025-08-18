package Sorting;

import java.util.Arrays;
//don donn palti is known as bubble sort
public class bubble_sort {
    public static void main(String...args) {
    	int nums[]= {2,3,5,456,12,1,23,234};
   	 for(int i=0;i<=nums.length-1;i++){
            for (int j=i+1;j<=nums.length-1;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    
    
    // it is very simple 
}
