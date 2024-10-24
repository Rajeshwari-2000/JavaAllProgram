package com.demo.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.demo.beans.Course;

public class CourseDaoImpl implements CourseDao {


	static Map<String,Course> hm;
	static{
		hm=new HashMap<>();
		hm.put("DAC", new Course("DAC",10000.00,200,300));
		hm.put("DBDA", new Course("DBDA",15000.00,100,250));
	}


	@Override
	public boolean save(Course c) {
		Course c1=hm.putIfAbsent(c.getCname(), c);
		if(c1==null)
			return true;
		return false;
	}

	@Override
	public boolean deleteByName(String cname) {
		Course c1=hm.remove(cname);
		if(c1!=null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean modifyByName(String cname, int capacity, int duration) {
		Course c=hm.get(cname);
		if(c!=null) {
			c.setDuration(duration);
			c.setCapacity(capacity);
			return true;
		}
		return false;
	}

	@Override
	public boolean displayByName(String cname) {
		return false;
	}

	@Override
	public List<Course> FindByDuration(int duration1) {
		Set<String> s=hm.keySet();
		List<Course> clst=new ArrayList<>();
		for(String s1:s) {
			Course c=hm.get(s1);
			if(c.getDuration()>duration1) {
				clst.add(c);
			}

		}
		if(clst.size()>0) {
			return clst;
		}

		return null;
	}

	@Override
	public List<Course> sortByDuration() {
		List<Course> lst=new ArrayList<>();
		Comparator<Course> c=(c1,c2)->{
			System.out.println("in compare method of comparator "+c1.getCname()+"----"+c2.getCname());
			return c1.getDuration()-c2.getDuration();};
			Set<String> cset=hm.keySet();
			for(String course:cset) {
				lst.add(hm.get(course));
			}
			lst.sort(c);
			return lst;
	}

	@Override
	public Map<String, Course> sortByName() {
		Map<String,Course> tm=new TreeMap<>();
		Set<String> s=hm.keySet();
		for(String s1:s) {
			tm.put(s1,hm.get(s1));

		}
		return tm;
	}

	@Override
	public Map<String, Course> getAll() {

		return hm;
	}

}
