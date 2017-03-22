package com.java.programs.exception;

public class ChildClass extends ParentClassException {
	
	public void exception()	throws  ArithmeticException {
		
		System.out.println("exception is handled");
	}
	
	public static void main(String [] args){
		
		ParentClassException par  = new ChildClass();
		
		try{
		
			par.exception();
		}catch(Exception e){
			
			System.out.println(e);
		}
	}
	
}
