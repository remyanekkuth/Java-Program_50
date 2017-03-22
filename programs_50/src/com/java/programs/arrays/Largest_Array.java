package com.java.programs.arrays;

public class Largest_Array {

	public static void main(String[] args) {
		
		double [] arr = {12, 30, 45, 47.43, 69, 123, 11, 90.2, 56 } ;
		
		double big_num = arr[0] ;
		
		
		for( int i = 1 ; i < arr.length ; i++){
			
			if(arr[i] > big_num){
				
				big_num = arr[i];
				
			}
			
		}
		
		System.out.println("the largest number is  : " + big_num);
	}

}
