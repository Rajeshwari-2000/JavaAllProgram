import java.util.Scanner;  
 class AddDigits {  

public static void main(String args[])  { 
 
int n, digit, sum = 0;  

Scanner sc = new Scanner(System.in); 
 
System.out.print("Enter the number: ");  

n = sc.nextInt();  

while(n > 0)  

{  

//finds the last digit of the given number    
digit = n % 10;  

//adds last digit to the variable sum  
sum = sum + digit;  

//removes the last digit from the number  
n = n / 10;  

}  

//prints the result  
System.out.println("Sum of Digits: "+sum);  

}  

}  
