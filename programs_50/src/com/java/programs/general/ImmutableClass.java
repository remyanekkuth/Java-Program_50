package com.java.programs.general;

public class ImmutableClass {

	//final variable 
	
	final int ID_NUM ;
	
	// can give value inside constructor
	
	public ImmutableClass() {
		
		ID_NUM = 1234;
	}
	
	// final variable cannot be reassigned
	
	public final void test (){
		
		final String name = "MARY";
		System.out.println("id is : " + ID_NUM);
		System.out.println("my name s " + name);
	}
	
	public static void main(String[] args){
		
		ImmutableClass immute = new ImmutableClass();
		
		immute.test();
		
	
	}

}
