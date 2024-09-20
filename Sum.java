package org.arrays;

public class Sum {
	public static void main(String args[]) {
		int[] arr= {23,4,5,67,8,94,54};
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
