package com.java.assignments;

public class OverloadingDemo {

	public static void main(String[] args) {
	Rect_Box box1= new Rect_Box();
	Rect_Box box2=new Rect_Box();
	Rect_Box box3=new Rect_Box();
	
	box1.Box();
	box2.Box(5);
	box3.Box(2,3.45,5.4);
	
	double vol;
	
	// volume of first box
	
	vol= box1.volume();
	
	System.out.println("No parameters given for calculating the volume of the rectangle");
	
	System.out.println("the volume of first box is :: "+ vol);
	
	System.out.println("*********************");
	
	//volume of second box will different dimensions	
	vol=box2.volume();
	
	System.out.println("all the dimemnsions specified");	
			
	System.out.println("the volume of second box is::  "+ vol);
	
	System.out.println("*********************");
	
	// volume of the cube 
	
	vol=box3.volume();
	
	System.out.println(" all the dimensions are same");
	
	System.out.println("the volume of the cube is::  " + vol);
	

	}

}
