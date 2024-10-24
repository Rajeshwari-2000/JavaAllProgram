import java.util.Scanner;

public class StudentTest {
   
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add New Student\n2. Delete Student by Id\n3. Search Student by ID\n4. Search Student by Name\n5. Display All Students\n6. Modify Name of Student\n7. Average of Marks of Student\n8. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
            
                case 1:
                   StudentService.AddNewStudent();
                    break;
                    
                    
                case 2:
                	System.out.println("Enter the id to Delete");
    				int Id=sc.nextInt();
    				boolean status=StudentService.deleteById(Id);
    				if(status) {
    					System.out.println("Delete Successfully...");
    				}else
    				{
    					System.out.println("Not Found...");
    				}
    				break;
    				
                   
                case 3:
                	System.out.println("Enter the id and search");
    				Id=sc.nextInt();
    				Student S=StudentService.getById(Id);
    				if(S!=null)
    				{
    					System.out.println(S);
    				}else
    				{
    					System.out.println(" Student not found...");
    				}
                	
                    break;
                    
                case 4:
                	System.out.println("Enter the name to search");
    				sc.nextLine();
    				String Sname=sc.nextLine();
    				Student[] arr=StudentService.getBysname(Sname);
    				if(arr!=null) {
    					for(Student s1:arr) {
    						if(s1!=null) {
    							System.out.println(s1);
    						}else {
    							
    						}
    					}
    				}
                    break;
                    
                    
                case 5:
                
                    Student[] arr1 = StudentService.displayAll();
                    for (Student s2 : arr1) {
                        if (s2 != null) {
                            System.out.println(s2);
                        }
                    }
                    break;

                	
                	
                
                case 6:
                	System.out.println("enter id to change the name");
    				Id=sc.nextInt();
    				System.out.println("enter new Name");
    				String sname=sc.next();
    				 status=StudentService.modifyName(Id, sname);
    				if(status) {
    					System.out.println("updated successfully");
    				}else {
    					System.out.println("not found");
    				}
                    break;
                    
                    
                case 7:
                    System.out.println("Enter ID to calculate average marks:");
                    int avgId = sc.nextInt();
                    Student avgStudent = StudentService.getById(avgId);
                    if (avgStudent != null) {
                        float average = avgStudent.calculateAverage();
                        System.out.printf("Average marks for %s: %.2f%n", avgStudent.getSName(), average);
                    } else {
                        System.out.println("Student not found...");
                    }
                    break;

                    
                    
                    
                case 8:
                    System.out.println("Exiting...");
                    break;
                    
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 8);
    }

}