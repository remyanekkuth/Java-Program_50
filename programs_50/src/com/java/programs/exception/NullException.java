package com.java.programs.exception;

// NullPOinterexception and avoid it using try catch finally 

public class NullException {

	public static void main(String[] args) {
		
		String str = null ;
		
		try{
			
			if (str.equals("john")){
			
			System.out.println("both strings are same");
		}
		else {
			System.out.println("these twp strings are unequal");
	     }
			
		}
		catch(NullPointerException e){
			
			System.out.println("null pointer exception will be thrown ");
		}
		
		finally{
			
			System.out.println("change the if condition to eliminate the exception");
			
			if("john".equals(str)){
				
				System.out.println("both strings are same");
			}
			else {
				System.out.println("not same ");
			}
		}

	}

}
