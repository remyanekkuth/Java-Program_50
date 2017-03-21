package com.java.programs.oops;

public class Overload{

	double depth;
	double width ;
	double height ;
	
	public void Overload(){
		
		width = -1;
		height = -1;
		depth = -1;
		System.out.println("no dimensions specified for this method");
		
	}
	public void Overload(double dim){
		
		width = depth = height = dim ;
		System.out.println("one parameter is specified as dimension");
	}
	
	public void Overload(double w , double h , double d){
		
		width = w;
		height = h ;
		depth = d; 
		
		System.out.println("three dimensions are specified ");
	}
	
	public double volume(){
		
		return width * height * depth ; 
	}
}
