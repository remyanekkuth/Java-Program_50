/*Write a program that swaps 2 given numbers. You need to have 2 separate functions in the program.
     	 --> One Function should swap the numbers without any third new variable.
      	 --> Second function should swap the numbers using a third variable.
 */

package com.java.programs.loops;

import java.util.Scanner;

public class numberSwap {

	
	public void numSwapWithVariable(){
		
		System.out.println("swapping of numbers with third variable ");
		
		int x,y,temp;
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the  numbers : " );
		
		x = key.nextInt();
		y = key.nextInt();
		
		System.out.println("before swapping : " + x + " ," + y);
		
		temp = x;
		x = y;
		y = temp ;
		
		System.out.println("after swapping : " + x + "  , " +  y);
		
	}
	
		
	// function to swap the numbers without third variable
	
	
	public void numSwapWithoutVariable(){
		
		System.out.println("swapping of numbers without third variable");
		int x , y ;
		Scanner key = new Scanner(System.in);
		System.out.println("Enter the numbers : " );
		x = key.nextInt();
		y = key.nextInt();
		
		System.out.println("before swapping : " + x + " ," + y);
		
		x = x + y; 
		y = x - y; 
		x = x - y; 
		
		System.out.println("after swapping : " + x + " ," + y);
		
	}	
	public static void main(String[] args) {
		
		numberSwap  swap = new numberSwap();
		
		swap.numSwapWithVariable();
		
		System.out.println(" ********************** " );
		 
		swap.numSwapWithoutVariable();
	}

}
