package org.arrays;

public class Average {
	public static void main(String args[]) {
		int[] arr= {23,33,4,5,4,33,55,66,5};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		int total=arr.length;
		int avg=sum/total;
		System.out.println("The average of the given number is:"+avg);
	}

}
