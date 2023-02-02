package com.sivakg.examples.dp.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO implements Cloneable{
	
	private List<Student> list=new ArrayList<>();
	
	public StudentDAO() {
		
		list.add(new Student(1,"Siva"));
		list.add(new Student(2,"Pragatheeswaran"));
		list.add(new Student(3,"Pranav"));
		
	}
	
	public List<Student> getStudentList(){
		return this.list;
	}
	
	@Override
	protected List<Student> clone() throws CloneNotSupportedException {
		  List<Student> cList=new ArrayList<>();
		  for(Student s:list) {
			  cList.add(s);
		  }
		  return cList;
		  
	}

}
