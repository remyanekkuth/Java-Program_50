package com.java.programs.collections;

import java.util.Comparator;
import java.util.Map;

// comparator for sort by value


public class MyComparator implements Comparator<Map.Entry<Integer, String>> {

	 public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
		 
		 return (o1.getValue()).compareTo(o2.getValue());
}
	
    }


