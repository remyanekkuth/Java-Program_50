package com.java.basics.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class CollectionDemo {

	public void collectionExample(){
		
		// creating list 
		int i;
		List<String>  firstList = new ArrayList<String>();
		
		firstList.add("one");
		firstList.add("two");
		firstList.add("three");
		firstList.add("abc");
		firstList.add(null);
		firstList.add(null);
		
		// normal for loop
		/*for(i=0;i<firstList.size();i++){
			
			System.out.println(firstList.get(i));
		}
		
		// enhanced for loop
		
		for(String f1:firstList){
			System.out.println(f1);
		}
		*/
		
		// Iterator in collection
		
		Iterator<String> iter = firstList.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
		
		/*System.out.println(firstList.get(1));
		System.out.println(firstList.remove(2));
		System.out.println(firstList.size());
		System.out.println(firstList.isEmpty());
		System.out.println(firstList.contains("one"));
		System.out.println(firstList.equals(firstList));
		System.out.println(firstList.add("abc"));
		*/
		System.out.println("the size of array is "+firstList.size());
		if(firstList.contains("one")){
			System.out.println(firstList.remove(0));
	}
		System.out.println("the size of array is now " + firstList.size());
	}
	
	public void List(){
		
	List <Integer> list = new ArrayList<Integer>() ;
	
	list.add(20);
	list.add(15);
	list.add(40);
	/*if (list.contains(15)){
		//list.remove(new Integer(15));
		System.out.println(list.remove(1));
	}
	System.out.println(list.size());
	
	}\
	*/
	List <Integer> list1 = new ArrayList<Integer>() ;
	
	list1.add(30);
	list1.add(15);
	list1.add(50);
	
	list.addAll(list1);
	System.out.println(list.size());
	System.out.println(list.get(5));
	list.containsAll(list1);
		
		System.out.println("" + list.hashCode());
		
	
	}
	
	public void vectorExample(){
		
		Vector <String> vec = new Vector<String>(5,3);
		System.out.println("capacity is " + vec.capacity());
		vec.add("my");
		vec.add("me");
		vec.add("mine");
		vec.add("min");
		vec.add("one");
		System.out.println("capacity is " + vec.capacity());
		vec.add("two");
		vec.add("three");
		System.out.println("capacity is " + vec.capacity());
		vec.add("abc");
		vec.add(null);
		vec.addElement("zero");
		vec.add("seven");
		System.out.println("capacity is " + vec.capacity());
		
		
		
		
	}
	public static void main(String[] args) {
		
		CollectionDemo col = new CollectionDemo();
		//col.collectionExample();
		//col.List();
		col.vectorExample();
	}

}
