package com.java.programs.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_Array {

	public void arrayList(){
		
		List<String> array_list = new ArrayList<String>();
		
		// adding list of element to arraylist
		
		array_list.add("this");
		array_list.add("is");
		array_list.add("to");
		array_list.add("practice");
		array_list.add("collection list");

		// search for an element 
		
		boolean con = array_list.contains("this");
		
		if(con == true){
			
			System.out.println("the index of this is  :" + array_list.indexOf("this"));
		}
		
		
	//iterate using iterator
		
		Iterator<String> it = array_list.iterator();
		
		while(it.hasNext()){
			
			System.out.println(it.next());
		}
		
		System.out.println("list in reverse order : ........................");
		
		
		// iterate in reverse order using list iterator 
		
		ListIterator<String> lit = array_list.listIterator(array_list.size());
		
		while(lit.hasPrevious()){
			
			System.out.println(lit.previous());
		}
		
		System.out.println(".....................................");
		
		// copy to array 
		
		System.out.println("this is to copy arraylist element to array");

		String [] arr = new String[array_list.size()];
		
		arr = array_list.toArray(arr);
		
		for(int i = 0 ; i<arr.length ; i++ ){
		
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
	List_Array la = new List_Array();
	la.arrayList();
	
	
	}

}
