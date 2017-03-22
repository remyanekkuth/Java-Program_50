package com.java.programs.arrays;

import java.util.Scanner;

// find common number in any two given arrays

public class CommonNumber {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the elements of first array");
		
		double [] array1 = new double[5];
		
		for(int i = 0 ; i < 5 ; i++)
		{
			
			array1[i]= scan.nextDouble();
			
		}
		
		System.out.println("enter the elements of second array");
		
		double [] array2 = new double [5];
		
		for(int i = 0 ; i < 5 ; i++)
		{
			
			array2[i]= scan.nextDouble();
			
		}
		boolean common = false;
		
		for(int x = 0 ; x < array1.length ; x++)
		{
			for (int y = 0 ; y <array2.length; y++)
			{
				if(array1[x]==array2[y])
				{
					common = true;
					System.out.println("the common element is : " + array1[x]);
					break;
				}
			}
		}
		if(common == false)
			System.out.println(" there is no common element ");
	}

}
