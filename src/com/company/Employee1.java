package com.company;

public class Employee1 extends Employee2 {
	public void empName() {
		System.out.println("Employee Name is: Suganesh");
         this.empName();
         super.empId();
         super.empName();
	}
	public void empId() {
		System.out.println("Employee Id Is:7671");

	}
	public static void main(String[] args) {
		Employee1 h = new Employee1();
		h.empName();
	}
	

}
