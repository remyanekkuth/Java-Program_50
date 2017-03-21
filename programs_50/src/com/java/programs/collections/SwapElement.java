package com.java.programs.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapElement {

	public void swapElement(){
		
		List<String> list = new ArrayList<String>();
		
		list.add("a1");
		list.add("a2");
		list.add("a3");
		list.add("a4");
		list.add("b1");
		list.add("b2");
		list.add("b3");
		list.add("b4");
		
		
			System.out.println("before soirting" + list);
		
		
		int n = list.size()/2 ;
		
	
		for(int i = 1 ; i < n ; i++ ){
			
			 for (int j = 0; j < i; j++) { // no. of swaps
				 
			      Collections.swap(list, n-i+2*j, n-i+2*j+1);
			      
			     // System.out.println("after sorting " + list);
			      
			    }
			
		}
		
		 System.out.println("after sorting " + list);
	}
	
	public static void main(String[] args) {
		
		SwapElement sw = new SwapElement();
		sw.swapElement();
	}

}
