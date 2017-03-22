package com.java.programs.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class EnumList {

	public void enum_example(){
		
		List <String> month = new ArrayList<String>();
		
		
		month.add("January");
		month.add("February");
		month.add("march");
		month.add("April");
		month.add("May");
		month.add("June");
		month.add("July");
		month.add("August");
		month.add("Sept");
		month.add("October");
		month.add("November");
		month.add("December");
		
		Enumeration<String> enu = Collections.enumeration(month);
		
		while(enu.hasMoreElements()){
			
			System.out.println(enu.nextElement());
		}
	}
	public static void main(String[] args) {
		
		EnumList list = new EnumList();
		list.enum_example();

	}

}
