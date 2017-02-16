package com.java.basics.oops;

public class float_areaofCircle {
	
	double radius,area;
	final double PI=3.14;

	public void area_circle(double r){
		radius=r;
		area = PI*r*r;
		
		System.out.println("area of circle is :"+ area);
		
		
	}
	public static void main(String[] args) {
		
		float_areaofCircle ar=new float_areaofCircle();
		ar.area_circle(8.3);
	}

}
