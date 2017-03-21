package com.java.programs.string;

// print a string this is nice as this1 is2 nice3

public class StringReplace {

	public static void main(String[] args) {
		
		String s1="this is nice"; 
		
		String[] words=s1.split("\\s");//splits the string based on whitespace  
		
		for(int i = 0 ; i < words.length  ; i++){
			
			String word = words[i];
			
			String	 w = word + (i+1);
			
			
			System.out.print(w + " ");
			
		}
			
		
	}

}
