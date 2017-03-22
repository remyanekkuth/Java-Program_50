// program to check whether number is prime or not

package com.java.programs.loops;

import java.util.Scanner;

public class Prime_Number {


	public static void main(String[] args) {
	
		boolean isPrime = true ;
		
		System.out.println("Enter the number :");
		
		Scanner keyboard = new Scanner(System.in);
		
		int num = keyboard.nextInt();
		
		
		for ( int i = 2; i <= num/2 ; i++){
			
			if (num % i == 0)
			{
				isPrime = false ;
				break;
			}	
			
		}
		if(isPrime){
			
			System.out.println(num + " is  prime " );
		}
		else
			
		{
			System.out.println(num + " is not prime ");
		}
	}
		
		

	}

