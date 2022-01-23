package com.oops.level2;

public class EmployeeRunner {

	public static void main(String[] args) {
		Employee employee = new Employee("Jason");


		employee.setEmail("jason@udemy.com");
		employee.setPhoneNumber("123-456-7890");
		employee.setEmployeeGrade('A');
		employee.setTitle("Programmer Analyst");

		System.out.println(employee);


	}

}
