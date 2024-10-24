package com.demo.service;

public class ArrayService {
	
	public static int findMax(int[] arr){
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	
	public static int findMin(int[] arr){
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
	
	public static int findSecondMax(int[] arr) {
		int max=arr[0],xmax=0;
		///1
		for(int i=1;i<arr.length;i++) { //n
			if(arr[i]>max) {  //{30,12,13,11,2,4,12};
				xmax=max;
				max=arr[i];
			}  //1
			if(arr[i]>xmax && arr[i]<max) {
				xmax=arr[i];
			} //1
		}  //2n
		return xmax;  //1   
		
		//1+2n+1=2(n)+2 ---> O(n)
		
	}
	
	public static int test(int[] arr) {
		int a=arr[0];   //1
		for(int i=0;i<arr.length;i++) {  //1
			if(a>=0)
				 return a;   //1
		}
		return -1; //1
	}  // 1+1+1 =3   O(1)

	public static int findPrimeSum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(isPrime(arr[i])) {
				System.out.println("data"+arr[i]);
			    sum=sum+arr[i];
			}
		}
		return sum;
	}

	private static boolean isPrime(int num) {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0)
				 return false;
		}
		return true;
	}

	public static int sequentialSearch(int[] arr, int val) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==val) {
				return i;
			}
		}
		return -1;
	}
}
