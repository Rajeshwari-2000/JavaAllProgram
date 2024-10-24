package com.demo.test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestBubbleSort {

	public static void main(String[] args) {
		int[]arr= {34,25,43,78,56,12,98};
		
		System.out.println("The given Array is:");
		System.out.println(Arrays.toString(arr));
		
		bubblesort(arr);

		System.out.println("The Sorted Array is:");
		System.out.println(Arrays.toString(arr));
	}

	private static void bubblesort(int[] arr) {
		int n=arr.length;
		int swapcount=0;
	 for(int i=0;i<n;i++){
		 
		 for(int j=1;j<(n-i);j++){
			 
			 if(arr[j-1]>arr[j]) {
				 
				 int temp=arr[j];
				 arr[j]=arr[j-1];
				 arr[j-1]=temp;
				 swapcount++;
				 
			 }
		 }
		 System.out.println("iteration"+(i+1)+"swapcount:"+swapcount);
		 System.out.println(Arrays.toString(arr));
		 if(swapcount==0) {
			 break;
		 }
		 swapcount=0;
	 }
		
		
	}

}
