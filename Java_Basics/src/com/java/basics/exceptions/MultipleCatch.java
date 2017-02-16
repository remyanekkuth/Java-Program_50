package com.java.basics.exceptions;

public class MultipleCatch {

	public static void main(String[] args) {
		try{
		
			int i =args.length;
			System.out.println("i="+ i);
			int j=42/i;
			int k[]= {1};
			k[42]=99;
		}catch(ArithmeticException e){
			System.out.println("/ by zero error " + e);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("array index out of bound" + e);
		}
		System.out.println("after try and catch trials");
	}

}
