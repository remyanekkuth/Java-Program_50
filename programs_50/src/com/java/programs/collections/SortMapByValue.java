package com.java.programs.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortMapByValue {

	public void sortValue(){
	
		// treemap for key value pairs
		
	Map<Integer , String> tree = new TreeMap<Integer, String >();
	
	tree. put(1 , "java");
	tree.put(2 , "python");
	tree.put(3 ,"ruby ");
	tree.put(4 , "abacus");
	tree.put(7 , "cobol");
	

	// retrieve entries set from treemap
		
	Set<Entry<Integer , String>> mapEntry = tree.entrySet();

	// convert entry set to list 	
	
	List<Entry<Integer,String>> list = new LinkedList<Entry<Integer,String>>(mapEntry);
		
	// sort list using collections.sort
	
	Collections.sort(list , new MyComparator());
		
		
	// iterationg after sort by value
		
		for(Map.Entry<Integer,String> entry : list){
			System.out.println(entry.getKey() + " ::: " + entry.getValue());
		}
		
	}

	

	public static void main(String[] args) {
		
		SortMapByValue sm = new SortMapByValue();
		sm.sortValue();
	}

}
