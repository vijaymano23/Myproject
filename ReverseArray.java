package org.arrays;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String args[]) {
		int[ ] arr= {12,23,4,5,4,55,66,77};
//		 for(int i=arr.length-1;i>=0;i--){
//			 System.out.print(" "+arr[i]+" ");
//			
//		}
		int left=0;
		int right=arr.length-1;
		while(left<right) {
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		System.out.println("The array reverse is :"+Arrays.toString(arr));
	}

}
