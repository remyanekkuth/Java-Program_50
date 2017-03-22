package com.java.programs.collections;

import java.util.HashSet;
import java.util.Set;

public class Duplicate_Set {

	public void  duplicate(){
		
		
		String [] arr = {"ab" , "bc" , "ac" ,"bc" , "ab"};
		
		boolean isDuplicate = false;
		
		Set<String > set = new HashSet<String>();
	
	
		
		for(String s : arr){
			
			if(!set.add(s)){
				
				isDuplicate = true ;
				
				System.out.println("duplicate is :" + s);
				
			}
		
		}
	}
	public static void main(String[] args) {
		Duplicate_Set dup = new Duplicate_Set();
		dup.duplicate();
	}

}
