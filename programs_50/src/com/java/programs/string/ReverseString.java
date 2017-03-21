package com.java.programs.string;

import java.util.Scanner;

public class ReverseString {

	public void StringReverse(){
		
		/*
		// using stringbulider
		
		StringBuilder out = null ;
		StringBuilder sb = new StringBuilder();
		String st = "This is java programming" ;
		for(int i = st.length() - 1 ; i >= 0 ; i-- ){
			
		 out =	sb.append(st.charAt(i));
		
		
		}
		System.out.println(out);*/
		
		// using String 
		
		System.out.println("Enter the input string");
		Scanner scan = new Scanner(System.in);
		String in = scan.nextLine();
		String result = "";
		for(int i = in.length()- 1 ; i >= 0; i--){
			
			result = result + in.charAt(i);
		}
		System.out.println("the string after reverse is :\n "+ result);
		
	}
	public static void main(String[] args) {
		ReverseString rev = new ReverseString();
		rev.StringReverse();
	}

}
