package com.java.assignments;

public class ObjectCast {
	
	public static void main(String args[]){
	
		
	Flower f = new Flower();
	
	 f.smell();
	
	Rose r = new Rose();
	
	f= r;  // implicit casting
	
	r.smell();
	
	// explicit casting or down casting 
	
	Flower f1 = new Rose();
	
	Rose r1 = new Rose(); 
	
	r1 = (Rose)f1;
	
	r1.smell();
	
	
	
	}
	

}
