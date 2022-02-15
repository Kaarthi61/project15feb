package com.company;

public  class AbstractClass1 extends AbstractClass2 {

	@Override
	public void empName() {
		System.out.println("Employee Name Is:Sasi");
		
	}

	@Override
	public void empId() {
		System.out.println("Employee Id Is:7675");
		super.empName();
		super.empId();
		
		
		
	}
	
	

	}


