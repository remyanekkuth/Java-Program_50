package com.java.basics.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public void linkedList(){
		
		LinkedList<String> list= new LinkedList<String>();
		list.add("we");
		list.add("he");
		list.add("he");
		list.add("she");
		list.add("me");
		list.add("see");
		list.addLast("hello");
		list.addFirst("this");
		
		System.out.println(list.clone()); // returns all the objects
		System.out.println(list.element()); // retrieves the head element not removes
		System.out.println(list.getFirst()); // returns the first element
		System.out.println(list.isEmpty());  // check whether the list is empty
		System.out.println(list.add("welcome"));
		System.out.println(list.getLast());
		System.out.println(list.indexOf("me"));
		System.out.println(list.offer("java")); //add specified element to the tail of the list
		System.out.println(list.peek()); // retrieves but not removes the head element. if no such element returns null
		System.out.println(list.poll()); // retrieves and removes the tail element
		System.out.println(list.pop()); // removes from stack representation of this list. means remove first element from the list
		
	}
	
	public void linkedListSample(){
		
		List<String> list= new LinkedList<String>();
		list.add("we");
		list.add("he");
		list.add("he");
		list.add("she");
		list.add("me");
		list.add("see");
		
		
	//	list.addLast("hello");
		//list.addFirst("this");
		
		//System.out.println(list.clone()); // returns all the objects
		//System.out.println(list.element()); // retrieves the head element not removes
		//System.out.println(list.getFirst()); // returns the first element
		System.out.println(list.isEmpty());  // check whether the list is empty
		System.out.println(list.add("welcome"));
		//System.out.println(list.getLast());
		System.out.println(list.indexOf("me"));
		//System.out.println(list.offer("java")); //add specified element to the tail of the list
		//System.out.println(list.peek()); // retrieves but not removes the head element. if no such element returns null
		//System.out.println(list.poll()); // retrieves and removes the tail element
		//System.out.println(list.pop()); // removes from stack representation of this list. means remove first element from the list
		
	}
	public static void main(String[] args) {
	
		LinkedListDemo li =new LinkedListDemo();
	//	li.linkedList();
		li.linkedListSample();
		
	}

}
