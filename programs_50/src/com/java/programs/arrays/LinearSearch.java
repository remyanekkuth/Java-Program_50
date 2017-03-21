package com.java.programs.arrays;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		
		
		System.out.println("enter the elements");
		
		String []  series = new String [6];
		
		for(int j = 0; j < series.length ; j++){
		
			series [j] = scan.next();
		}
		System.out.println("enter search word");
		
		String search = scan.next() ;
		
		boolean result=false;
		
		for(int i = 0 ; i < series.length ; i++)
		{
		
			if(search.equals(series[i]))
			{
				System.out.println("the word " + search + " is found at " + (i+1));
				result = true;
				break;
			}
			
		}
		if(result == false)
		{
			System.out.println("the word is not found");
		}	
	}

}
