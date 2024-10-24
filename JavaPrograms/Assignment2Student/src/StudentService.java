
import java.util.Scanner;

public class StudentService {

	private static Student[]Studarr;
	private static int cnt;
	static {
		Studarr=new Student[10];
		Studarr[0]=new Student(1,"Rajeshwari","5846978545",52,84,64);
		Studarr[1]=new Student(2,"Riya","9846978545",54,88,44);
		
		cnt=2;
	}
	
	
		public static void AddNewStudent()
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter new Id");
			int SId=sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("enter the name");
			String Sname=sc.next();
			
			System.out.println("Enter the mobile Number");
			String MobNo=sc.next();
			
			System.out.print("Enter marks for M1: ");
	        float m1 = sc.nextFloat();
	        
	        System.out.print("Enter marks for M2: ");
	        float m2 = sc.nextFloat();
	        
	        System.out.print("Enter marks for M3: ");
	        float m3 = sc.nextFloat();
			
	        Student newStudent = new Student(SId, Sname, MobNo, m1, m2, m3);
	        Studarr[cnt] = newStudent; 
	        cnt++; 
	        System.out.println("Student added successfully.");
	    }
			
			
		
		
		public static Student[] displayAll() {
			return Studarr;
		}
		
		
		
		  public static Student getById(int id) {
	        for (Student s : Studarr) {
	            if (s != null && s.getSId() == id) {
	                return s;
	            }
	        }
	        return null;
	    }
		
		public static Student[] getBysname(String Sname) {
			
			Student[] arr=new Student[Studarr.length];
			int count=0;
			for(Student s:Studarr) {
				if(s!=null) {
					if(s.getSName().equals(Sname)) {
						arr[count]=s;
						count++;
					}
				}else {
					break;
				}
			}
			if(count>0) {
				return arr;
			}else {
				return null;
			}
		}
		
		
		
		public static boolean modifyName(int id,String name) {
			
			Student s=getById(id);
			if(s!=null) {
				s.setSName(name);
				return true;
			}
			return false;
		}
		
		
		public static boolean deleteById(int id) {
		    for (int i = 0; i < cnt; i++) {
		        if (Studarr[i].getSId() == id) {
		            for (int j = i; j < cnt - 1; j++) {
		                Studarr[j] = Studarr[j + 1];
		            }
		            Studarr[cnt - 1] = null; 
		            cnt--;
		            return true;
		        }
		    }
		    return false;
		}

		
		public static void CalculateAvg(int id) {
		        Student s = getById(id);
		        if (s != null) {
		            float avg = (s.getM1() + s.getM2() + s.getM3()) / 3;
		            System.out.println("Average marks for student ID " + id + ": " + avg);
		        } else {
		            System.out.println("Student not found.");
		        }
			}
		}



