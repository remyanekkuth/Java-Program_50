package com.java.programs.oops;

public class OverrideDemo {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(5, 6.3);
		Triangle tri = new Triangle(3.2, 5);
		double ar ;
		
		ar = rect.area();
		System.out.println("area is : " + ar);
		ar = tri.area();
		System.out.println("area  is : "+ ar);
	}

}
