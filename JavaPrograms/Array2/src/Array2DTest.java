import java.util.Scanner;

public class Array2DTest {
	
	
	public static void acceptData(int[][]arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++) 
			{
				System.out.print("enter number"+i+","+j+"---->");
				arr[i][j]=sc.nextInt();
			}
		}
		
	}
	
	
	
		public static void displayData(int[][]arr) {
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[i].length;j++)
				{
					System.out.println(arr[i][j]+"\t");
				}
				System.out.println();
			}
	
		}
		
		
		
		public static int  AddAllNumbers(int[][]arr) {
			int sum=0;
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[i].length;j++)
				{
		
		           sum+=arr[i][j];
				}
			}
			return sum;
		}
		
		
		
		public static int[] addrowwise(int[][]arr) {
			int[]sumarr=new int[arr.length];
			for(int i=0;i<arr.length;i++) 
			{
				for(int j=0;j<arr[i].length;j++)
				{
					sumarr[i]+=arr[i][j];
				}
				
			}
			return sumarr;
		}
		
		
		
		public static int[] addcolumnswise(int[][] arr) {
			int[] sumarr=new int[arr[0].length];
			for(int i=0;i<arr[0].length;i++) 
			{
				for(int j=0;j<arr.length;j++)
				{
					sumarr[i]+=arr[j][i];    
				}
			}
			return sumarr;
		}
		
		public static int findMaximum(int[][] arr) {
	        int max = arr[0][0]; // Start with the first element
	        for (int[] row : arr) {
	            for (int num : row) {
	                if (num > max) {
	                    max = num; 
	                }
	            }
	        }
	        return max; 
	    }

}
