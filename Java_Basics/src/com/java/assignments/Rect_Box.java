package com.java.assignments;

public class Rect_Box {

	double width;
	double height;
	double depth;
	double length;
	
	// constructor with no dimensions
	
	public void Box(){
		
		width=-1;
		height=-1;
		depth=-1;
		
	}
	
	// constructor with all the dimensions specified
	
	 public void Box(double w, double h, double d){
		
		width=w;
		height=h;
		depth=d;
		
		}
	
	// constructor when cube is created
	
	public void Box(double l){
		
		width=height=depth= l;
	}
	
	
	// volume of the box
	public double volume(){
		
		return width*height*depth;
	
		
	}

	
}
