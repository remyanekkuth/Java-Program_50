package com.java.basics.exceptions;

public class NestTry {

	public static void main(String[] args) {
		
	
		try{
			
			int a= args.length;
			System.out.println("a is " + a);
			int b= 42/a;
			System.out.println("b is " + b);
		
		
		try{
			
			if (a==1)
				
				a= a/(a-a);
				
			if (a==2){
				int c[]={1};
				c[42]=99;
				
			}
		
		}catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("array out of bound exception" + e);
			}
		}catch(ArithmeticException e){
				
				System.out.println("divided by zero " + e);
			}
			
	}
	
}


