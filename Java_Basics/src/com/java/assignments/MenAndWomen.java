package com.java.assignments;

public class MenAndWomen extends Human_Override{
	
	public MenAndWomen(){
		
		System.out.println("Hello, there are two classes for humans");
		super.sleep();
		}
	
	@Override
	
	void move(){
		
		System.out.println("Both men and women can run, jump,walk etc");
	}
	
	@Override
	
	void eat(){
		
		System.out.println("Some humans are vegetarian");
		super.eat();
	}
}
