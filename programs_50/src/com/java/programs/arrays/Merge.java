package com.java.programs.arrays;

public class Merge {

	public static void main(String[] args) {
		
		int [] array = {3, 4, 5, 1,9} ;
		int [] array1 = { 10, 4 , 6, 2, 7};
		
		int [] result = new int[ array.length + array1.length];
		
		int counter = 0;
		for (int i = 0 ; i < array.length ; i++)
		{
			result[i] =  array[i];
			counter++;
		}	
		
		for (int j = 0 ; j <array1.length ; j++)
		{
			result[counter++] = array1[j];
				
		}	
		
		for(int element : result)
		{
			System.out.print("  " + element);
		}
	}

}
