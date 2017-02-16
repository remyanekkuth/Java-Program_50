package com.java.arrays;

public class largest {

	public static void main(String[] args) {

		int [] numbers = {11 , 34 , 23 , 45 , 67 , 86 , 123 };
		
		int total = 0;
		
		// sum of elements
		for(int i = 0 ; i <numbers.length;i++)
		{
			total += numbers[i];
		}
		System.out.println("the total is : " + total);
		
		// largest number
		
		int large = numbers[0];
		
		for (int j =1; j<numbers.length ; j++){
		
			if(numbers[j] > large)
				large = numbers[j] ;
		}
		System.out.println("the largets element is : " + large);
		
		// print all the element in the array
		
		for (int element : numbers)
			
			System.out.println(element);
		
		
		
		}

}
