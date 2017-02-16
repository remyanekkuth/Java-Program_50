package com.java.assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListAndSet {

	
	public void arrayList(){
		
		List<Integer> array = new ArrayList<Integer>(); 
		
		// adding to arraylist
		
		array.add(10);
		array.add(20);
		array.add(30);
		array.add(20);
		array.add(null);
		array.add(45);
		array.add(10);
		
		System.out.println("the array list created is :: [ " + array + " ]");
		
		// retrieving the data using for loop
		/*
		for(Integer a1: array)
			System.out.println(a1);
		*/
		
		 
		 // retrieving the data using iterator
		
		Iterator<Integer> it = array.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
		
		//printing size of the array
		
		System.out.println("the size of the array is now :" + array.size());
		
		// retrieving an element from array
		
		System.out.println(array.get(3));
		
		//removing the elements
		
		
		array.remove(3); // removing with index
		
		array.remove(new Integer (20)); // removing the object,returns boolean
		
		
		System.out.println("now the array size is : " + array.size());
		
		System.out.println("the array list created is :: [ " + array + " ]");
		
	
	}
	
	public void linkedList(){
		
		List<String> llist = new LinkedList<>();
		
		
		// add data to linkedlist
		
		llist.add("one");
		llist.add("hello");
		llist.add("two");
		llist.add("hi");
		llist.add("abcd");
		llist.add("one");
		llist.add(null);
		llist.add(null);
	
		System.out.println("the list is ::  [ " +  llist + " ]" );
		//System.out.println(llist.clone());
		
		//iterator
		
		Iterator<String> lit = llist.iterator();
		
		while (lit.hasNext())
			System.out.println(lit.next());
			
		
		// new collection list
		List<String> llist1 = new LinkedList<>();
		
		
		// add data to linkedlist
		
		llist1.add("on");
		llist1.add("he");
		llist1.add("two");
		llist1.add("hi");
		llist1.add("people");
		llist1.add("alex");
		llist1.add(null);
		llist1.add(null);
		
		// retrieve the data
		
		Iterator<String> lit1 = llist.iterator();
		
		while (lit1.hasNext())
			System.out.println(lit1.next());
			
		// remove the data from the list
		
		System.out.println("size of list is :: " + llist.size());
		
		
		System.out.println(llist.remove(new String("abcd")));
		
		System.out.println(llist.remove(2));
		
		System.out.println(llist.addAll(llist1));
		
	//	System.out.println(llist.removeFirst()); // only for linked list
	//	System.out.println(llist.removeLast()); only for linked list
	
		
		System.out.println("the size oif list is now ::  " +  llist.size());
		
		System.out.println(llist.removeAll(llist1));
		
		System.out.println("the size oif list is now ::  " +  llist.size());
		
		
		}
	
	
	public static void main(String[] args) {
		ListAndSet ls = new ListAndSet();
	// 	ls.arrayList();
		ls.linkedList();

	}

}
