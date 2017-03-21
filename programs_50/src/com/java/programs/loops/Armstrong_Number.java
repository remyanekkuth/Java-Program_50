package com.java.programs.loops;

public class Armstrong_Number {

	public static void main(String[] args) {

	int n = 153 , i , sum =  0;
	int temp = n;
	
	while(n != 0)
	{
		
		i = n % 10 ;
		sum = sum + (i * i * i ) ;
		n = n / 10 ;
	 
	}
	
	if ( temp == sum)
		
		System.out.println("the number is armstrong number ");
	else
		System.out.println("this number is not armstrong ");
	}

}
