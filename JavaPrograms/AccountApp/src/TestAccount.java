import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        System.out.println("Enter the Account Holder name:");
        String accName = sc.nextLine();  

        System.out.println("Enter the Account Balance:");
        double accBal = sc.nextDouble();

        System.out.println("Enter the Account type:");
        String accType = sc.next();

        // Creating an account using user input
        Account a1 = new Account(accName, accBal, accType);
        System.out.println("Account created:");
        System.out.println(a1);

      

        sc.close();  // Close the scanner 
    }
}
