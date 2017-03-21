package com.java.programs.string;

// implementing hashcode and equals 

public class Employee {

	private int id;
	private String name ;
	private String address ;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress(){
		return address ;
		
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override 
	
	public int hashCode(){
		return id;
		
	}
	
	@ Override
	public boolean equals(Object o){
		Employee emp  = null ;
		
		if(o instanceof Employee )
		{
			 emp = (Employee)o ;
		}
		if((null != emp) && (this.id == emp.id) && (this.name == emp.name) || (this.address == emp.address)){
			
			return true ;
		}
		
		
		return false;
		
		
	}
}
