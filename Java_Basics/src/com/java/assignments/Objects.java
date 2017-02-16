package com.java.assignments;

public class Objects {
	public String object_name;
	String type;
	public int object_id;
	
	//default constructor
	public Objects(){
		
		System.out.println("Default constructor for Objects class");
		
	}
	//parameterised constructor
	
	public Objects(String greet){
	
		System.out.println("Hello Welcome to the --"+ greet);
		
	}

	public void setName(String name){
		object_name=name;
	}
	
	
	public void displayDetails(){
		System.out.println("the name of the object is : " + object_name);
		System.out.println("the type of the object is : "+ type);
		System.out.println("The id is : "+  object_id);
		
		
	}
}
