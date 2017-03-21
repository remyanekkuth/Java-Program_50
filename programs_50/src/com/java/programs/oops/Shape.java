package com.java.programs.oops;

public abstract class Shape {
	
	protected int num_of_sides; 
	public double area ;
	public double perimeter ;
	
	public void shapeDetails(){
		
		System.out.println("this is an abstract class for shapes ");
		System.out.println("the area of given shape is :" + area);
		System.out.println("the perimeter of given shape is :" + perimeter);
		
	}
	public abstract double calculateArea();
	public abstract double calculatePerimeter();
	public abstract void setSides();
	
	
	
}
