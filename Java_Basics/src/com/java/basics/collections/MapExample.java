package com.java.basics.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {
	
	public void mapBasics(){
		
		Map<Integer,String> map = new HashMap<>();
		
		map.put(101,"remya");
		map.put(102, "rohan");
		map.put(109, "som");
		map.put(296, "first");
		map.put(109, "sudha");
		map.put(null, "sahya"); // key as null
		map.put(1334, null);
		map.put(2348556, "remya");
		map.put(34599, null); // value as null
		
		
		// iterate a map
		
		for( Map.Entry<Integer, String> mapEntry :  map.entrySet())
			System.out.println("key :: " + mapEntry.getKey() +  "  value :: " + mapEntry.getValue());
			 
		
		//System.out.println(map.get(new Integer(109)));
	
	}
		public void linkedHash(){
			
			
		Map<Integer,String> map1 = new LinkedHashMap<>();
		
		
		map1.put(101,"remya");
		map1.put(102, "rohan");
		map1.put(109, "som");
		map1.put(296, "first");
		map1.put(109, "sudha");
		map1.put(null, "sahya"); // key as null
		map1.put(1334, null);
		map1.put(2348556, "remya");
		map1.put(34599, null); // value as null
		
		Set<Integer > keys = map1.keySet();
		
		for(Integer k : keys)
			System.out.println("key  :: " + k  + " value ::" + map1.get(k));
		}
		
	
	public void treeSample(){
		
		Map<Integer, String > tree = new TreeMap<Integer, String>();
		tree.put(101,"remya");
		tree.put(102, "rohan");
		tree.put(109, "som");
		tree.put(296, "first");
		tree.put(109, "sudha");
	//	tree.put(null, "sahya"); // key as null
		tree.put(1334, null);
		tree.put(2348556, "remya");
		tree.put(34599, null); // value as null
		
		// iterate using keySet()
		
		
		/*Set<Integer>  key = tree.keySet();
		
		for ( Integer k: key)
			System.out.println(" key ::" + k + " value :: " + tree.get(k)) ;
	*/
	
		for(Map.Entry<Integer, String> tr : tree.entrySet())
		
		System.out.println("key is " + tr.getKey() + "   " + tr.getValue());
			
	}
	
	
	
	public static void main(String[] args) {
		
		
	MapExample me = new MapExample();
	//me.mapBasics();
	//me.linkedHash();
	me.treeSample();
	

	}

}
