package com.sivakg.examples.dp.creational.prototype;

import java.util.List;

public class MainPrototype {

	public static void main(String args[]) throws CloneNotSupportedException {
		StudentDAO studentDAO=new StudentDAO();
		
		List<Student> mList=studentDAO.clone();
		mList.add(new Student(4, "R"));
		List<Student> list=studentDAO.getStudentList();
		System.out.println(list);
		
		 
		System.out.println(mList);
	}
}
