package com.java.programs.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CreateHashMap {

	public void MapBasics(){
		
	Map<Integer, String > map = new HashMap<Integer, String>();
	
	// input the key and value
	
	map.put(1 , "one");
	map.put(2,"two");
	map.put(3  , "three");
	map.put(4,"four");
	map.put(5, "five");
	
	
// iterate through the keys and vakues
	
	for(Map.Entry<Integer, String> entry : map.entrySet()){
		
		System.out.println("key :: " + entry.getKey() + " value :: " + entry.getValue());
	}

	/*Set<Integer> keys = map.keySet();
	 * 
	for(Integer key : keys){
	
		System.out.println("key :: "+ key + "value :: " + map.get(key));
	}*/
	
	
	// searching for a key and get its value
	
	if(map.containsKey(4)){
		
		System.out.println("the value of key is " + map.get(4));
		
	}
	}
	public static void main(String[] args) {
		
		CreateHashMap hash = new CreateHashMap();
		hash.MapBasics();
	}

}
