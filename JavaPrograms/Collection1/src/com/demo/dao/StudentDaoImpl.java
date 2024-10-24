package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.beans.GraduateStudent;
import com.demo.beans.MasterStudent;
import com.demo.beans.Person;
import com.demo.beans.Student;
import com.demo.comparator.MyMarksComparator;
import com.demo.comparator.MyNameComparator;


public class StudentDaoImpl implements StudentDao{
	private static List<Student> studlst; 
	static {
		studlst=new ArrayList<>();
		studlst.add(new GraduateStudent(12, "Manjiri", "Pune", LocalDate.of(2000, 01, 03), new int[] {88,87},89));
		studlst.add(new GraduateStudent(13, "Mugdha", "Pune", LocalDate.of(1999, 02, 13), new int[] {78,75},77));
		studlst.add(new MasterStudent(14, "Sahil", "Mumbai", LocalDate.of(2002, 01, 03), new int[] {88,87},"accounts","BCOM",89));
	}
	@Override
	public void addStudent(Student s) {

	}


	@Override
	public List<Student> findAllStudent() {
		return null;
	}


	@Override
	public Student findById(int id) {
		int pos=studlst.indexOf(new Person(id));
		if(pos!=-1) {
			//retrieves the student object from the given position
			return studlst.get(pos);
		}
		return null;
	}


	@Override
	public boolean removeById(int id) {
		return studlst.remove(new Person(id));
	}


	@Override
	public boolean updateMarks(int id, int newmarks) {
		Student s=findById(id);
		if(s!=null) {
			if(s instanceof MasterStudent) {
				((MasterStudent)s).setThesismarks(newmarks);
				return true;
			}else if(s instanceof GraduateStudent ) {
				((GraduateStudent)s).setSpsub(newmarks);
				return true;
			}

		}
		return false;
	}

	@Override
	public List<Student> findByMarks(int mks) {
		List<Student> lst=new ArrayList<>();
		for(Student s:studlst) {
			if(s instanceof MasterStudent) {
				if(((MasterStudent)s).getThesismarks()>mks)
					lst.add(s);
			}else if(s instanceof GraduateStudent) {
				if(((GraduateStudent)s).getSpsub()>mks)
					lst.add(s);
			}
		}
		if(lst.size()>0)
			return lst;
		else
			return null;
	}


	@Override
	public List<Student> findByName(String nm) {
		List<Student> lst=studlst.stream()
				.filter(ob->ob.getPname().equals(nm))
				.collect(Collectors.toList());
		if(lst.size()>0) {
			return lst;
		}
		return null;
	}

	@Override
	public List<Student> sortById() {
		List<Student> lst=new ArrayList<>(studlst.size());
		for(Student s:studlst) {
			lst.add(s);
		}
		lst.sort(null);
		return lst;
	}


	@Override
	public List<Student> sortByName() {
		List<Student> lst=new ArrayList<>(studlst.size());

		for(Student s:studlst) {
			lst.add(s);
		}

		lst.sort(new MyNameComparator());
		return lst;
	}

	@Override
	public List<Student> sortByMarks() {
		List<Student> lst=new ArrayList<>(studlst.size());

		for(Student s:studlst) {
			lst.add(s);
		}

		lst.sort(new MyMarksComparator());
		return lst;
	}
}
