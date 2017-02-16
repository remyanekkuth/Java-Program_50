package com.java.arrays;



public class minIndex {

	public static void main(String[] args) {
		double [] num = { 10.3 ,  23, 25, 49.3, 56.2 ,11.57 , 234.45};
		
		// find the index of the smallest element
		
		int minIndex =0;
		
		for(int i = 1 ; i < num.length ; i++){
			
			if(num[i] < num[minIndex])
				
				minIndex = i;
					
		}
		System.out.println("the smallest number is " + num[minIndex]);
		System.out.println("the index of smallest number is :"+ minIndex);
	
		System.out.println( "-------------------------------");
		
		
	// find index of largest number
		
		int maxIndex =0 ;
		for (int j = 1; j< num.length ; j++)
		{
			if(num[j] > num[maxIndex])
				maxIndex = j;
			
		}
		System.out.println("the largest number is : " + num[maxIndex]);
		System.out.println("the index of largest number is : " + maxIndex);
	
	}

}
