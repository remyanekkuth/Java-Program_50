package com.java.programs.arrays;

import java.util.Scanner;

public class LocateAndswap {

	public static void main(String[] args) {
		
		// int [] numbers = {1, 2, 3, 8, 5, 9, 7, 6, 4 };
		
		Scanner scan  = new Scanner(System.in);
		
		int [] numbers =  new int [6];
		
		System.out.println("enter the elements");
		
		for(int i = 0; i < 6 ; i++)
			
		{
			numbers[i]= scan.nextInt();
		}
		
		int temp = 0;
		
		for (int i = 0; i < numbers.length; i++)
		{
			for(int j = i ; j < numbers.length - 1 ; j++ )
			{
				if(numbers[j + 1] < numbers[j])
				{
					
					temp = numbers[j];
					
					numbers[j] = numbers[j+1];
					
					numbers[ j + 1] = temp;
					
				}
					
			}
			
		}
		for (int element : numbers)	
			System.out.print("  " + element);
	}

}
