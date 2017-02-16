package com.java.assignments;

public class Employee {
	
	int emp_ID;
	static double salary;
	final String DEPT_ID="SALES"; 
	public final float TAX_RATE=12;
	
	public Employee(){
		
		System.out.println("this is an example for static and final keywords in java ");
	}
	
	public static void display(){
		
		System.out.println("Hello world");
		
	}
	
	public void tax(){
		
		double tax_result =(salary* TAX_RATE)/100;
		System.out.println("the tax for an employee is ::"+ tax_result);
		
		
	}
	void emp_details(){

		System.out.println("the employee ID is ::" + emp_ID);
		System.out.println("the salary of the employee is ::"+salary);
		System.out.println("dept id is ::"+ DEPT_ID);
		
			
	}
	
	

}
