// overriding example  -- class rectangle

package com.java.programs.oops;

public class Rectangle {

	double len ;
	double wid ;
	
	Rectangle(double a , double b){
		
		len = a;
		wid = b;
		
	}
	
	public double area(){
		System.out.println("the area of rectangle : " );
		return len * wid ;
	}
}
