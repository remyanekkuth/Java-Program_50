package com.java.basics.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	
	void SetExample(){
		
		Set <String > firstSet= new HashSet<String>();
		
		firstSet.add("abc");
		firstSet.add("def");
		firstSet.add("doll");
		firstSet.add("abc");
		firstSet.add("null");
		firstSet.add("null");
		firstSet.add("jfhdjhjad");
		firstSet.add("jdaghkhasjhJAjdknasln");
		for( String  f1: firstSet){
			System.out.println(f1);
		
		}		
		//System.out.println("the Set is " + firstSet);
		
	/*	Iterator<String> iter = firstSet.iterator();
		
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
		System.out.println(firstSet.size());*/
		/*String[] a1= firstSet.toArray(new String[firstSet.size()]);
		for (String  i : a1)
			System.out.println("the array is "+ i);
		
	
		System.out.println(firstSet.hashCode());*/
	}
	
	public void LinkedHash(){
		
		Set<String> linked= new LinkedHashSet<String>();
		linked.add("abc");
		linked.add("def");
		linked.add("doll");
		linked.add("abc");
		linked.add("null");
		linked.add("null");
		linked.add("jfhdjhjad");
		linked.add("jdaghkhasjhJAjdknasln");
		
		for( String  f1: linked){
			System.out.println(f1);
		
		}	
		

		
	}
	
	public void treeSet(){
		
		Set<String> tree= new TreeSet<String>();
		tree.add("abc");
		tree.add("def");
		tree.add("doll");
		tree.add("abc");
		tree.add("jfhdjhjad");
		tree.add("jdaghkhasjhJAjdknasln");
		
		
		for( String  f1: tree){
			System.out.println(f1);
		
		}	
		
	}

		public static void main(String[] args) {
		
	SetDemo sd =  new SetDemo();
	//sd.SetExample();
	//sd.LinkedHash();
	sd.treeSet();
	
	}

}
