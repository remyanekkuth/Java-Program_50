package com.java.basics.wrapper;

public class BoxingAndUnboxing {

	public static void main(String[] args) {
		
		Integer x=5; // boxes into integer
		x = x+10;   //unboxes integer to int
		System.out.println("output is " + x);
		
		// returns byte primitive data type
		
		System.out.println(x.byteValue());
		
		// returns double type 
		System.out.println(x.doubleValue());
		
		//returns long primitive data type
		
		System.out.println(x.longValue());
		
		//use of compareTo 
		
		System.out.println();
		
	}

}
