package org.arrays;

import java.util.Arrays;
import java.util.Collections;

public class AscAndDsc {
	public static void main(String args[]) {
//		int arr[]= {65,45,34,23,5,65,66,44};
//		Arrays.sort(arr);
//		System.out.println("The ascending order is:"+Arrays.toString(arr));
//		//dscending order
//		Arrays.sort(arr,Collections.reverseOrder());
		int arr[]= {65,45,34,23,5,65,66,44};
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				
			}
		}
		}
		System.out.println("The ascending order is:"+Arrays.toString(arr));
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("The descending ordere is:"+Arrays.toString(arr));
	}

}
