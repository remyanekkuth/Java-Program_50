package com.java.assignments;

public class StaticFinalDemo {

	public static void main(String[] args) {
		
		Employee  emp=new Employee();
		
		emp.emp_ID=1472;
		
		Employee.salary=120000.00;
		
		Employee.display();
		emp.emp_details();

		emp.tax();
		
		}

}
