import java.util.Scanner;

class AddNumber{

public static void main(String[]args){

 System.out.println("Add numbers");

Scanner sc=new Scanner(System.in);

int sum=0;
System.out.println("Enter the number");
for(int i=0;i<10;i++){
int n=sc.nextInt();



sum=sum+n;
}
System.out.println("The addition is:"+sum);

sc.close();
}

}