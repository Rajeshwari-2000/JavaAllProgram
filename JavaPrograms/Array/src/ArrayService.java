 import java.util.Scanner;
public class ArrayService {

		  //accept values and store it in the array
			public static void acceptData(int[] arr) {
				 Scanner sc=new Scanner(System.in);
				for(int i=0;i<arr.length;i++) {
			    	System.out.println("enter number");
			    	arr[i]=sc.nextInt();
			    }
				
			}
			//display values of the array
			public static void displaydata(int[] a) {
				for(int i=0;i<a.length;i++) {
			    	System.out.println(i+":"+a[i]);
			    	
			    }
			}
			
			//search the number and returns the position if found, otherwise 0
			public static int searchNumber(int [] arr,int s) {
				for(int i=0;i<arr.length;i++) {
					if(arr[i]==s)
						return i;
					
				}
				return -1;
			} 
			
			public static int addAllEvenNumbers(int[] arr) {
				int sum=0;
				for(int n:arr) {
					if(n%2==0)
						sum=sum+n;
				}
				return sum;
			}
			
			private static boolean checkprime(int num) {
				for(int i=2;i<num;i++) {
					if(num%i==0) {
						return false;
					}
				}
				return true;
			}
			
			public static int[] findAllPrimeNumbers(int[] arr) {
				int[] primearr=new int[arr.length];
				int cnt=0;
				for(int n:arr) {
					boolean ans=checkprime(n);
					if(ans) {
						primearr[cnt]=n;
						cnt++;
					}
				}
				if(cnt>0) {
					return primearr;
				}
				return null;
			}
			
	}

