package com.java.programs.string;

import java.util.HashSet;
import java.util.Set;

public class HashAndEquals {

	public void userDefined(){
		
		
	Set<Employee> set_emp = new HashSet<Employee>();
	
	Employee e1 = new Employee();
	
	e1.setId(23);
	e1.setName("Jacob");
	e1.setAddress("pleasanton , 94588 ");
	System.out.println("e1 hashcode : " +  e1.hashCode());
	
	Employee e2 = new Employee();
	e2.setId(45);
	e2.setName("Aleena");
	e2.setAddress("pleasanton , 94588" );
	
	System.out.println("e2 hashcode : " +  e2.hashCode());
	System.out.println(("is e1 eqyals e2 :" + e1.equals(e2)));
	
	
	Employee e3 = new Employee();
	e3.setId(23);
	e3.setName("Jacob");
	e3.setAddress("FRemont CA");
	
	System.out.println("e3 hashcode : " +  e3.hashCode());
	System.out.println(("is e1 eqyals e3 :" + e1.equals(e3)));
	
	
	set_emp.add(e1);
	set_emp.add(e2);
	set_emp.add(e3);
	}
	
	
	public static void main(String[] args) {
		
		HashAndEquals he = new HashAndEquals() ;
		he.userDefined();
	}

}
