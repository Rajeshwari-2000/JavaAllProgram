import java.util.Scanner;

public class StudentdemoTest {

	public static void main(String[] args) {
	
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter Student Name: ");
	        String sname = scanner.nextLine();

	        System.out.print("Enter Address: ");
	        String address = scanner.nextLine();

	        System.out.print("Enter Marks for Subject 1: ");
	        int m1 = scanner.nextInt();

	        System.out.print("Enter Marks for Subject 2: ");
	        int m2 = scanner.nextInt();

	        System.out.print("Enter Marks for Subject 3: ");
	        int m3 = scanner.nextInt();

	        // Create a new Student object with user input
	        Student student = new Student(sname, address, m1, m2, m3);

	        // Displaying student details
	        System.out.println("\nStudent Details:");
	        System.out.println(student); // This will invoke the toString method

	        String generatedCode = generateCode(student.getSname(), student.getAddress());
	       
	        scanner.close(); // Close the scanner
		
	}

	private static String generateCode(String sname, String address) {
		// TODO Auto-generated method stub
		return null;
	}

}
