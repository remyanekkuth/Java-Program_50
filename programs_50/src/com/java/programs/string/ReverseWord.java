package com.java.programs.string;



// reverse each word in a sentence 

public class ReverseWord {
	
	public void Word_Reverse(){
		
	String st = "this is java programming" ;
	
	// spliting of input
	
	String [] word = st.split(" ");
	
	String rev_String = "" ;
	
	for(int i = 0 ; i < word.length ; i++){
		
		String split_word = word[i];
		String rev_word = "" ;
		
		for(int j = split_word.length() - 1 ; j >= 0; j--){
			
			rev_word = rev_word + split_word.charAt(j);
		}
		rev_String = rev_String + rev_word + " " ;
		
	}
	
	System.out.println(st);
	System.out.println(rev_String);
	}
	

	public static void main(String[] args) {
		
		ReverseWord rev = new ReverseWord();
		rev.Word_Reverse();

	}

}
