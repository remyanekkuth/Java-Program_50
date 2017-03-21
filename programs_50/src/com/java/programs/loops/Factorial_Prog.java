package com.java.programs.loops;

import java.util.Scanner;

public class Factorial_Prog {

	 static int n;
	 
	// factorial using recursion
	public static int fact_Recursion(int n){
		
		
		if(n == 1) 
			return 1;
		
		else 
			return (n * fact_Recursion((n-1)));
		
		}
	
	// factorial without recursion
	
	public static int  fact_NonRecursion(int n){
		
		int fact = 1;
		for(int i = 1; i <= n;	i++ ){
			
			fact = fact * i ;
				
		}
		return fact;
	}
	public static void main(String[] args) {
		
		System.out.println("enter the number : " );
		
		Scanner key = new Scanner(System.in);
		
		n= key.nextInt();
		
		System.out.println("the factorial is  " + fact_Recursion(n));
		
		System.out.println(" ************ ");
		
		System.out.println("the factorial is  " + fact_NonRecursion(n));
		
		
		
		
	}

}
