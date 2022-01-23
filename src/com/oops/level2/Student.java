package com.oops.level2;

// when you extend a class this is call inheritance
// the top level of inheritance is call a super class
// the level(s) below the top level are called sub classes
public class Student extends Person {
	private String collegeName;
	private int year;

	public Student(String name) {
		super(name);
		System.out.println("Student Constructor");
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
