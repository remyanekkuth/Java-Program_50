package com.java.programs.string;

import java.util.Scanner;

public class PalindromeString {

	void palindrome(){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word");
		String input = scan.next();
		int i;
		String result= "";
		int flag = 0;
		for(i = input.length() -1 ; i >= 0 ; i--){
			
			result = result + input.charAt(i);
			
		
		if(result.equals(input))
		{
			 flag = 1;
			 System.out.println("the entered string is palindrome");
			}
		
		}
		if(flag!= 1){
			
			System.out.println("the entered string is not palindrome");
		}
	}
	public static void main(String[] args) {
		
		PalindromeString pal = new PalindromeString();
		pal.palindrome();
		
	}

}
