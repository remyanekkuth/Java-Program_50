package com.java.programs.general;

public class PrintWithoutLoops {

	public void Using_Recursion(int i ){
		
		if(i <= 10)
		{
			System.out.println(i);
			
			Using_Recursion(i + 1);
		}
		
	}
	public static void main(String[] args) {
		
		PrintWithoutLoops print = new PrintWithoutLoops();
		
		print.Using_Recursion(1);
	}

}
