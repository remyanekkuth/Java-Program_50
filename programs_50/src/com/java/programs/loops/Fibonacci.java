//a. Write a program that prints a fibonaci series that is a sequence of numbers like0 1 1 2 3 5 8.

package com.java.programs.loops;

public class Fibonacci {

	public static void main(String[] args) {
		
		// number of element to generate series
		
		int n=25,i;
		int[] num = new int[n];
		
		// initialise the first two elements in series
		
		num[0]=0;
		num[1]=1;
		
		
		for(i = 2 ;i < n; i++){
			
			num[i]= num[i-1]+ num[i-2];
		}
		
		// printing of the series
		
		System.out.println("print the fibonacci series till  : " + n );
		
		for(i = 0; i < n; i++){
			
			System.out.print(num[i]+ " ");
		}
		
	}

}
