package com.java.programs.string;

public class SubstringAndReplace {

	public static void main(String[] args) {
		
		String input = "hello welcome to the world of programming. The aim of this programming is to understand the concepts of java.";
		String str = new String(input);
		String sub = "programming";
		String change = "practicing";
		String out = "";
	
		int i = str.indexOf(sub); 
	    int j = str.lastIndexOf(sub );
	 /*  //  System.out.println(j);
		
	    while(i != -1){
			
			if(i!= -1)
			{
				 out = out + str.substring(0,i);
				out=  out + change;
				
				out = out + str.substring((i+ sub.length()),j);
				
				
				 out = str.substring(0, i) + change + str.substring((i + sub.length()),j) +  change + str.substring(j + sub.length());
			}
			break;
		}
		System.out.println(out);*/
	    
	    
	    //using replace method
	    
	    while(i >= -1){
			
			if( i != -1){
				
				out = out + str.replace(sub, "practicing") ;
			}	
			break;
		}
		System.out.println(out);
	
	
	}
}


