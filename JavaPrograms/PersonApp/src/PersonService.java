import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PersonService {
private static Person[]perarr;
private static int cnt;
static {
	perarr=new Person[10];
	perarr[0]=new Person(1,"Rajeshwari","9598548545",new Date(2000,01,27));
	perarr[1]=new Person(2,"Aishwarya","8549756125",new Date(2001,03,2));
	perarr[2]=new Person(3,"Priya","9875641237",new Date(2000,11,16));
	cnt=3;
}


public static void addNewPerson() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter id");
	int perid=sc.nextInt();
	sc.nextLine(); // to remove \n from scanner buffer
	System.out.println("enter name");
	String pname=sc.nextLine();
	System.out.println("enter mobile");
	String MobNo=sc.next();
	System.out.println("Enter birthdate(dd/MM/yyyy)");
	String bdate=sc.next();
	
	//to convert String to Date
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	Date dt=null;
	try {
		 dt=sdf.parse(bdate);
	} catch (ParseException e) {
		e.printStackTrace();
	}
	perarr[cnt]=new Person(perid,pname,MobNo,dt);
	cnt++;
}

public static Person[] displayAll() {
	return perarr;
}

public static Person getById(int id) 
{
	for(Person p:perarr)
	{
		if(p!=null) 
		{
			if(p.getPerid()==id)
			{
				return p;
			}
		}else
         {
			return null;
		}
}

return null;
}


public static Person[] getByname(String pname) {
	Person[] arr=new Person[perarr.length];
	int count=0;
	for(Person p:perarr) {
		if(p!=null) {
			if(p.getPname().equals(pname)) {
				arr[count]=p;
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


public static boolean modifyMobNo(int id,String mob) {
	Person p=getById(id);
	if(p!=null) {
		p.setMobNo(mob);
		return true;
	}
	return false;
}

public static boolean deleteById(int id) {
	for(int i=0;i<cnt;i++) {
		if(perarr[i].getPerid()==id) {
			//shift objects one location to left to delete
			for(int j=i;j<cnt;j++) {
				perarr[j]=perarr[j+1];  
			}
			cnt--;
			return true;
		}
		
	}
	return false;
}


}
