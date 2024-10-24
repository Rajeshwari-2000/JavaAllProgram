//Write a program to accept 5 numbers from user and find sum of all numbers which are eith divisible 
//by 5 or 3 or 11

import java.util.Scanner;

class Number{
public static void main(String[]args)
{
 Scanner sc=new Scanner(System.in);
 int sum=0;
for(int i=0;i<5;i++){
System.out.println("Enter the number");
int n=sc.nextInt();
if((n%5==0) ||(n%3==0)||(n%11==0)){
sum=sum+n;
}
}
System.out.println("Sum is:"+sum);
sc.close();
}
}