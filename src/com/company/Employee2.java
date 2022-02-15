package com.company;

public class Employee2 extends Employee3 {
	public void empName() {
		System.out.println("Employee Name Is:Ganesh");

	}
	public void empId() {
		System.out.println("Employee Id Is:7672");
		super.empName();
		super.empId();

	}
	public static void main(String[] args) {
		Employee2 j = new Employee2();
		j.empName();
	}

}
