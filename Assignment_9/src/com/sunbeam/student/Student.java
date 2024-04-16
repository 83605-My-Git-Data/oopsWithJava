package com.sunbeam.student;

public class Student {
	private int rollNo;
	private String name;
	private double marks;
	
	public Student() {
		
	}
	
	public Student(int rollNo, String name, double marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
	
	

}
