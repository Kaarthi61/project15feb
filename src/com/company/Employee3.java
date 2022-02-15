package com.company;

public class Employee3 extends Employee4 {
	public void empName() {
		System.out.println("Employee Name Is:Hari");

	}
	public void empId() {
		System.out.println("Employee Id Is:7673"); 
		super.empName();
		super.empId();

	}

}
