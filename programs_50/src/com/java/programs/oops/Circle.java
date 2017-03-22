package com.java.programs.oops;

public class Circle extends Shape implements ShapeConstants {
	
	public double radius ;
	
	// constructor to set number of sides 
	
	public Circle(int num_of_sides){
		
		this.num_of_sides = num_of_sides ;
	}
	
	//get number of sides
	
	public int getNum_of_sides(){
		
		return num_of_sides;
	}
	
	
	@Override
	public double calculateArea() {
		
		return area = (PI * radius * radius );
		
	}

	@Override
	public double calculatePerimeter() {
		
		return perimeter = (2 * PI * radius ) ;
		
		
	}

	@Override
	public void setSides() {
		
		System.out.println("the number of sides of a circle is : " + num_of_sides);
	}
	
	

	public static void main(String[] args) {
		
		
		
		Circle cir = new Circle(0);
		cir.radius = 2.5 ;
		cir.calculateArea();
		cir.calculatePerimeter();
		cir.setSides();
		cir.shapeDetails();

	}

	

}
