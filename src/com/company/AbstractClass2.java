package com.company;

public abstract class   AbstractClass2 extends AbstractClass3 {
	
	@Override
	public void empName() {
		System.out.println("Employee Name Is:Vijay");
		
	}
	@Override
	public void empId() {
		System.out.println("Employee Id Is:7676");
		super.empName();
		super.empId();
		super.empGender();

		
		
	}
	
	
	

}
