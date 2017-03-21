

// Overriding exmple  -- class triangle

package com.java.programs.oops;

public class Triangle extends Rectangle {

	Triangle(double a, double b) {
		
		super(a ,b);
		
	}
	@Override
	public double area(){
		System.out.println("****************************");
		System.out.println("this is overrided method ");
		System.out.println("area of triangle : " );
		return len * wid/2 ;
	}

}
