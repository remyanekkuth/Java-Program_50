package com.java.programs.arrays;

public class ArraySort {

	public static void main(String[] args) {
	
		int [] num = {101,23,12,34,17,44,33,20} ;
		
		int temp;
		
		for(int i = 0 ; i < num.length ; i++)
		{
			for(int j = i+1 ; j < num.length ; j++ )
			{
				if (num[i] >  num[j])
				{
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
				
			}
			
		}
		
		//for(int i = 0 ; i < num.length ; i++)
		
		for (int element : num)	
			System.out.print("  " + element);
	
	}

}
