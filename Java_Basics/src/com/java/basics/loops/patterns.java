package com.java.basics.loops;

public class patterns {

	// stAr triangle 
	public static void main(String[] args) {
		
		// for rows
		
		for (int i = 1; i <= 5; i ++){
			
			System.out.println(" ");
			
			// for spaces
			
			for (int j = 4 ; j >=i ; j--)
			{
				System.out.print("");
			}
			
			// for printing star
			
			for( int k = 1; k<= (2*i - 1); k++)
			{
				System.out.print("*");
			}
		}
	
	}
	
}