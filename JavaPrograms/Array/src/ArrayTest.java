
import java.util.Scanner;

public class ArrayTest{
	
	public static void main(String[] args) {
	
	   int[] arr=new int[10];
	    int[] arr1= {23,22,44,5};//initialization
	    ArrayService.acceptData(arr);
	    ArrayService.displaydata(arr);
	    //search a number
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter number for searching");
	    int search=sc.nextInt();
		
	    int pos=ArrayService.searchNumber(arr,search);
	    if(pos!=-1) {
	    	System.out.println("number found");
	    }else {
	    	System.out.println("number not found");
	    }


	    int sum=ArrayService.addAllEvenNumbers(arr);
	    System.out.println("Additition :" +sum);
	    int[] primearr=ArrayService.findAllPrimeNumbers(arr);
	    if(primearr!=null) {
		    for(int n:primearr) {
		    	System.out.println(primearr);
		    }
	    }
	    else {
	    	System.out.println("not found any prime number");
	    }
	    sc.close();

}
}
