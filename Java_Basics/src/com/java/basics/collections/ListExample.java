package com.java.basics.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ListExample {

	public void Array(){
		
		List<String> list = new ArrayList<String>() ;
		list.add("hello");
		list.add("welcome");
		list.add("welcome");
		list.add(3, "my");
		list.add(4, "world");
		
		//for( String f1 : list) 	System.out.println(f1);
		
		Iterator<String> it = list.iterator();
		
			while(it.hasNext()){
				
				System.out.println(it.next());
			}
			
			System.out.println(list.remove("hello"));
			System.out.println(list.remove(2));
			System.out.println(list.contains("hello"));
			System.out.println("the size is " + list.size());
			//list.clear();
			System.out.println("the size is now " + list.size());
			
			if(list.contains("welcome")){
				
				System.out.println("the index of welcome is " + list.indexOf("welcome"));
			}
			
			
			List<Integer> list1 = new ArrayList<Integer>();
			
			list1.add(10);
			list1.add(15);
			list1.add(20);
			list1.add(30);
			list1.add(30);
			list1.add(4,10);
			
			
			List<Integer> list2 = new ArrayList<Integer>();
			
			list2.add(100);
			list2.add(150);
			list2.add(200);
			list2.add(300);
			list2.add(4, 130);
			list2.add(4, 150);
		
			list2.set(3, 1000);
			
			Iterator<Integer> iter = list1.iterator();
			while (iter.hasNext())
			{
				System.out.println("the list is now " + iter.next());
			}
			
			list2.addAll(list1);

			Iterator<Integer> iter1 = list2.iterator();
			while (iter1.hasNext())
			{
				System.out.println(iter1.next());
			}
			System.out.println("the size of list2 is now " + list2.size());
			
					
			 System.out.println("remove the first integer" + list2.remove(1));
			
			System.out.println(list2.lastIndexOf(10));
			System.out.println(list2.indexOf(1500));
			System.out.println("the size of list2 is now " + list2.size());
			
			//to array 
			
			Integer a1[]= list2.toArray(new Integer[list2.size()]);
			//int sum=0;
			
			for(Integer i: a1) 
			System.out.println("content is " + '[' + i + ']');
		
	}
	public static void main(String[] args) {
		
		ListExample li = new ListExample();
		li.Array();
		
	}

}
