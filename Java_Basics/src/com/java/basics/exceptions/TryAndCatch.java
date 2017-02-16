package com.java.basics.exceptions;

public class TryAndCatch {

	
	public static void main(String[] args) {
		int j;
		try{
			j=0;
			int i= 42/j;
			System.out.println("this will not print "+i);
			
			}
		catch(ArithmeticException e)
		{
			
			System.out.println("division by zero");
		}
		System.out.println("try and catch trial");
	}

}
