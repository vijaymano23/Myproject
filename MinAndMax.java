package org.arrays;

public class MinAndMax {
	public static void main(String args[]) {
		int[] arr= {23,34,45,6,67,56,66,2,90};
		int min =arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++)  {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("The max value is:"+max);
		System.out.println("The min value is:"+min);
	}

}
