import java.util.Scanner;

public class TestPerson {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice =0;
		do {
			System.out.println("1.Add new person\n2.Delete by Id\n3.Search by id\n4.Search by name\n5.Display All\n6.Modify Mobile number\n7.exit\nChoice");
			choice=sc.nextInt();
			switch(choice){
			
			case 1:
				PersonService.addNewPerson();
				break;
				
			case 2:
				System.out.println("Enter the id toi Delete");
				int id=sc.nextInt();
				boolean status=PersonService.deleteById(id);
				if(status) {
					System.out.println("Delete Successfully...");
				}else
				{
					System.out.println("Not Found...");
				}
				break;
				
				
			case 3:
				System.out.println("Enter the id and search");
				id=sc.nextInt();
				Person P=PersonService.getById(id);
				if(P!=null)
				{
					System.out.println(P);
				}else
				{
					System.out.println("not found...");
				}
				break;
				
			case 4:
				System.out.println("Enter the name to search");
				sc.nextLine();
				String pname=sc.nextLine();
				Person[] arr=PersonService.getByname(pname);
				if(arr!=null) {
					for(Person p1:arr) {
						if(p1!=null) {
							System.out.println(p1);
						}else {
							
						}
					}
				}
				break;
				
			case 5:
				arr=PersonService.displayAll();
				for(Person p2:arr) {
					if(p2!=null) {
					   System.out.println(p2);   
						
					}
				} 
				break;
				
				
			case 6:
				System.out.println("enter id to change mobile");
				id=sc.nextInt();
				System.out.println("enter new mobile number");
				String mob=sc.next();
				 status=PersonService.modifyMobNo(id,mob);
				if(status) {
					System.out.println("updated successfully");
				}else {
					System.out.println("not found");
				}
				
				break;
			case 7:
				System.out.println("Thank you for visiting....");
				sc.close();
				break;
			default:
				break;	
				
			}
		
		}while(choice!=7);
	
	}
}
